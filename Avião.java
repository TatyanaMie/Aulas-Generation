package PO;

public class Avi�o {
	String cor;
	double tamanho;
	int passageiros;
	double peso;
	int velocidadeMax;
	boolean ligar;
	
	public void ligar()
	{
		ligar = true;
	}
	public void desligar()
	{
		ligar = false;
	}
	public void decolar ()
	{
		if(ligar==true)
		{
			System.out.println("O avi�o decolou");
		}
		else {
			System.out.println("O avi�o n�o decolou");
		}
	}
	public void status()
	{
		System.out.println("O tamanho do avi�o �: " + this.tamanho + " metros");
		System.out.println("O n�mero m�ximo de passageiros suportados �: " + this.passageiros + " passageiros");
		System.out.println("O peso do avi�o �: " + this.peso + " kg");
		System.out.println("A velocidade m�xima do avi�o �: " + this.velocidadeMax + " km/h");
		System.out.println("A cor do avi�o �: " + this.cor);
		
	}
	
	

}
