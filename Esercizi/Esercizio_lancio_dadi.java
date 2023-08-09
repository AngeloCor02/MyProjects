package esercizi;

import java.util.Scanner;
import java.util.Random;

public class Esercizio_lancio_dadi {

	public static void main(String[] args) {

		//la possibilità che esca 6 in un dado è "1/6"
		
		//la probabilità che esca 6 con due dadi diminuisce
		
		//con un dado la possibilità che esca un numero pari o dispari è 50%
		
		//con due dadi la possibilità che esca 1 è 0%
		
		//la possibilità che esca 12 è 1/36		"0,027/1"
		
		Random random = new Random();
		Scanner scan = new Scanner (System.in);
		
		int coincidenza = 0;
		int dado1 = 0;
		int dado2 = 0;
		int contatore_dadi=0;
		
		System.out.println("Quanti numeri casuali vuoi generati?");
		int conteggio = scan.nextInt();
		
		System.out.println("-----------------------------------------------------------------------");
		
		while(contatore_dadi < conteggio){
			
			dado1 = random.nextInt(6) + 1;
			dado2 = random.nextInt(6) + 1;

				if(dado1==6 && dado2 == 6) {
					
					coincidenza++;
					
				}
				
			contatore_dadi++;
			
		}//fine while
		
		System.out.println("-In " + conteggio + " lanci il doppio 6 è uscito: " + coincidenza + " volte.\n-Con una frequenza di: " + (double) coincidenza/conteggio + ".\n-Mentre la probabilità è di 0,027");
		
		scan.close();
		
	}//fine main
}