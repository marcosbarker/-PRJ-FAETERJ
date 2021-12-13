package br.org.serratec.backend.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import br.org.serratec.backend.model.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Long>{
	public Atividade findByNome(String nome); 
}
