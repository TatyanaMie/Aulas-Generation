package PO;

public class FuncionarioTeste {
	public static void main (String args[])
	{
		Funcionario funcion�rio = new Funcionario ();
		funcion�rio.experiencia = "Sim";
		funcion�rio.idade = 25;
		funcion�rio.nacionalidade = "brasileire";
		funcion�rio.nome = "Gabiela";
		funcion�rio.status();
		funcion�rio.vender();
		funcion�rio.promo��o();
		
	}
}
