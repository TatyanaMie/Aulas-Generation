package LaçosRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int idade = 0, menor = 0,maior = 0;
		
		while (idade>-99)
		{
			System.out.print("Insira a sua idade: ");
			idade = ler.nextInt();
					
			if (idade<21 && idade>0)
			{
				menor = menor + 1;
			}
			
			if (idade>50)
			{
				maior = maior + 1;
			}
		}
			
			System.out.println("O total de pessoas com menos de 21 anos é: " + menor);
			System.out.println("O total de pessoas com mais de 50 anos é: " + maior);
		

	}

}
