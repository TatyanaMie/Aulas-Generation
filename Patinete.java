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
	public void n�oComprar()
	{
		comprar = false;
	}
	public void andar()
	{
		if (comprar == true)
			System.out.println("Voc� pode andar de patinete !");
		else
			System.out.println("Voc� n�o tem patinete e por isso n�o pode andar de patinete.");
	}
	public void status()
	{
		System.out.println("O patinete possui " + this.rodas + " rodas");
		System.out.println("O patinete � da cor " + this.cor);
		System.out.println("O patinete � da marca  " + this.marca);
		System.out.println("O patinete � feito de " + this.material);
	}

}
