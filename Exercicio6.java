package La�osRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int numero, soma =0, media = 0, contador = 0;
		
		do 
		{
			System.out.print("Insira um n�mero: ");
			numero = ler.nextInt();
			
			if (numero%3==0 && numero!=0)
			{
				soma = soma + numero;
				contador++;
				media = soma/contador;
				
			}
			
		}
		while (numero!=0);
		
		System.out.println("A m�dia dos n�meros multiplos de 3 �: " + media);
		System.out.println("A quantidade de numeros inseridos �: " + contador + "A soma �: " + soma);
			
			

	}

}
