package webapp;

import static spark.Spark.*;

public class App {
	public static void main(String[] args) {
		get("/", Views.paginaInicial);
		post("/submissao", Views.submissao);
	}
}