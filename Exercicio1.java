package la�osDecis�o;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int N1,N2,N3,maiorNumero,numero;
		
		System.out.print("Insira o primeiro n�mero inteiro: ");
		N1 = ler.nextInt();
		
		System.out.print("Insira o segundo n�mero inteiro: ");
		N2 = ler.nextInt();
		
		System.out.print("Insira o terceiro n�mero inteiro: ");
		N3 = ler.nextInt();
		
		
		if (N1<N2)
		{
			if (N2<N3)
			{
				System.out.println("O maior n�meor �: " + N3);
			}
			else if (N3<N2 && N3>N1)
			{
				System.out.println("O maior n�meor �: " + N2);
			}
			else if (N3<N1)
			{
				System.out.println("O maior n�meor �: "+  N2 );
			}
		}
		
		else if (N2<N1)
		{
			if(N1<N3)
			{
				System.out.println("O maior n�meor �: " + N3 );
			}
			else if (N3<N1 && N3>N2)
			{
				System.out.println("O maior n�meor �: " +  N1 );
			}
			else if (N3<N2)
			{
				System.out.println("O maior n�meor �: " + N1 );
			}
		}
		

	}

}
