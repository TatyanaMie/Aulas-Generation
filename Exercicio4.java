package VetorMatriz;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int mat [][] = new int [3][3], l, c, soma=0, diagonal = 0;
		Scanner ler = new Scanner(System.in);
		
		for (l=0;l<3;l++)
		{
			for (c=0;c<3;c++)
			{
				System.out.print("Insira um número: ");
				mat [l][c] = ler.nextInt();
			}
		}
		for (l=0;l<3;l++)
		{
			for (c=0;c<3;c++)
			{
				soma += mat [l][c];
			}
		}
		for(l=0;l<3;l++)
		{
			for (c=0;c<3;c++)
			{
				diagonal += mat[l][l];
			}
		}
		
		System.out.println("A soma de todos os valores da matriz é: " + soma);
		System.out.println("A soma da diagonal principal é: " + diagonal);
	}

}
