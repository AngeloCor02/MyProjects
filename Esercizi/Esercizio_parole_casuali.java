package esercizi;

import java.util.Scanner;

public class Esercizio_parole_casuali {

	public static void main(String[] args) {
		
		//utente scegli il numero di cifre della parola e noi la stampiamo
		
		Scanner tastiera = new Scanner(System.in);
		
		String parola="";
		
		int i=0;//contatore
		
		System.out.println("Indica di quante lettere deve essere lunga la parola: ");
		int lett = tastiera.nextInt();
		tastiera.nextLine();
		
		String alfabeto="abcdefghijklmnopqrstuvwxyz \n";
		
		int range = 0;
		
		while(i < lett) {
			
			range = (int) (Math.random()*alfabeto.length());//genera numeri da 0 a 21
			
			alfabeto.charAt(range);// è un carattere 
			
			i++;
			
			parola += alfabeto.charAt(range);//aggiunge ogni volta il carattere nuovo
		}
		
		System.out.println(parola);
		
		System.out.println("Addio");
		tastiera.close();
	}//fine main

}
