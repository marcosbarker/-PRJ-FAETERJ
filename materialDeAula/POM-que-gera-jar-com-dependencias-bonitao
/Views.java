package empresa;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import spark.Route;

public class Views {

	public static Route paginaInicial = (requisicao, resposta) -> {
		return "<html>\n"
				+ "<body>\n"
				+ "    <h1>Submissão de algo</h1>\n"
				+ "    \n"
				+ "    <form method=\"post\" action=\"/submissao\">\n"
				+ "        <p>Nome: <input type=\"text\" name=\"nome\"></p>\n"
				+ "        <p>Email: <input type=\"email\" name=\"email\"></p>\n"
				+ "        <p>Telefone: <input type=\"phone\" name=\"telefone\"></p>\n"
				+ "        <p>Documentação: </p>\n"
				+ "        <button type=\"submit\">Enviar</button>\n"
				+ "    </form>\n"
				+ "</body>\n"
				+ "</html>\n"
				+ "";
	};
	
	public static Route submissao = (requisicao, resposta) -> {
		String nome = requisicao.queryParams("nome");		
		String email = requisicao.queryParams("email");
		String telefone = requisicao.queryParams("telefone");
		
		// adiciona uma linha no arquivo dados.csv
		PrintWriter w = new PrintWriter(
				Files.newBufferedWriter(Path.of("dados.csv"), 
						StandardOpenOption.CREATE, StandardOpenOption.APPEND)
		);
		w.printf("%s;%s;%s\n", nome, email, telefone);
		
		return "(ok)";
	};
	
}
