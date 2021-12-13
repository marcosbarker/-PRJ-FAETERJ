package br.org.serratec.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.backend.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	public List<Aluno> findByMatricula(Integer matricula);
}
