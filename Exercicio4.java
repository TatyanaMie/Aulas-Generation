package la�osDecis�o;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int N,raiz,elevado;
		
		System.out.print("Insira um n�mero inteiro: ");
		N = ler.nextInt();
		
		if (N%2==0)
		{
			raiz = (int) Math.sqrt(N);
			System.out.println("O n�meor � par, e a raiz quadrada dele � " + raiz);
		}
		
		else 
		{
			elevado = (int) Math.pow(N,2);
			System.out.println("O n�mero � �mpar, e se for elevado ao quadrado o resultado � " + elevado);
		}

	}

}
