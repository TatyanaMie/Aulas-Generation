package PO;

public class Paciente {
	String nome;
	int idade;
	String tipo;
	boolean resultadoNegativo;
	
	public void resultadoNegativo()
	{
		resultadoNegativo = true;
	}
	public void resultadoPositivo()
	{
		resultadoNegativo = false;
	}
	public void sair ()
	{
		if (resultadoNegativo == true)
			System.out.println("Paciente " + this.nome + " pode ir para casa!");
		else
			System.out.println("Paciente " + this.nome + " não pode ir para casa.");
	}
	public void status()
	{
		System.out.println("Paciente: " + this.nome + ", de idade " + this.idade + " anos" + ", esta com " + this.tipo);
		
	}

}
