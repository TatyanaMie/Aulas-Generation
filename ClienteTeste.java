package PO;

public class ClienteTeste {
	public static void main (String args[])
	{
		cliente cliente1 = new cliente ();
		cliente1.idade = 20;
		cliente1.altura = 1.60;
		cliente1.peso = 60;
		cliente1.sacar();
		cliente1.status();
		cliente1.comprar();
	}
}
