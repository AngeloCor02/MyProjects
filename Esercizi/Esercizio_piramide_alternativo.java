package esercizi;

import java.util.Scanner;

public class Esercizio_piramide_alternativo {

	public static void main(String[] args) {
		
		int piani = chiedi_piani();
		
		righe(piani);
		tronco(piani);
			
			
	}//fine main
	
	
	public static int chiedi_piani(){
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Piani");
		int num= tastiera.nextInt();
	
		return num;
		
	}
	
	public static void  righe(int piani) {
		
		for(int i = 1; i <= piani; i++) {
			
			spazi(i, piani);
			
			stampa_x(i);
			
			System.out.println();
				
		}
		
	}
	
	public static void  spazi(int i, int piani) {
		
		for(int j=piani; j>=i; j--) {
			
			System.out.print(" ");

		}
		
	}

	public static void  stampa_x(int i) {
	
		for(int z=1 ;z < i*2 ; z++ ) {
			
			System.out.print("x");
		}
		}
		
	public static void  tronco(int piani) {
		
		if(piani<=5) {
			
			for(int i = 0; i < 1; i++) {
				
				spazi(1,piani);
		
				stampa_x(1);
		
				System.out.println();
					
			}
			
		}else if(piani>5) {
			
			int altezza=piani/6;
			int larghezza=piani/5;
			
			if(piani>5&&piani<11) {
				
				larghezza=2;
				
			}
			
			if(piani>7 && piani<12) {
				
				altezza=2;
				
			}
			
			for(int i = 0; i < altezza; i++) {
				
				spazi(larghezza,piani);
		
				stampa_x(larghezza);
		
				System.out.println();
					
			}
			
		}
				
	}
	
	
}//fine classe


