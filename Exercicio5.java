package Lista1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		float nota1,nota2,nota3,media;
		
		Scanner ler = new Scanner (System.in);
		System.out.print("Insira a sua Nota1: ");
		nota1 = ler.nextInt();
		
		System.out.print("Insira a sua Nota2: ");
		nota2 = ler.nextInt();
		
		System.out.print("Insira a sua Nota3: ");
		nota3 = ler.nextInt();
		
		media = ((((nota1 * 2) + (nota2 *3) + (nota3 * 5)) / 10));
		
		System.out.println("A Sua média final é: " + media);

	}

}
