package br.org.serratec.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.backend.model.Aluno;
import br.org.serratec.backend.repository.AlunoRepository;
import br.org.serratec.backend.service.AlunoService;

@RestController
@RequestMapping("/alunos")
@CrossOrigin("http://localhost:3000")
public class AlunoController {

	@Autowired
	private AlunoService alunoService;

	@Autowired
	private AlunoRepository alunoRepository;

	@PostMapping
	public ResponseEntity<Object> adicionar(@RequestBody Aluno aluno) {
		try {
			Aluno a = alunoService.inserir(aluno);
			return ResponseEntity.ok(a);
		} catch (Exception e) {
			return ResponseEntity.unprocessableEntity().body(e.getMessage());
		}
	}

	@GetMapping("{matricula}")
	public ResponseEntity<List<Aluno>> buscarPorMatricula(@PathVariable Integer matricula) {

		List<Aluno> cMatricula = alunoRepository.findByMatricula(matricula);
		return ResponseEntity.ok(cMatricula);

	}
}
