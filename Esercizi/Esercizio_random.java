package esercizi;
import java.util.Random;
import java.util.Scanner;

public class Esercizio_random {

	public static void main(String[] args) {
		
	
	Random oggettoRandom = new Random();
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Quanti numeri casuali vuoi generati?");
	int ripetizioni = scan.nextInt();

	System.out.println("Qual è l'inizio del range?");
	int inizioRange = scan.nextInt();

	System.out.println("Qual è la fine del range? (max 99)");
	int fineRange = scan.nextInt();

	
	int number = 0;
	int conteggio = 0;
	
	while(conteggio<ripetizioni){
		number = oggettoRandom.nextInt(inizioRange,fineRange + 1);
		
			if(number < 10) {
				System.out.print(0);
			}
			
			System.out.print(number + " ");
			
			conteggio++;
			
			if (conteggio % 10 != 0){
		
				System.out.print("- ");
			}else {
				
				System.out.println();
			}
		
	
		
}
	
	
	
	
/////////////////////////////////////////ALTERNATIVO////////////////////////////////////
	/*
	int conteggio = 0;

	int numero = 0;

		while (ripetizioni > 0) {
	
			numero = oggettoRandom.nextInt(inizioRange, fineRange +1);
	
			System.out.print(numero + " ");
		
			conteggio++;

	
			if (numero < 10) {
		
				System.out.print(" ");	
		
			}
	
			if (conteggio % 10 != 0) {
		
				System.out.print("- ");
	
			}else {
		
				System.out.println("");
			
			}
	
				ripetizioni--;
	


		}
		*/
	
	scan.close();
	}//fine main
}
