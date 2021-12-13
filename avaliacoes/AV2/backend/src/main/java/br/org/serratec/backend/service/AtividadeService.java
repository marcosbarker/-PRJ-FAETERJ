package br.org.serratec.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.backend.model.Atividade;
import br.org.serratec.backend.repository.AtividadeRepository;

@Service
public class AtividadeService {
	
	@Autowired
	private AtividadeRepository atividadeRepository;
	
	public Atividade inserir(Atividade atividade) {
		Atividade a = new Atividade();
		a.setNome(atividade.getNome());
		a.setData(atividade.getData());
		a.setNotaMax(atividade.getNotaMax());
		a.setEnviado(atividade.isEnviado());
		atividadeRepository.save(a);
		return a;
	}
	public Atividade att(Atividade atividade) {
		Atividade a = atividadeRepository.findById(atividade.getId()).get();
		a.setNome(atividade.getNome());
		a.setData(atividade.getData());
		a.setNotaMax(atividade.getNotaMax());
		a.setEnviado(atividade.isEnviado());
		a.setEnviado(atividade.isEnviado());
		atividadeRepository.save(a);
		return a;
	}
}
