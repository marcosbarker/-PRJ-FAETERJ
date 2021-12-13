package br.org.serratec.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.backend.model.Aluno;
import br.org.serratec.backend.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	
	public Aluno inserir(Aluno aluno) {
		Aluno a = new Aluno();
		a.setNome(aluno.getNome());
		a.setEmail(aluno.getEmail());
		a.setMatricula(aluno.getMatricula());
		a.setNota(aluno.getNota());
		a.setAtividade(aluno.getAtividade());
		alunoRepository.save(a);
		return a;
	}
}
