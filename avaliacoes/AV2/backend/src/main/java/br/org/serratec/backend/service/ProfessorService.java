package br.org.serratec.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.backend.model.Professor;
import br.org.serratec.backend.repository.ProfessorRepository;


@Service
public class ProfessorService {
	@Autowired
	private ProfessorRepository professorRepository;
	
	public Professor inserir(Professor professor) {
		Professor p = new Professor();
		p.setNome(professor.getNome());
		p.setNomeTurma(professor.getNomeTurma());
		professorRepository.save(p);
		return p;
	}
}
