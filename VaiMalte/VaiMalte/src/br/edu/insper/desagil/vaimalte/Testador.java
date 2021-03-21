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
		Carrinho carrinho = new Carrinho();
		Produto produto1 = new Produto(4,"Banana", 2);
		Produto produto2 = new Produto(28, "Leite", 5);
		
		carrinho.insere(produto1);
		carrinho.insere(produto2);
		carrinho.insere(produto2);
		
		Caixa caixa = new Caixa();
		caixa.insereDesconto(produto1, 50);
		
		if (caixa.total(carrinho)== 11.00) {
			return true;
		}
	    return false;
	}

	public boolean testeE() {
		Carrinho carrinho = new Carrinho();
		Produto produto1 = new Produto(4,"Banana", 2);
		Produto produto2 = new Produto(28, "Leite", 5);
		
		carrinho.insere(produto1);
		carrinho.insere(produto1);
		carrinho.insere(produto2);
		
		Caixa caixa = new Caixa();
		caixa.insereDesconto(produto1, 50);
		
		if (caixa.total(carrinho)== 7.00) {
			return true;
		}
	    return false;
	}

}
