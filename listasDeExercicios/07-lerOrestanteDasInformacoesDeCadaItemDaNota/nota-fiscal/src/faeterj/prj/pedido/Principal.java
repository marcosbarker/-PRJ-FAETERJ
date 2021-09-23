package faeterj.prj.pedido;
import java.util.List;
import javax.swing.JOptionPane;

public class Principal {
	private static final String CAMINHO_ARQUIVO = "nota-fiscal.txt";
	public static void main(String[] args) {
		CarregadorDeItensDePedido cip = 
		new CarregadorDeItensDePedido(CAMINHO_ARQUIVO);
		
		List<ItemPedido> itens = null;

		try {
			itens = cip.carregarItens();
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		for (ItemPedido i : itens) {
			System.out.println(i);
		}
	}
}