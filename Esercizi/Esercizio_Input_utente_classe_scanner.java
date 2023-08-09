package esercizi;

import java.util.Scanner;

public class Esercizio_Input_utente_classe_scanner {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Come ti chiami?");
		String nome = tastiera.nextLine();
		
		System.out.println("Quanti anni hai?");
		byte eta = tastiera.nextByte();
		tastiera.nextLine();//si usa quando non si richiede una stringa
		
		System.out.println("Dove abiti?");
		String citta = tastiera.nextLine();
		
		System.out.println("Il tuo nome è " + nome +" la tua età è " + eta + "anni e vieni da " + citta);
		
		tastiera.close();
	}

}
