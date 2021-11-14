package faeterj.vavatur.negocio;

import java.time.LocalDate;

public class Linha {

	private String origem;
	private String destino;
	private LocalDate horaEmbarque;
	private LocalDate HoraPartida;

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDate getHoraEmbarque() {
		return horaEmbarque;
	}

	public void setHoraEmbarque(LocalDate horaEmbarque) {
		this.horaEmbarque = horaEmbarque;
	}

	public LocalDate getHoraPartida() {
		return HoraPartida;
	}

	public void setHoraPartida(LocalDate horaPartida) {
		HoraPartida = horaPartida;
	}

}
