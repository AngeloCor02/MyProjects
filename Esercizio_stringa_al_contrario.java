package esercizi;

import java.util.Scanner;

public class Esercizio_stringa_al_contrario {

	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);
		
		
		System.out.println("Inserisci stringa");
		String str = tastiera.nextLine();
		
		System.out.print(str);
		
		for(int i=str.length()-2;i>=0;i--) {
			
			System.out.print(str.charAt(i));
			
		}
		
	}

}
