package VetorMatriz;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vet [] = new int [10];
		int n, soma = 0,media = 0,maiorPont = 0,cont = 0;
		
		for(n=0;n<10;n++)
		{
			System.out.print("Insira o valor do lançamento: ");
			vet[n] = ler.nextInt();
		}
		
		for(n=0;n<10;n++)
		{	System.out.print(vet[n] + "\t");
			soma += vet[n];
			media = soma/10;
			
			if  (vet[n]>maiorPont)
			{
				maiorPont = vet[n];
			}
			
		}
		
		for(n=0;n<10;n++)
		{
			if (vet[n]==maiorPont)
			{
				cont ++;
			}
		}
		
		System.out.println("\n" + "A maior pontuação foi: " + maiorPont + ", que ocorreu " + cont + " vezes");
		System.out.println("A média aritmética dos lançamentos é: " + media);
		
		

	}

}
