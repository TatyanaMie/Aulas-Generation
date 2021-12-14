package PO;

public class patineteTeste {

	public static void main(String[] args) {
		Patinete patinete = new Patinete ();
		patinete.cor = "prata";
		patinete.marca = "Decathon";
		patinete.material = "ferro";
		patinete.rodas = 2;
		patinete.comprar();
		patinete.status();
		patinete.andar();
	}

}
