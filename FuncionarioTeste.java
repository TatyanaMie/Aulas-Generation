package PO;

public class FuncionarioTeste {
	public static void main (String args[])
	{
		Funcionario funcionário = new Funcionario ();
		funcionário.experiencia = "Sim";
		funcionário.idade = 25;
		funcionário.nacionalidade = "brasileire";
		funcionário.nome = "Gabiela";
		funcionário.status();
		funcionário.vender();
		funcionário.promoção();
		
	}
}
