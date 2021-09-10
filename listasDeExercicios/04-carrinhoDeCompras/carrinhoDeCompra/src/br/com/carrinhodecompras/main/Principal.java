package br.com.carrinhodecompras.main;

import br.com.carrinhodecompras.models.CarrinhoCompras;
import br.com.carrinhodecompras.models.ItemCarrinho;
import br.com.carrinhodecompras.models.ListaProdutos;
import br.com.carrinhodecompras.models.Pedido;
import br.com.carrinhodecompras.models.Produto;

public class Principal {

	public static void main(String[] args) throws Exception {
		ListaProdutos lp = new ListaProdutos();
		lp.add(new Produto("112233",   "Cel Redmi Note8", 1300.00));
		lp.add(new Produto("11223344", "Alexa Echo dot3", 210.00));

		CarrinhoCompras cc = new CarrinhoCompras();
		
		Produto p = lp.buscarPeloCodigoBarras("112233");
		cc.add(new ItemCarrinho(p, 1.0));
		Produto p1 = lp.buscarPeloCodigoBarras("11223344");
		cc.add(new ItemCarrinho(p1, 3.0));
		
		Pedido pedido = cc.fecharPedido();
		
		System.out.println(pedido.toString());
	}
}