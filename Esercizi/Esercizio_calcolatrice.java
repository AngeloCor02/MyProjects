package esercizi;

import java.util.Scanner;

public class Esercizio_calcolatrice {

	
/****************************INIZIO MAIN******************************************/
	
	public static void main(String[] args) {
		
		Scanner tastiera= new Scanner(System.in);

		System.out.println("Come ti chiami?");
		String nome = tastiera.nextLine();
		
		calcola(nome,tastiera);
		
		tastiera.close();
		
	}
	
/****************************FINE MAIN******************************************/
	
	
///////////////////////////////CALCOLA///////////////////////////////

	public static void calcola(String nome, Scanner tastiera) {
		
		System.out.println(nome + ", inserisci il primo numero: ");
		int primo_numero = tastiera.nextInt();
		
		System.out.println(nome + ", inserisci l'operatore: ");
		char operatore = tastiera.next().charAt(0);
		
		System.out.println(nome + ", inserisci il secondo numero: ");
		int secondo_numero = tastiera.nextInt();
		
		tastiera.nextLine();
		
		controlla_operatore(primo_numero, operatore, secondo_numero, nome);
		
		chiedi(tastiera, nome);
		
	}
	
/********************************************************************************/

	
///////////////////////////////CHIEDI///////////////////////////////

	public static void chiedi(Scanner input, String nome) {
		
		System.out.print(nome + ", vuoi fare un altro calcolo?");
		String risposta = input.nextLine();
		
		switch(risposta) {
			
		case "Si","si","sì":
			
			System.out.println("--------------------------------------------------------------");

			calcola(nome,input);
			
			break;
			
		default:
			
			System.out.println(nome + ", vaffanculo.");
			
			System.out.println("--------------------------------------------------------------");

		}
		
	}
	
/********************************************************************************/
	

///////////////////////////////CONTROLLA OPERATORE///////////////////////////////
	
	public static void controlla_operatore(int primo, char op, int secondo, String nome){
		
		switch (op) {
		
		case '*':
			
			moltiplica(primo, secondo, nome);
			
			break;
			
		case '+':
			
			somma(primo, secondo, nome);
			
			break;
			
		case '/':
			
			dividi(primo, secondo, nome);
			
			break;
			
		case '-':
	
			sottrai(primo, secondo, nome);
	
			break;
			
		case '%':
			
			fai_modulo(primo,secondo, nome);
			
			break;
			
		default:
			System.out.println(nome + ", questo operatore non esiste.");
			
		}
		
	}
	
/********************************************************************************/
	
	
///////////////////////////////TUTTE LE OPERAZIONI///////////////////////////////

public static void moltiplica (int primo, int secondo, String nome) {
System.out.println(nome + ", la moltiplicazione tra " + primo + " e " + secondo + " è: " + (primo * secondo));
}

public static void somma (int primo, int secondo, String nome) {
System.out.println(nome + ", la somma tra " + primo + " e " + secondo + " è: " + (primo + secondo));
}

public static void fai_modulo (int primo, int secondo, String nome) {
System.out.println(nome + ", il modulo tra " + primo + " e " + secondo + " è: " + (primo % secondo));
}

public static void sottrai (int primo, int secondo, String nome) {
System.out.println(nome + ", la sottrazione tra " + primo + " e " + secondo + " è: " + (primo - secondo));
}

public static void dividi (int primo, int secondo, String nome) {
System.out.println(nome + ", la divisione tra " + primo + " e " + secondo + " è: " + (primo / secondo));
}

/********************************************************************************/
	

}
