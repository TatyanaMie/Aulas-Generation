package laçosDecisão;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int N1,N2,N3;
		
		System.out.print("Insira o primeiro número: ");
		N1 = ler.nextInt();
		
		System.out.print("Insira o segundo número: ");
		N2 = ler.nextInt();
		
		System.out.print("Insira o terceiro númeoro: ");
		N3 = ler.nextInt();
		
		if (N1<N2)
		{
			if (N2<N3)
			{
				System.out.println("A ordem crescente é: " + N1 + "-" + N2 + "-" + N3);
			}
			else if (N3<N2 && N3>N1)
			{
				System.out.println("A ordem crescente é: " + N1 + "-" + N3 + "-" + N2);
			}
			else if (N3<N1)
			{
				System.out.println("A ordem é: " + N3 + "-" + N1 + "-" + N2 );
			}
		}
		
		else if (N2<N1)
		{
			if(N1<N3)
			{
				System.out.println("A ordem crescente é: " + N2 + "-" + N1 + "-" + N3 );
			}
			else if (N3<N1 && N3>N2)
			{
				System.out.println("A ordem crescente é: " + N2 + "-" + N3 + "-" + N1 );
			}
			else if (N3<N2)
			{
				System.out.println("A ordem crescente é:" + N3 + "-" + N2 + "-" + N1 );
			}
		}
		

	}

}
