package esercizi;

import java.util.Scanner;

public class Esercizio_cicli_while {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		int x=0;
		System.out.println("Inserisci numero");
		int numero = tastiera.nextInt();
		
		System.out.println("Inserisci il numero che vuoi saltare");
		int salto = tastiera.nextInt();
		
		while(x < numero) {
			
			x++;
			if(x==salto) {
				
				continue;
			}
			System.out.print(x);
			
			if(x <  numero) {
				
			System.out.print(" - ");

			}//fine if
			
		}//fine while
		
		
		tastiera.close();
		
	}//fine main

}
