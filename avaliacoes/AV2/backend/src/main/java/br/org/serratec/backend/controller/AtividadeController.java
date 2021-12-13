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

import br.org.serratec.backend.model.Atividade;
import br.org.serratec.backend.repository.AtividadeRepository;
import br.org.serratec.backend.service.AtividadeService;

@RestController
@RequestMapping("/atividades")
@CrossOrigin("http://localhost:3000")
public class AtividadeController {
	
	@Autowired
	private AtividadeService atividadeService;
	
	@Autowired
	private AtividadeRepository  atividadeRepository;
	
	@PostMapping
	public ResponseEntity<Object> adicionar(@RequestBody Atividade atividade) {
		try {
			Atividade a = atividadeService.inserir(atividade);
			return ResponseEntity.ok(a);
		} catch (Exception e) {
			return ResponseEntity.unprocessableEntity().body(e.getMessage());
		}
	}
	
	@GetMapping
	public ResponseEntity<List<Atividade>> listar(){
		List<Atividade> atividades = atividadeRepository.findAll();
		return ResponseEntity.ok(atividades);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Atividade> listarId(@PathVariable Long id){
		Atividade atividades = atividadeRepository.findById(id).get();
		return ResponseEntity.ok(atividades);
	}

}
