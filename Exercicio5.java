package La�osRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero,soma=0;
		
		do
		{
			System.out.println("Insira um n�mero: ");
			numero = ler.nextInt();
			
			soma = soma + numero;
		}
		while (numero!=0);
		
		
		System.out.println("A soma dos n�meoros �: " + soma);
		

	}

}
