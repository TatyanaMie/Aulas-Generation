package POOHerança;

public class Estoque {
	private String nome;
	private int quantidade;
	
	public Estoque (String n, int q) {
		this.nome = n;
		this.quantidade = q;
	}
	
	public String toString() {
		return this.nome + " possui a quantidade: " + this.quantidade + " unidades.";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
}
