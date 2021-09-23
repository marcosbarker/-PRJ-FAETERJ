package biblioteca;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Acervo acervo = new Acervo();
		
		Livro l = new Livro();
		l.setAutor("Jose Saramago");
		l.setTitulo("Cem anos de solidão");
		l.setISBN("1234567890-987");
		l.setDataPublicacao(LocalDate.of(1980, 6, 15));
		Livro l1 = new Livro();
		l1.setAutor("J. R. R.");
		l1.setTitulo("O Senhor Dos Aneis");
		l1.setISBN("1234562687-125");
		l1.setDataPublicacao(LocalDate.of(1945, 4, 24));
				
		acervo.adicionarLivro(l1);
		acervo.adicionarLivro(l);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Endereço do arquivo: ");
		String arquivo = sc.next();
		sc.close();
		
		try {
			acervo.salvar(arquivo);
		} catch (IOException e) {
			System.out.println("salvo");
			e.printStackTrace();
		}
		try {
			acervo.carregar(arquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
