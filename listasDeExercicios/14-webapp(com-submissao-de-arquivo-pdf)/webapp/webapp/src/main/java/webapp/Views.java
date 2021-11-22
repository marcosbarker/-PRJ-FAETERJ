package webapp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import javax.servlet.MultipartConfigElement;
import javax.servlet.http.Part;

import spark.Route;

public class Views {
	
	private static final String DADOS_PATH = "C:\\Users\\MarcosPauloMarquesCo\\Desktop\\mp\\webapp\\webapp\\dados.csv";
	private static final String UPLOAD_PATH = "C:\\Users\\MarcosPauloMarquesCo\\Desktop\\mp\\webapp\\webapp";

	public static Route paginaInicial = (requisicao, resposta) -> {
		return    "<html>\n" + "<body style=\"background-color:Tomato\">\n" + "<div align=\"center\">" 
				+ "<h1 style=\"background-color:DodgerBlue\">Formulario</h1>\n" + "    \n"
				+ "    <form method=\"post\" action=\"/submissao\" enctype=\"multipart/form-data\">\n"
				+ "        <p>Nome:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"nome\"></p>\n"
				+ "        <p>Email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"email\" name=\"email\"></p>\n"
				+ "        <p>Telefone:&nbsp;<input type=\"phone\" name=\"telefone\"></p>\n"
				+ "        <p>Documentação: <input type=\"file\" name=\"arquivo\"></p>\n" 
				+ "		   <button type=\"submit\">Enviar</button>\n"
				+ "    </form>\n" + "</div>" + "</body>\n" 
				+ "</html>\n" + "";
	};
	
	private static void salvarDados(String nome, String email, String telefone) throws IOException {
		try (PrintWriter w = new PrintWriter(
				Files.newBufferedWriter(Path.of(DADOS_PATH), 
						StandardOpenOption.CREATE, StandardOpenOption.APPEND)
				)) {
			
			w.printf("%s;%s;%s\n", nome, email, telefone);
		}
	}

	public static Route submissao = (requisicao, resposta) -> {
		requisicao.attribute("org.eclipse.jetty.multipartConfig", new MultipartConfigElement("/temp"));
		
		String nome = requisicao.queryParams("nome");
		String email = requisicao.queryParams("email");
		String telefone = requisicao.queryParams("telefone");
		salvarDados(nome, email, telefone);
		
		
		Part p = requisicao.raw().getPart("arquivo");
		byte[] conteudoDoArquivo = (p.getInputStream().readAllBytes());
		
		Path diretorio_arquivosUpload = Path.of(UPLOAD_PATH, "arquivosUpload");
		if (!Files.exists(diretorio_arquivosUpload)) {
			Files.createDirectories(diretorio_arquivosUpload);
		}
		
		Path destino = Path.of(diretorio_arquivosUpload.toString(), nome.toLowerCase().replaceAll(" ", "-") + ".pdf");		
		System.out.println("destino: " + destino);
		System.out.println("nome do aquivo enviado: " + p.getSubmittedFileName());
		
		OutputStream out = new FileOutputStream(destino.toFile());
		out.write(conteudoDoArquivo);
		out.close();		
	       
		return "<html>\n" + "<body style=\"background-color:Tomato\">\n" + "<div align=\"center\">" 
				+ "<h1 style=\"color:LightGray\">Formulario enviado com sucesso!</h1>\n"
				+ "</div>" + "</body>\n" + "</html>\n";
	};
}
