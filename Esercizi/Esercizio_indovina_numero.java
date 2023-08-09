package esercizi;

import java.util.Scanner;

import java.util.ArrayList;

public class Esercizio_indovina_numero {

	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);
		
		String ris="";
		
		String nome = benvenuto(tastiera);
		
		int contatoreVinte=0;
		
		do {
			
			contatoreVinte += indovinaNumero(tastiera, nome);
			
			System.out.println("Hai vinto " + contatoreVinte  + " partite.");
			do{
				
				System.out.println("Vuoi rigiocare? si/no");
				
				ris = tastiera.nextLine();
				
			}while (!ris.equalsIgnoreCase("si") && !ris.equalsIgnoreCase("no"));
			
		}while (ris.equalsIgnoreCase("si"));
		
		System.out.println("Arrivederci");
		
	}//fine main

	public static String benvenuto(Scanner tastiera) {
		
		System.out.println("Come ti chiami?");
		
		String nome = tastiera.nextLine();
		
		System.out.println("Benvenuto " + nome + " sto pensando a un numero tra 1 e 100, hai 10 tentativi per indovinare");
		
		return nome;
	}
	
	public static int indovinaNumero(Scanner tastiera, String nome) {
		int tentativi = 1;
		
		int numero_casuale = (int) (Math.random()*100+1);
		
		boolean indovinato = false;
		
		ArrayList <Integer> numeriPassati = new ArrayList();
		
	do {
		
		System.out.println("Scegli un numero da 1 a 100");
		
		int numero = tastiera.nextInt();
		
		tastiera.nextLine();
		System.out.println("------------------------------------");

		numeriPassati.add(numero);
		
		if(numero_casuale == numero) {
			
			indovinato = true;
			
			break;
			
		}else if(numero_casuale <  numero){
			
			System.out.println("No, " + nome + ", " + numero +" è troppo alto.\n Hai " + (10 - tentativi) + " tentativi.");
			
		}else {
			
			System.out.println("No, " + nome + ", " + numero +" è troppo basso.\n Hai " + (10 - tentativi) + " tentativi.");

		}
		
		System.out.println("Questi sono i numeri inseriti finora " + numeriPassati);
		
		tentativi++;
		
		
	}while(tentativi <= 10 && !indovinato);
		
	if(indovinato) {
		
		System.out.println("Hai vinto " + nome);
		return 1;
	}else {
		
		System.out.println("Hai perso " + nome);
		return 0;
	}
	
	}
	
}
