package esercizi;
import java.util.Scanner;

public class Esercizio_piramide {

	public static void main(String[] args) {
		
		piani();
			
			
	}//fine main
	
	
	public static void piani(){
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Piani");
		int num= tastiera.nextInt();
	
		righe(num);
		
	}
	
	public static void  righe(int num) {
		
		for(int i = 1; i <= num; i++) {
			
			spazi(i, num);
			
			stampa_x(i);
			
			
				
				
				System.out.println();
				
		}
		
	}
	
	public static void  spazi(int i, int num) {
		
		for(int j=num; j>=i; j--) {
			
			System.out.print(" ");

		}
		
	}

	public static void  stampa_x(int i) {
	
		for(int z=0 ;z < i*2-1 ; z++ ) {
			
			System.out.print("x");
		
		}
			
	}
		
		

	}
	
	
	
