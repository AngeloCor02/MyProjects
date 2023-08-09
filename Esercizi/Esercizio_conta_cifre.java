package esercizi;

import java.util.Scanner;

public class Esercizio_conta_cifre {

	public static void main(String[] args) {

		int x = 0; 
		
		int numero = 0;
		
		Scanner tastiera = new Scanner(System.in);
		
		while(numero == 0) {
		
		System.out.println("Inserisci numero");
		numero = tastiera.nextInt();
		
			if(numero == 0) {
			
				System.out.println("Mongoloide metti un numero maggiore di 0");
			
			}//fine if
			
		}//fine while
		
		int risultato = numero;
		
		////////////////////////////////PRIMO METODO////////////////////////////////
		
		/*
		 *Ho aggiunto uno spazio alla stringa numero per poi nella condizione del while mettere
		 *che finche l'indice è diverso dallo spazio deve fare il ciclo
		*/
		
		String parola = String.valueOf(numero) + " ";
		
		while(parola.charAt(x) != ' ') {
			
			x++;
				
		}
			
		System.out.println("Le cifre sono: " + x);
		
		
		
		System.out.println("-----------------------------------------------------------------");

		////////////////////////////////SECONDO METODO////////////////////////////////
		
		System.out.println("Il numero " + numero + " ha: " + String.valueOf(numero).length() + " cifre.");
		
		System.out.println("-----------------------------------------------------------------");

		
		////////////////////////////////TERZO METODO////////////////////////////////
		
		x = 0;
		while(numero!=0) {
			
			numero /= 10;
			
			x++;
			
		}//fine while
		

		System.out.println("Il numero " + risultato + " ha: " + x + " cifre.");
		
		System.out.println("---------------------------------");

		tastiera.close();
		

	}//fine main
}

