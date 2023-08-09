package esercizi;

import java.util.Scanner;

public class Esercizio_scala_x {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci il numero");
		int x = tastiera.nextInt();
		
		
//////////////////////////SALE//////////////////////////

		for(int i=1; i<=x; i++) {

			for(int j=1; j<=i; j++){
			
				System.out.print("x");
						
			}
			
			System.out.println();
			
		}
//////////////////////////METODO ALTERNATIVO DEL FOR FIGLIO//////////////////////////
		
/*			j=0;																   
			while(j<i) {
				
				System.out.print("x");
				j++;
				
			}
*/			
//////////////////////////SCENDE//////////////////////////

		
		for(int i=0; i<x; i++) {

			for(int j=x-1; j>i; j--){
			
				System.out.print("x");
						
			}
			
			System.out.println();
			
		}
	
		
		tastiera.close();
		
	}//fine main

}


