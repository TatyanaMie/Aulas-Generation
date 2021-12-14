package PO;

public class Avião {
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
			System.out.println("O avião decolou");
		}
		else {
			System.out.println("O avião não decolou");
		}
	}
	public void status()
	{
		System.out.println("O tamanho do avião é: " + this.tamanho + " metros");
		System.out.println("O número máximo de passageiros suportados é: " + this.passageiros + " passageiros");
		System.out.println("O peso do avião é: " + this.peso + " kg");
		System.out.println("A velocidade máxima do avião é: " + this.velocidadeMax + " km/h");
		System.out.println("A cor do avião é: " + this.cor);
		
	}
	
	

}
