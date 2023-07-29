package esercizi;

import java.util.Scanner;

public class Esercizio_nome_nel_rettangolo {

	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci nome");
		String nome = tastiera.nextLine();
		
		int i = 1;
		
		while(i <= 5) {
			
			if(i == 1|| i == 5) {
			
				riga(nome);
				
			}else if( i == 2||i == 4) {
				
				colonna(nome);
				
			}else {
				
				System.out.println("|   " + nome.toUpperCase() + "!!   |");

			}
			
			i++;
			
		}
		
		tastiera.close();
		
	}//fine main

	public static void riga(String nome) {
		
		int x=0;
		
		System.out.print("+");
		
		while(x < nome.length() + 8) {
			
		System.out.print("-");
		
		x++;
		
		}
		
		System.out.println("+");
		
	}
	
	public static void colonna(String nome) {
			
	int x=0;
		
		System.out.print("|");
		
		while(x < nome.length() + 8) {
			
		System.out.print(" ");
		
		x++;
		
		}
		
		System.out.println("|");
		
	}
	
	
	
}
