package PO;

public class ProdutoEletrônicoTeste {

	public static void main(String[] args) {
		ProdutoEletrônico produtoEletrÔnico = new ProdutoEletrônico ();
		produtoEletrÔnico.bateria = 12;
		produtoEletrÔnico.camera = 20;
		produtoEletrÔnico.cor = "preto";
		produtoEletrÔnico.tamanho = 20;
		
		produtoEletrÔnico.status();
		produtoEletrÔnico.carregar();
		produtoEletrÔnico.ligação();
		
	}

}
