package PO;

public class AviãoTeste {
	public static void main (String args[])
	{
		Avião avião = new Avião ();
		avião.cor = "azul";
		avião.passageiros = 200;
		avião.tamanho = 20;
		avião.velocidadeMax = 200;
		avião.peso = 1.200;
		avião.ligar();
		avião.status();
		avião.decolar();
		
	}
}
