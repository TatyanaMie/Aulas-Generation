package La�osRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int x;
		
		System.out.println("Os n�meros pares s�o: ");
		for (x=0;x<=10;x++)
		{
			if (x%2==0)
			{
				System.out.print(x + "\t");
			}
		}
		
		System.out.println("\n" + "Os n�meros �mpares s�o: ");
		
		for (x=0;x<=10;x++)
		{
			if (x%2!=0)
			{
				System.out.print(x + "\t");
			}
		}
	

	}

}
