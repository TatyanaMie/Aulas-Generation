package PO;

public class ProdutoEletrônico {
	int tamanho;
	String cor;
	int bateria;
	int camera;
	boolean carregar;
	
	public void carregar()
	{
		carregar = true;
	}
	public void descarregado()
	{
		carregar = false;
	}
	public void ligação()
	{
		if(carregar = true)
		{
			System.out.println("Realizando a ligação!");
		}
		else
		{
			System.out.println("Recarregue o celular.");
		}
	}
	public void status()
	{
		System.out.println("O tamanho do celular é: " + this.tamanho + " cm");
		System.out.println("A cor é: " + this.cor);
		System.out.println("A bateria tem duração de: " + this.bateria + " horas");
		System.out.println("A cameraa tem: " + this.camera + " mp");
	
	}
}
