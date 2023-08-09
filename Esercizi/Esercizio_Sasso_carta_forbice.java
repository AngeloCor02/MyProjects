package esercizi;

import java.util.Scanner;

public class Esercizio_Sasso_carta_forbice {

	public static void main(String[] args) {
		
		System.out.println("Benvenuto! Adesso giocheremo a Sasso, Carta e Forbici. Sono sicuro che ti batterò, mettimi alla prova!");
		
		Scanner input = new Scanner(System.in);
		
		//int numeroUno = 10;
		//int numeroDue = 20;
		
		//somma (numeroUno,numeroDue);
		
		gioca_carta_forbice_sasso (input);
		
		
		//Anche il while non ci permette di controllare il contenuto di un oggetto, come l'IF. 
		//"Si" ha bisognio di metodi String
		
		
		
		}//chiusura main.

	public static void gioca_carta_forbice_sasso (Scanner pippo) {
		
		String risposta = "";
		
		System.out.println("Fai la tua scelta!\n");
		String scelta = pippo.nextLine();
		
		String sceltaPc = "";
		
		System.out.println("________________________________________________________\n");
		
		switch (scelta) {
		case "Forbici", "forbici", "Forbice", "forbice":
			sceltaPc = "Sasso";
		break;
		case "Sasso", "sasso":
			sceltaPc = "Carta";
		break;
		case "Carta", "carta":
			sceltaPc = "Forbici";
		break;
		default:
			System.out.println("Scelta non valida, coglione!!");
			gioca_carta_forbice_sasso(pippo);

		}
		
		System.out.println("Io ho scelto: " + sceltaPc + ". Ho vinto, scemo\n");
		
		System.out.println("________________________________________________________\n");

		System.out.println("Vuoi giocare ancora?");
		
		risposta = pippo.nextLine();
		
		controllaRisposta (risposta, pippo);
	
	}
	
	public static void somma (int numUno, int numDue) {
		System.out.println(numUno + numDue);
	}
	
	public static void controllaRisposta (String x, Scanner gesu) {
		switch (x) {
		case "Si", "si":
			gioca_carta_forbice_sasso(gesu);
		break;
		default:
			System.out.println("Vaffanculo");
		}
	}
}