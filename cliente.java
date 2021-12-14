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
	public void nãoSacar()
	{
		sacar = false;
	}
	public void comprar()
	{
		if(sacar==true)
			System.out.println("O cliente realizou uma compra!");
		else
			System.out.println("Não foi realizada compra.");
	}
	public void nãoComprou()
	{
		comprar = false;
	}
	
	public void status()
	{
		System.out.println("A idade do cliente é: " + this.idade);
		System.out.println("O peso do cliente é: " + this.peso);
		System.out.println("A altura do cliente é: " + this.altura);
	}
}
