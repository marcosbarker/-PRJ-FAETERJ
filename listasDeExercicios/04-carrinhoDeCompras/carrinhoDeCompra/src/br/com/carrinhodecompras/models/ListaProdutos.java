package br.com.carrinhodecompras.models;

import java.util.ArrayList;

public class ListaProdutos {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();

	public ListaProdutos() {
	}

	public ListaProdutos(ArrayList<Produto> produtos) {
		super();
		this.produtos = produtos;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	public void add(Produto produto) {
		produtos.add(produto);
	}

	public Produto buscarPeloCodigoBarras(String codigo) throws Exception {

		for (Produto produto : produtos) {
			if (produto.getCodigoBarras().equals(codigo)) {
				return produto;
			}
		}
		new Exception("Não encontrado");
		return null;
	}
}
