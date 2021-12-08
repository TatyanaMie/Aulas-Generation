package Lista1;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		float x1, x2, y1, y2, d;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira um valor para X1: ");
		x1 = ler.nextInt();
		
		System.out.println("Insira um valor para X2: ");
		x2 = ler.nextInt();
		
		System.out.println("Insira um valor para Y1: ");
		y1 = ler.nextInt();
		
		System.out.println("Insira um valor para Y2: ");
		y2 = ler.nextInt();
		
		d = (float) Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		
		System.out.println("\nA distancie entre os dois pontos é: " + d);
	}
}
