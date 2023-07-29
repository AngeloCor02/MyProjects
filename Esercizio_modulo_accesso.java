package esercizi;

import java.util.Random;
import java.util.Scanner;

public class Esercizio_modulo_accesso {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		
			System.out.println("Vuoi registrarti?");
			String risposta = tastiera.nextLine();
			
			if(risposta.equalsIgnoreCase ("si")) {
				
				chiedi_nome(tastiera);
				
			}else {
				
				System.out.println("Non ti registri nemmeno, allora ciao coglione");
				
			}
			//tastiera.close();
			
	}
	
	public static void palindromo(Scanner tastiera) {
		
		int x = 0;
		System.out.println("___________________________________________________________\n");

		System.out.println("Inserisci la parola: ");
		String parola = tastiera.nextLine().toLowerCase();
		
		int y = parola.length();

		while(x < y/2) {
			
			if(parola.charAt(x) != (parola.charAt(y-1-x))) { 
				
				System.out.println("La parola \"" + parola + "\" non è palindroma");
				break;
				
			}
			
			x++;
		
		}	
		
		if(x==parola.length()/2) {
		
			System.out.println("La parola \"" + parola + "\" è palindroma");
		
		}
		else {
		
		System.out.println("Ciao");
		
	}
	}
	
	public static void chiedi_nome(Scanner tastiera) {
		System.out.println("___________________________________________________________\n");

		System.out.println("Inserisci nome");
		String nome = tastiera.nextLine();

		System.out.println("Il tuo nome utente è: " + nome + ".\nConfermi? (si o no)");

		String risposta = tastiera.nextLine();
		
		if (risposta.equalsIgnoreCase("si")) {
			
			inserisci_password(tastiera ,nome);
			
		}else {
			
			chiedi_nome(tastiera);	
		}
		
	}
	
	public static void inserisci_password(Scanner tastiera, String nome) {
		System.out.println("Inserisci password");
		String password = tastiera.nextLine();

		System.out.println("La tua password è: " + password + ".\nConfermi? (si o no)");
		String risposta = tastiera.nextLine();
		
		if (risposta.equalsIgnoreCase("si")) {
			
			login(tastiera, nome , password);
			
		}else {
			
			inserisci_password(tastiera,nome);	
		}
		
	}
	
	public static void login(Scanner tastiera, String nome, String password) {
		System.out.println("___________________________________________________________\n");

		System.out.println("Vuoi entrare? (si o no)");
		String risposta = tastiera.nextLine();
		int i=3;
		
		
		if (risposta.equalsIgnoreCase("si")) {
			
			do {
				System.out.println("___________________________________________________________\n");

				System.out.println("Inserisci nome utente");
				String nome_utente = tastiera.nextLine();
			
				System.out.println("Inserisci password");
				String password_utente = tastiera.nextLine();
			
				if(nome_utente.equalsIgnoreCase(nome) && password_utente.equalsIgnoreCase(password)) {
					
					//i=0;
					String rigioca="";
					
					System.out.println("Puoi entrare");
					if(password.equalsIgnoreCase("123456")) {
						System.out.println("Che password da coglione");
					}
					do {
						System.out.println("Seleziona il gioco da avviare scrivendo il numero:\n-1 Parola palindroma\n-2 kollaz\n-3 Lancio dadi");
						int ris = tastiera.nextInt();
						tastiera.nextLine();
						switch(ris) {
						case 1:
							
							palindromo(tastiera);
							
							break;
							
						case 2:
							
							kollaz();
							
							break;

							
						case 3:
							
							lancio_dadi();
							
							break;
							
						}
						System.out.println("___________________________________________________________\n");

						System.out.println("Vuoi rigiocare?");
						rigioca = tastiera.nextLine();
						
					}while(rigioca.equalsIgnoreCase("si"));
					System.out.println("___________________________________________________________\n");

					System.out.println("Hai finito di giocare ciao");
					break;
					
				}else {
					
					i--;
					
					if(i == 2) {
						
						System.out.println("Nome utente o password sbagliato. Hai ancora 2 tentativi.");
						
					}else if(i == 1) {
						
						System.out.println("Nome utente o password sbagliato. Hai ancora 1 tentativo.");
						
					}else {
						
						System.out.println("I tentativi sono finiti addio");
						break;
					}
					
					
					
					
					
				}
		
			}while(i > 0);
			
				
				
			}else {
			
				System.out.println("Addio.");
			
		}
		
	}
	public static void kollaz(){
		
		Scanner scan = new Scanner(System.in);
			
		int contatore=0;
		
		
		System.out.println("Digita un numero: ");
		int num = scan.nextInt();
		scan.nextLine();
		int x= num;//salviamo num in un altra variabile per scriverlo alla fine nel print senò si andrebbe a perdere
		
		while (num!=1) {
			
			System.out.print(num + ", ");
		
			if(num % 2== 0) {
	
				num/=2;
			
			}else {
			
				num=num*3+1;
			
			}
			
			contatore++;

			if(contatore%10==0) {
				System.out.println("");
			}
		}//fine while
		
		System.out.println("1.");
		
		System.out.println("Per far arrivare ad 1 dal numero " + x +" sono stati necessari " + contatore + " passaggi.");
		
		
		
		} 
		public static void lancio_dadi(){
			
			Random random = new Random();
			Scanner scan = new Scanner (System.in);
			
			int coincidenza = 0;
			int dado1 = 0;
			int dado2 = 0;
			int contatore_dadi=0;
			
			System.out.println("Quanti numeri casuali vuoi generati?");
			int conteggio = scan.nextInt();
			scan.nextLine();
			
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
			
			
		}
	
}
