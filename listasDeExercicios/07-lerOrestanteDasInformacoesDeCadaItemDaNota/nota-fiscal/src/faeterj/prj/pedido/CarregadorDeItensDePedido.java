package faeterj.prj.pedido;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarregadorDeItensDePedido {
	private String nomeArquivo;
	public CarregadorDeItensDePedido(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	public List<ItemPedido> carregarItens() throws IOException, ParseException {
		FileInputStream fileInput = new FileInputStream(this.nomeArquivo);
		Charset codificacaoDeCaracteres = Charset.forName("UTF-8");
		InputStreamReader readerInput = 
		new InputStreamReader(fileInput, codificacaoDeCaracteres);
		Scanner sc = new Scanner(readerInput);
		List<ItemPedido> itens = new ArrayList<ItemPedido>();
		while (sc.hasNext()) {
			ItemPedido ip = new ItemPedido();
			ip.carregar(sc);
			itens.add(ip);
		}
		return itens;
	}
}