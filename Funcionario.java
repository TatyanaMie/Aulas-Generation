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
	public void N�oVendeu()
	{
		vender = false;
	}
	public void promo��o ()
	{
		if (vender== true)
			System.out.println("Funcionarie " + this.nome + " foi promovide !" );
		else
			System.out.println("Funcionarie " + this.nome + "n�o foi promovide.");
	}
	public void status ()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade + " anos");
		System.out.println("Possui experi�ncia: " + this.experiencia);
		System.out.println("Nacionalidade: " + this.nacionalidade);
	}

}
