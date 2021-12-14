package PO;

public class Patinete {
	int rodas;
	String material;
	String marca;
	String cor;
	boolean comprar;
	
	public void comprar()
	{
		comprar = true;
	}
	public void nãoComprar()
	{
		comprar = false;
	}
	public void andar()
	{
		if (comprar == true)
			System.out.println("Você pode andar de patinete !");
		else
			System.out.println("Você não tem patinete e por isso não pode andar de patinete.");
	}
	public void status()
	{
		System.out.println("O patinete possui " + this.rodas + " rodas");
		System.out.println("O patinete é da cor " + this.cor);
		System.out.println("O patinete é da marca  " + this.marca);
		System.out.println("O patinete é feito de " + this.material);
	}

}
