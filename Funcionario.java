package PO;

public class Funcionario {
	int idade;
	String nome;
	String experiencia;
	String nacionalidade;
	boolean vender;
	
	public void vender ()
	{
		vender = true;
	}
	public void NãoVendeu()
	{
		vender = false;
	}
	public void promoção ()
	{
		if (vender== true)
			System.out.println("Funcionarie " + this.nome + " foi promovide !" );
		else
			System.out.println("Funcionarie " + this.nome + "não foi promovide.");
	}
	public void status ()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade + " anos");
		System.out.println("Possui experiência: " + this.experiencia);
		System.out.println("Nacionalidade: " + this.nacionalidade);
	}

}
