package br.edu.insper.desagil.vaimalte;

public class Testador {
	public boolean testeA() {
		
		Carrinho carrinho = new Carrinho ();
		Caixa caixa = new Caixa ();

		if (caixa.total(carrinho) == 0) {
			return true;
		}
	    	return false;
	}

	public boolean testeB() {
		Carrinho carrinho = new Carrinho();
		Produto produto = new Produto(4,"Banana",2);
		
		carrinho.insere(produto);
		
		Caixa caixa = new Caixa();
		
		if (caixa.total(carrinho) == 2.00) {
			return true;
		}
		return false;
	}

	public boolean testeC() {
		Carrinho carrinho = new Carrinho();
		Produto produto = new Produto(4,"Banana",12.00);
		
		carrinho.insere(produto);
		
		Caixa caixa = new Caixa();
		caixa.insereDesconto(produto, 20);
		
		if (caixa.total(carrinho)== 9.60) {
			return true;
		}
		return false;
	}

	public boolean testeD() {
		return false;
	}

	public boolean testeE() {
		return false;
	}

}
