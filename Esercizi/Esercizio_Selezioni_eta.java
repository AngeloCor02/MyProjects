package esercizi;

import java.util.Scanner;

public class Esercizio_Selezioni_eta {

	public static void main(String[] args) {
		
		char carattere_sesso;
		
		Scanner tastiera = new Scanner(System.in);

		System.out.println("Quanti anni hai?");
		int eta = tastiera.nextInt();
		
		tastiera.nextLine();
		
		System.out.println("Come ti identifichi?");
		String sesso = tastiera.nextLine();
		
		switch(sesso) {
		
			case "F", "Donna", "Femmina":
				
				carattere_sesso= 'a';
				break;
		
		
			case "M", "Uomo", "Maschio":
		
				carattere_sesso= 'o';
				break;
		
			default:
	
				carattere_sesso= '*';

		}
		if(eta > 40 ) {
			
			System.out.println("Sei un vecchi" + carattere_sesso + " di merda!");
			
		
			if(eta > 49 ) {
			
				System.out.println("Sei quasi in pensione!");
			}
		
		} else if (eta == 30) {
			
			System.out.println("Complimenti!");
			
		}else if(eta < 21) {
			
			System.out.println("Sei troppo giovane");
		
		}else {
			
			System.out.println("Ok tu puoi restare.\nNon sei vecchi"+carattere_sesso+" .");
			
		}
		
		System.out.println("Spero non ti sia offes"+carattere_sesso+"!");
		
		tastiera.close();

	}

}
