package esercizi;

import java.util.Scanner;

public class Esercizio_classe_string {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

			
//		String frase = "Ciao a tutti, benvenuti al corso di Java";	
	//	
//		System.out.println("La frase \"" + frase + "\" è lunga " + frase.length() + " caratteri.");
//			
//		System.out.println("Di quale indice vuoi sapere il carattere?");
	//	
//		int numero = scan.nextInt();
	//	
//		System.out.println("All'indice " + numero + " c'è il carattere \"" + frase.charAt(numero) + "\".");
	//	
//		System.out.println("La lettera \"v\" si trova all'indice " + frase.indexOf('v'));
	//	
//		System.out.println("Come ti chiami?");
	//	
//		String nome = scan.nextLine();
	//	
//		if (nome.equals("Irene")) {
//			System.out.println("Ciao Irene");
//		}
	//	
//		if (nome.equalsIgnoreCase("Irene")) {
//			System.out.println("Ciao Irene");
	//	
//		}
	//	
//		System.out.println(nome.isEmpty());
	//	
//		System.out.println(nome.toUpperCase());
	//	
//		System.out.println(nome.toLowerCase());
		
		/*
		String quintoCanto = "O animal grazïoso e benigno\r\n"
				+ "che visitando vai per l’aere perso\r\n"
				+ "noi che tignemmo il mondo di sanguigno,\r\n"
				+ "\r\n"
				+ "se fosse amico il re de l’universo,\r\n"
				+ "noi pregheremmo lui de la tua pace,\r\n"
				+ "poi c’ hai pietà del nostro mal perverso.\r\n"
				+ "\r\n"
				+ "Di quel che udire e che parlar vi piace,\r\n"
				+ "noi udiremo e parleremo a voi,\r\n"
				+ "mentre che ’l vento, come fa, ci tace.\r\n"
				+ "\r\n"
				+ "Siede la terra dove nata fui\r\n"
				+ "su la marina dove ’l Po discende\r\n"
				+ "per aver pace co’ seguaci sui.\r\n"
				+ "\r\n"
				+ "Amor, ch'al cor gentil ratto s'apprende,\r\n"
				+ "prese costui de la bella persona\r\n"
				+ "che mi fu tolta; e 'l modo ancor m'offende.\r\n"
				+ "\r\n"
				+ "Amor, ch’a nullo amato amar perdona,\r\n"
				+ "mi prese del costui piacer sì forte,\r\n"
				+ "che, come vedi, ancor non m’abbandona.";
		
		System.out.println("Questo testo è lungo " + quintoCanto.length() + " caratteri.");
		
		int indice = 0;
		
		do {
			System.out.println("Di quale indice vuoi sapere il carattere?");
			
			indice = scan.nextInt();
		
		} while (indice > quintoCanto.length());
		
		
		
		System.out.println("\nAll'indice " + indice + " c'è il carattere: " + "\"" + quintoCanto.charAt(indice) + "\".");
		
		String carattere = "a";
		
		scan.nextLine();
		
		do {
			
		System.out.println("\nQuale carattere vuoi trovato?");
			
		carattere = scan.nextLine();
		
		}while (carattere.isEmpty());
		
		System.out.println("La prima \"" + carattere + "\" si trova alla posizione: " + quintoCanto.indexOf(carattere));
		*/
		
		/////////////////////////////////////////////////////////////////////////////////////
		
		//TRIM
		
		System.out.println("Come ti chiami?");
		
		String nome= scan.nextLine();
		
		System.out.println("\"" + nome.trim() + "\"");
		
		//REPLACE
		String quintoCanto = "O animal grazïoso e benigno\r\n"
				+ "che visitando vai per l’aere perso\r\n"
				+ "noi che tignemmo il mondo di sanguigno,\r\n"
				+ "\r\n"
				+ "se fosse amico il re de l’universo,\r\n"
				+ "noi pregheremmo lui de la tua pace,\r\n"
				+ "poi c’ hai pietà del nostro mal perverso.\r\n";
		
		
		System.out.println(quintoCanto.toLowerCase().replace("d", nome.toUpperCase()));
		
		
		
		
		
		scan.close();
		}

	
	}


