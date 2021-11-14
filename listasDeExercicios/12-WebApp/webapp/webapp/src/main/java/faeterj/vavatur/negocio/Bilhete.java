package faeterj.vavatur.negocio;

import java.time.LocalDate;

public class Bilhete {

	private String codigo;
	private String assento;
	private Passageiro passageiro;
	private Linha linha;
	private LocalDate dataMarcacao;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAssento() {
		return assento;
	}

	public void setAssento(String assento) {
		this.assento = assento;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public Linha getLinha() {
		return linha;
	}

	public void setLinha(Linha linha) {
		this.linha = linha;
	}

	public LocalDate getDataMarcacao() {
		return dataMarcacao;
	}

public void setDataMarcacao(LocalDate dataMarcacao) {
		this.dataMarcacao = dataMarcacao;
	}




	@Override
	public String toString() {
		return "Bilhete [codigo=" + codigo + ", assento=" + assento + ", passageiro=" + passageiro + ", linha=" + linha
				+ ", dataMarcacao=" + dataMarcacao + "]";
	}
	

}
