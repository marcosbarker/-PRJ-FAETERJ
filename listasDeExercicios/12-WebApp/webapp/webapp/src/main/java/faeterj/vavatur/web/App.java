package faeterj.vavatur.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import faeterj.vavatur.negocio.Bilhete;
import faeterj.vavatur.negocio.RepositorioDados;
import spark.Spark;

public class App {

	private static Connection conexao = null;
	private static RepositorioDados repositorioDados = null;

	public static void main(String[] args) throws SQLException {
		// inicio conexão
		System.out.println("conectando ao banco de dados...");
		conexao = DriverManager.getConnection("jdbc:postgresql://134.209.243.185:5432/vavatur", "vavatur", "gGgLqu");

		// construo o repositório de dados
		repositorioDados = new RepositorioDados(conexao);

		Spark.port(8080);
		System.out.println("registrando rotas...");
		Spark.get("/", (req, res) -> {
			return ViewUtil.renderiza("/index.html");
		});

		Spark.get("/checking", (req, res) -> {
			return ViewUtil.renderiza("/checking.html");
		});

		Spark.post("/localiza-bilhete", (req, res) -> {
			String codigoBilhete = req.queryParams("codigoBilhete");

			// verificar se o bilhete existe no banco de dados
			try {
				boolean existe = false;
				existe = repositorioDados.buscaBilhetePorCodigo(codigoBilhete) != null;
				if (existe) {
					res.redirect("/exibe-dados?bilhete=" + codigoBilhete);
					return "";
				} else {
					return "Bilhete não encontrado!";
				}
			} catch (Exception e) {
				return e.getClass().getName() + ": " + e.getMessage();

			}
		});

		Spark.get("/exibe-dados", (req, res) -> {
			try {
				String codigoBilhete = req.queryParams("bilhete");
				Bilhete b = repositorioDados.buscaBilhetePorCodigo(codigoBilhete);
				Map<String, Object> ctx = new HashMap<>();
				ctx.put("codigo", b.getCodigo());
				ctx.put("assento", b.getAssento());
				ctx.put("data", b.getDataMarcacao());
				ctx.put("passageiro", b.getPassageiro().getNome());
				ctx.put("cpf", b.getPassageiro().getCpf());
				ctx.put("origem", b.getLinha().getOrigem());
				ctx.put("destino", b.getLinha().getDestino());
				ctx.put("horaEmbarque", b.getLinha().getHoraEmbarque());
				ctx.put("horaPartida", b.getLinha().getHoraPartida());

				return ViewUtil.renderiza("/exibir-dados.html", ctx);

			} catch (Exception e) {
				return e.getClass().getName() + ": " + e.getMessage();
			}
		});

		System.out.println(String.format("Escutando na porta %d...", Spark.port()));
	}
}
