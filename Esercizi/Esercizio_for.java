package esercizi;

import java.util.Scanner;

public class Esercizio_for {

	public static void main(String[] args) {
		
		//Utente digita un numero moltiplichiamo tutti i numeri da 1 fino al numero dell'utente

		Scanner tastiera = new Scanner(System.in);
		
		long risultato;
		String ris;
		
		do {
			

			System.out.println("Inserisci numero");
			int num = tastiera.nextInt();
			tastiera.nextLine();
			risultato=1;
			for(int i=1;i<=num;i++) {
				
				risultato*=i;
				
			}
			
			System.out.println(risultato);
			
			
			
			System.out.println("Giochi di nuovo?");
			ris= tastiera.nextLine();
			System.out.println("________________________________________\n");
		}while(ris.equalsIgnoreCase("si"));

		System.out.println("ADDIO");
	}

}
