package esercizi;

import java.util.Scanner;

public class Esercizio_parola_palindroma {

	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);
		
		int x = 0;
		
		System.out.println("Inserisci la parola: ");
		String parola = tastiera.nextLine().toLowerCase();
		
		int y = parola.length();

		/*
		while(parola.charAt(x) != 'x') {
			
			x++;
			
		}
		System.out.println("Ho incontrato una x all'indice " + x);
		*/

		while(x < y/2) {
			
			if(parola.charAt(x) != (parola.charAt(y-1-x))) { 
				
				System.out.println("La parola \"" + parola + "\" non è palindroma");
				break;
				
			}
			
			x++;
		
			
		}	
		
		if(x==parola.length()/2) {
		
			System.out.println("La parola \"" + parola + "\" è palindroma");
		
		}
		
		/////////////////////////////////////METODO ALTERNATIVO CON BOOLEAN//////////////////////////////////////
		/*
		boolean palindromo = true;
		
		while(x<parola.length()/2) {
			
			
			if(parola.charAt(x) != parola.charAt(parola.length()-1-x)) {
				palindromo = false;				
				break;
			}
			
			
			x++;
			
			
		}
		
		//operatore ternario = variabile = codizione ? valore Uno:valoreDue
		
		String fraseFinale = palindromo ? "" : "non";
		

		System.out.println("la parola " + fraseFinale + " è un palidromo");
		*/
		tastiera.close();
	}

}
