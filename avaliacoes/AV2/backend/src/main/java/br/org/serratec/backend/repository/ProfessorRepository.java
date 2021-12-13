package br.org.serratec.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import br.org.serratec.backend.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
