package PO;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		ContaBancaria contaBancaria = new ContaBancaria ();
		contaBancaria.cpf = 369125236;
		contaBancaria.numero = 12364;
		contaBancaria.quantia = 5000;
		
		contaBancaria.status();
		contaBancaria.abrirConta();
		contaBancaria.sacar();
	
				

	}

}
