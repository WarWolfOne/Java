package receita.produtos;

public class ProdutoShingLing extends Produto{

	public ProdutoShingLing(String nome, double preco) {
		super(nome, preco); //apontando classe abstrata.
	}

	@Override //sobrescrevendo metodo do pai.
	public double getPreco() {
		return this.preco*1.3; //adicionando taxa alfandegaria de 30%.
	}

}
