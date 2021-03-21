package br.edu.insper.desagil.vaimalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	
	private Map<Integer, Integer> dicionarioDescontos;

	public Caixa() {
		super();
		this.dicionarioDescontos = new HashMap<>();
	}
	
	public void insereDesconto (Produto produto, int desconto) {
		
		if ((desconto >= 1) && (desconto<=99)) {
			dicionarioDescontos.put(produto.getCodigo(),desconto);
			
		}
	}
	
	public double total (Carrinho carrinho) {
		double totalCarrinho=0.0;
		
		for (Pedido pedido: carrinho.getPedidos()) {
			if (dicionarioDescontos.containsKey(pedido.getProduto().getCodigo())) {
				double porcentagemDesconto = dicionarioDescontos.get(pedido.getProduto().getCodigo());
				totalCarrinho = totalCarrinho + (pedido.precoCheio() * (1- (porcentagemDesconto/100)));
			}
			else {
				totalCarrinho = totalCarrinho + pedido.precoCheio();
			}
		}
		totalCarrinho = Math.round(totalCarrinho*100.0)/100.0;
		return totalCarrinho;
	}

}

