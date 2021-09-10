package br.com.carrinhodecompras.models;

import java.util.ArrayList;

public class CarrinhoCompras {
	private ArrayList<ItemCarrinho> itemCarrinho = new ArrayList<ItemCarrinho>();

	public CarrinhoCompras() {
	}

	public ArrayList<ItemCarrinho> getItemCarrinho() {
		return itemCarrinho;
	}
	public void setItemCarrinho(ArrayList<ItemCarrinho> itemCarrinho) {
		this.itemCarrinho = itemCarrinho;
	}
	public void add(ItemCarrinho item) {
		itemCarrinho.add(item);
	}
	public Pedido fecharPedido() {
		return new Pedido(itemCarrinho);
	}
}