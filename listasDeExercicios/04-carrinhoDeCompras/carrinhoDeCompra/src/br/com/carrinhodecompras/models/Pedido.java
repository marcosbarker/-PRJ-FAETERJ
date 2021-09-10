package br.com.carrinhodecompras.models;

import java.util.ArrayList;

public class Pedido {
	private ArrayList<ItemCarrinho> informacoes;

	public Pedido() {
	}

	public Pedido(ArrayList<ItemCarrinho> informacoes) {
		super();
		this.informacoes = informacoes;
	}
	public ArrayList<ItemCarrinho> getInformacoes() {
		return informacoes;
	}
	public void setInformacoes(ArrayList<ItemCarrinho> informacoes) {
		this.informacoes = informacoes;
	}

	@Override
	public String toString() {
		Object produtos = "";
		Double total = 0.0;
		for (ItemCarrinho itemCarrinho : informacoes) {
			total += ( itemCarrinho.getQuantidade() * itemCarrinho.getProduto().getPreco());
			produtos += itemCarrinho.getProduto().getNome() + " " + itemCarrinho.getQuantidade()
			+ " R$ " + (itemCarrinho.getProduto().getPreco() * itemCarrinho.getQuantidade()) + "\n";
		}
		return "\nProdutos        Quant   Valor\n\n" + produtos.toString()
					 + "\nTotal: R$ " + total.toString() + "\n";
	}
}
