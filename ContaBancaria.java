package PO;

public class ContaBancaria {
	int numero;
	int quantia;
	int cpf;
	boolean abrirConta;
	
	public void abrirConta()
	{
		abrirConta = true;
	}
	public void n�oTemConta()
	{
		abrirConta = false;
	}
	public void sacar()
	{
		if (abrirConta == true)
			System.out.println("Pode sacar o dinheiro!");
		else
			System.out.println("Voc� n�o possui uma conta, por isso n�o � poss�vel sacar o dinheiro.");
	}
	public void status()
	{
		System.out.println("O seu cpf �: " + this.cpf);
		System.out.println("O n�mero da sua conta �: " + this.numero);
		System.out.println("A quantia que ser� sacada � de: " + this.quantia + " reais");
	}

}
