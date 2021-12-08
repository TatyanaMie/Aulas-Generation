package Lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int a,b,c,r,s,d;
		
		Scanner ler = new Scanner (System.in);
		System.out.print("Insira um valor positivo de A: ");
		a = ler.nextInt();
		
		System.out.print("Insira um valor positivo de B: ");
		b = ler.nextInt();
		
		System.out.print("Insira um valor positivo de C: ");
		c = ler.nextInt();
		
		r = (a + b) * (a+b);
		s = (b + c) * (b+c);
		d = (r + s)/2;
		
		System.out.print("O valor final é: " + d);
		

	}

}



