package Lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
			int idade,ano, dias, mes;
			Scanner ler = new Scanner(System.in);
			System.out.print("Insira a sua idade em anos: ");
			ano = ler.nextInt();
			System.out.print("Insira a sua idade em meses: ");
			mes = ler.nextInt();
			System.out.print("Insira a sua idade em dias: ");
			dias = ler.nextInt();
			
			idade=ano*365+mes*30+dias;
			
			System.out.println("A sua idade em dias é: " + idade);

	}

}
