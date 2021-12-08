package Lista1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		float c, dist, imp, cc;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com o valor de Fábrica do veículo: ");
		c = ler.nextInt();
		dist=(float) (c*0.28);
		imp=(float) (c*0.45);
		cc=c+dist+imp;
		
		System.out.println("\nO valor de venda do veículo é: " + cc);

	}

}
