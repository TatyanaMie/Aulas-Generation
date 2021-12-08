package Lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int ano, dias, mes;
		Scanner ler = new Scanner(System.in);
		System.out.print("Insira a sua idade em dias: ");
		dias = ler.nextInt();
		
		ano = dias / 365;
		mes = dias / 30;
		
		System.out.println("A sua idade em dias é: " + dias + ",a sua idade em meses é: " + mes + ",a sua idade em anos é: " + ano);
		
	}

}
