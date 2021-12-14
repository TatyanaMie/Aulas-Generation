package PO;

public class PacienteTeste {
	public static void main (String agras[])
	{
		Paciente paciente = new Paciente ();
		paciente.nome = "Patricia";
		paciente.idade = 19;
		paciente.tipo = "febre";
		
		paciente.status();
		paciente.resultadoNegativo();
		paciente.sair();
	}
}
