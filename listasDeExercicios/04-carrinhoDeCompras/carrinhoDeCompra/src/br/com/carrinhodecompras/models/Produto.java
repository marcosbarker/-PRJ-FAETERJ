package br.com.carrinhodecompras.models;

public class Produto {
	private String codigoBarras;
	private String nome;
	private Double preco;
	
	public Produto() {
	}
	public Produto(String codigoBarras, String nome, Double preco) {
		super();
		this.codigoBarras = codigoBarras;
		this.nome = nome;
		this.preco = preco;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}	
}