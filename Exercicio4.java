package LaçosRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade,sexo,x = 0,temperamento, Ntemp = 0,MulNerv = 0,HomAgr = 0, OutCal = 0, Ner40 = 0, Cal18 = 0;
		
		
		while (x<150)
		{	
			System.out.print("Dados da pessoa numero: ");
			x = ler.nextInt();
			
			System.out.print("Insira a sua idade:");
			idade = ler.nextInt();
			
			System.out.print("Das opções: 	1-feminino	2-masculino	3-Outros. Escolha o número que representa o seu sexo: ");
			sexo = ler.nextInt();
			
			System.out.print("Das opções 	1-calma 	2-nervosa	3-agressiva. Escolha o número que mais te repredenta: ");
			temperamento = ler.nextInt();
			
			if (temperamento == 1)
			{
				Ntemp = Ntemp + 1;
			}
			
			if (temperamento ==2 && sexo == 1)
			{
				MulNerv = MulNerv + 1;
			}
			if (temperamento == 3 && sexo == 2)
			{
				HomAgr = HomAgr + 1;
			}
			if (temperamento == 1 && sexo == 3)
			{
				OutCal = OutCal + 1;
			}
			if (temperamento == 2 && idade>40)
			{
				Ner40 = Ner40 + 1;
			}
			if ( temperamento == 1 && idade<18)
			{
				Cal18 = Cal18 + 1;
			}
		}
		
		System.out.println("O número de pessoas calmas é: " + Ntemp);
		System.out.println("O número de mulheres nervosas é: " + MulNerv);
		System.out.println("O número de homens agresisvos é: " + HomAgr);
		System.out.println("O númeor de outros calmos é: " + OutCal);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + Ner40);
		System.out.println("O númeor de pessoas calmas com menos de 18 anos é:" + Cal18);
		
	}

}
