package PO;

public class ProdutoEletr�nicoTeste {

	public static void main(String[] args) {
		ProdutoEletr�nico produtoEletr�nico = new ProdutoEletr�nico ();
		produtoEletr�nico.bateria = 12;
		produtoEletr�nico.camera = 20;
		produtoEletr�nico.cor = "preto";
		produtoEletr�nico.tamanho = 20;
		
		produtoEletr�nico.status();
		produtoEletr�nico.carregar();
		produtoEletr�nico.liga��o();
		
	}

}
