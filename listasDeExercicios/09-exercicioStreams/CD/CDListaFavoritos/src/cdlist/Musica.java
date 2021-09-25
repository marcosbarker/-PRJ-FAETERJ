package cdlist;

public class Musica {
	
	private String nome;
	private int estrelas;
	
	public Musica(String nome, int estrelas) {
		this.nome = nome;
		this.estrelas = estrelas;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstrelas() {
		return estrelas;
	}

	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}
	
	public String toString() {
		String s = "Avaliação: ";
		for (int i = 0;i < estrelas; i++) {
			s +=  " ⭐";
			
		}		
		return "\n"+ this.nome + s + "\n";
	}
}