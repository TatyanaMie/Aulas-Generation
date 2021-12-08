package Lista1;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		float a,b,c,d,i,f,x,y;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Insira os valores de A: ");
		a = ler.nextInt();
		
		System.out.print("Insira os valores de B: ");
		b = ler.nextInt();
		
		System.out.print("Insira os valores de C: ");
		c = ler.nextInt();
		
		System.out.print("Insira os valores de D: ");
		d = ler.nextInt();
		
		System.out.print("Insira os valores de E: ");
		i = ler.nextInt();
		
		System.out.print("Insira os valores de F: ");
		f = ler.nextInt();
		
		x=(c*i-b*f)/(a*i-b*d);
		y=(a*f-c*d)/(a*i-b*d);
		
		System.out.println("\nOs valores de X e Y são respectivamente: " + x + " e " + y);
	}

}
