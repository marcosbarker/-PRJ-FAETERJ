package biblioteca;
import java.time.LocalDate;
public class Livro {
	private String ISBN;
	private String autor;
	private String titulo;
	private LocalDate dataPublicacao;
		
	public Livro(String iSBN, String autor, 
	String titulo, LocalDate dataPublicacao) {
		super();
		ISBN = iSBN;
		this.autor = autor;
		this.titulo = titulo;
		this.dataPublicacao = dataPublicacao;
	}
	
	public Livro() {
	}
	public String getISBN() {
		return ISBN;
	}
		public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
		public String getAutor() {
		return autor;
	}
		public void setAutor(String autor) {
		this.autor = autor;
	}
		public String getTitulo() {
		return titulo;
	}
		public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
		public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}
		public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
}