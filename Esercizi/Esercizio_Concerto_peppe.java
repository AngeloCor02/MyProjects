package esercizi;

import java.util.Scanner;

public class Esercizio_Concerto_peppe {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Quanto è lunga la piazza?");
		
		int lunghezza = tastiera.nextInt();
		
		System.out.println("Quanto è larga la piazza?");
		
		int larghezza = tastiera.nextInt();
		
		System.out.println("La spesa per l'ambulanza sarà: " + larghezza * lunghezza *10);
		
		System.out.println("La spesa per i bagni sarà: " + larghezza * lunghezza * 2);

		System.out.println("Il tuo profitto sarà: " + (larghezza * lunghezza * 17 - 500));

		tastiera.close();

	}

}