package PO;

public class cliente {
	int idade;
	int peso;
	double altura;
	boolean comprar;
	boolean sacar;
	
	public void sacar() 
	{
		sacar = true;
	}
	public void n�oSacar()
	{
		sacar = false;
	}
	public void comprar()
	{
		if(sacar==true)
			System.out.println("O cliente realizou uma compra!");
		else
			System.out.println("N�o foi realizada compra.");
	}
	public void n�oComprou()
	{
		comprar = false;
	}
	
	public void status()
	{
		System.out.println("A idade do cliente �: " + this.idade);
		System.out.println("O peso do cliente �: " + this.peso);
		System.out.println("A altura do cliente �: " + this.altura);
	}
}
