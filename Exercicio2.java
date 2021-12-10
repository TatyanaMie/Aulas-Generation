package LaçosRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int x;
		
		System.out.println("Os números pares são: ");
		for (x=0;x<=10;x++)
		{
			if (x%2==0)
			{
				System.out.print(x + "\t");
			}
		}
		
		System.out.println("\n" + "Os números ímpares são: ");
		
		for (x=0;x<=10;x++)
		{
			if (x%2!=0)
			{
				System.out.print(x + "\t");
			}
		}
	

	}

}
