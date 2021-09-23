package biblioteca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Acervo {
	private ArrayList<Livro> livros;

	public Acervo() {
		livros = new ArrayList<>();
	}
	public List<Livro> getLivros() {
		return Collections.unmodifiableList(this.livros);
	}
	public void adicionarLivro(Livro livro) {
		this.livros.add(livro);
	}
	public void removerLivro(Livro livro) {
		this.livros.remove(livro);
	}
	public void salvar(String nomeArquivo) throws IOException {

		FileWriter fw = new FileWriter(nomeArquivo);
		PrintWriter pw = new PrintWriter(fw, true);
		for (Livro l : this.livros) {
			pw.printf("%s,%s,%s,%s\n", 
			l.getISBN(), l.getTitulo(), l.getAutor(), 
			l.getDataPublicacao().toString());
		}
		pw.close();
	}

	public void carregar(String nomeArquivo) throws IOException {
		BufferedReader leitura = 
		new BufferedReader(new FileReader(nomeArquivo));
		Scanner sc = new Scanner(leitura);
		while (sc.hasNextLine()) {
			String linha = sc.nextLine();
			if (!linha.isEmpty()) {
				String[] dado = linha.split(",");
				new Livro(dado[0], dado[1], dado[2], 
				LocalDate.parse(dado[3]));
				System.out.println("Código: " + dado[0] + 
				"\nAutor: " + dado[1] + "\nTítulo: " + dado[2] +
				"\nData: " + dado[3] + "\n\n\n");
   		}
			sc.close();
		}
	}
}