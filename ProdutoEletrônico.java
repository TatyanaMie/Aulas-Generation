package PO;

public class ProdutoEletr�nico {
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
	public void liga��o()
	{
		if(carregar = true)
		{
			System.out.println("Realizando a liga��o!");
		}
		else
		{
			System.out.println("Recarregue o celular.");
		}
	}
	public void status()
	{
		System.out.println("O tamanho do celular �: " + this.tamanho + " cm");
		System.out.println("A cor �: " + this.cor);
		System.out.println("A bateria tem dura��o de: " + this.bateria + " horas");
		System.out.println("A cameraa tem: " + this.camera + " mp");
	
	}
}
