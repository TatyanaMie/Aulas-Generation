package Lista1;

import java.util.Scanner;

public class Exercicio3 {

		public static void main(String[] args) {
			int segundos,horas,minutos;
			
			Scanner ler = new Scanner (System.in);
			System.out.print("Insira o tempo de duração do evento em segundos: ");
			segundos = ler.nextInt();
			
			horas = segundos/3600;
			minutos = horas*60;
			segundos = minutos*60;
			
			
			System.out.println("\nO tempo de duração do evento em horas é: " + horas + ", o tempo em minutos é: " + minutos + ",o tempo em segundos é: " + segundos);
		}
}

