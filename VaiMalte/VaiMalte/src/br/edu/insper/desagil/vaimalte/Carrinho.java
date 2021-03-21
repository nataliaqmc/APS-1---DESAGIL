package br.edu.insper.desagil.vaimalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List<Pedido> listaPedidos;

	public Carrinho() {
		super();
		this.listaPedidos = new ArrayList<>();
	}

	public List<Pedido> getPedidos() {
		return listaPedidos;
	}
	
	public void insere (Produto produto){
		boolean produtoNovo = true;
		for (Pedido pedido: listaPedidos) {
			if (pedido.getProduto() == produto) {
				pedido.incrementa();
				produtoNovo = false;
			}
		}
		if (produtoNovo == true) {
			Pedido p = new Pedido(produto);
			listaPedidos.add(p);
		}
	}
}

