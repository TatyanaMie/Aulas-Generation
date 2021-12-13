package VetorMatriz;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vet[] = new int [5];
		int x,maiorNumero=0;
		
		for (x=0;x<5;x++)
		{
			System.out.print("Digite um número: ");
			vet [x] = ler.nextInt();
		}
		for (x=0;x<5;x++)
		{
			System.out.print(vet[x] + "\t");
			if (vet[x]>maiorNumero)
			{
				maiorNumero=vet[x];
			}
			
		}
		System.out.println("\n" + "O maior número é: " + maiorNumero);
	
		
	}
}
