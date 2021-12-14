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
	public void nãoTemConta()
	{
		abrirConta = false;
	}
	public void sacar()
	{
		if (abrirConta == true)
			System.out.println("Pode sacar o dinheiro!");
		else
			System.out.println("Você não possui uma conta, por isso não é possível sacar o dinheiro.");
	}
	public void status()
	{
		System.out.println("O seu cpf é: " + this.cpf);
		System.out.println("O número da sua conta é: " + this.numero);
		System.out.println("A quantia que será sacada é de: " + this.quantia + " reais");
	}

}
