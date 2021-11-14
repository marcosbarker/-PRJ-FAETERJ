package webapp;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import spark.Route;

public class Views {

	public static Route paginaInicial = (requisicao, resposta) -> {
		return "<html>\n" + "<body style=\"background-color:Tomato\">\n" + "<div align=\"center\">" 
				+ "<h1 style=\"background-color:DodgerBlue\">Formulario</h1>\n" + "    \n"
				+ "    <form method=\"post\" action=\"/submissao\">\n"
				+ "        <p>Nome:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"nome\"></p>\n"
				+ "        <p>Email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"email\" name=\"email\"></p>\n"
				+ "        <p>Telefone:&nbsp;<input type=\"phone\" name=\"telefone\"></p>\n"
				+ "        <p>Documentação: </p>\n" + "        <button type=\"submit\">Enviar</button>\n"
				+ "    </form>\n" + "</div>" + "</body>\n" 
				+ "</html>\n" + "";
	};

	public static Route submissao = (requisicao, resposta) -> {
		String nome = requisicao.queryParams("nome");
		String email = requisicao.queryParams("email");
		String telefone = requisicao.queryParams("telefone");

		// adiciona uma linha no arquivo dados.csv
		try (PrintWriter w = new PrintWriter(
				Files.newBufferedWriter(Path.of("dados.csv"), StandardOpenOption.CREATE, StandardOpenOption.APPEND))) {
			w.printf("%s;%s;%s\n", nome, email, telefone);
		}
		return "<html>\n" + "<body style=\"background-color:Tomato\">\n" + "<div align=\"center\">" 
				+ "<h1 style=\"color:LightGray\">Formulario enviado com sucesso!</h1>\n"
				+ "</div>" + "</body>\n" + "</html>\n";
	};
}