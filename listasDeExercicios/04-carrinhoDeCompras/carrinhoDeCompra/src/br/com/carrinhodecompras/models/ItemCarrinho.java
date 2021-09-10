package br.com.carrinhodecompras.models;

public class ItemCarrinho {
	private Produto produto;
	private Double quantidade;

	public ItemCarrinho() {

	}

	public ItemCarrinho(Produto produto, Double quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
}