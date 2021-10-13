package receita.produtos;

public abstract class Produto {
	
	protected String nome;
	protected double preco;

	public Produto(String nome, double preco) { //Construtror 
		this.nome = nome;
		this.preco = preco;
	}
	public abstract double getPreco(); //Metodo para pegar dados na classe que extenderá.
	
	public String getNome() {
		return this.nome;
	}
	
}
