package br.org.serratec.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.org.serratec.backend.model.Professor;
import br.org.serratec.backend.repository.ProfessorRepository;
import br.org.serratec.backend.service.ProfessorService;

@RestController
@RequestMapping("/professor")
@CrossOrigin("http://localhost:3000")
public class ProfessorController {
	
	@Autowired
	private ProfessorRepository professorRepository;
	
	@Autowired
	private ProfessorService professorService;
	
	@PostMapping
	public ResponseEntity<Object> adicionar(@RequestBody Professor professor) {
		try {
			Professor p = professorService.inserir(professor);
			return ResponseEntity.ok(p);
		} catch (Exception e) {
			return ResponseEntity.unprocessableEntity().body(e.getMessage());
		}
	}
	
	@GetMapping
	public ResponseEntity<List<Professor>> listar(){
		List<Professor> prof = professorRepository.findAll();
		return ResponseEntity.ok(prof);
	}
}
