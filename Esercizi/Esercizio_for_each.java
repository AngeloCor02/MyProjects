package esercizi;
import java.util.Scanner;
public class Esercizio_for_each {

//////////////////////////////////ESEMPIO////////////////////////////////////////////	
//Il for each serve apposta per gli array 
//e praticamente gli diciamo "per ogni elemento di questo array fai questo"
//
//String[] parole= {"amici", "cane", "gatto", "casa", "sale"};
//
//for(String parola : parole) {
//
//System.out.print(parola + " ok,");
//
//
/////////////////////////////////////////////////////////////////////////////////////

//Il più alto e il più basso di una lista di numeri
	
//////////////////////////////////INIZIO MAIN////////////////////////////////////	
	
	public static void main(String[] args) {

		//min_max_numeri_utente();
				
		numeri_random();
		
	}//fine main
		
		
		public static void min_max_numeri_utente() {
			Scanner tastiera= new Scanner(System.in);

			System.out.println("Inserisci grandezza array: ");
			int grandezza= tastiera.nextInt();
			tastiera.nextLine();
			
			int[] numeri = new int[grandezza];
			
			
			
			for(int i=0; i < grandezza;i++) {
			
					System.out.println("Inserisci " + (i+1) + "° numero: ");
					numeri[i]=tastiera.nextInt();
					tastiera.nextLine();
				
			}
			
			for(int numero : numeri) {
				
				System.out.print(numero + " ");
				
			}
			System.out.println();
			
			int nmin = numeri[0];
			int nmax = 0;
			
			for(int numero : numeri) {
				
				if (numero > nmax) {
					
					nmax=numero;
					
				}
				
				if (numero < nmin) {
					
					nmin=numero;
					
				}
				
			}
			
			System.out.println("Massimo: " + nmax);
			System.out.println("Minimo: " + nmin);
			
		}
		
		
		
		public static void numeri_random() {
			
			Scanner tastiera= new Scanner(System.in);

			System.out.println("Inserisci grandezza array: ");
			
			int grandezza= tastiera.nextInt();
			
			tastiera.nextLine();
			
			int[] numeri = new int[grandezza];
			
			int[] pos_sette = new int[grandezza];
			
			int conta=0;
			
			for(int i=0; i<grandezza-1; i++) {
				
				System.out.print(numeri[i]=(int) (Math.random()*10));
				
				System.out.print(", ");
				
				if(numeri[i] == 7) {
					
					pos_sette[conta]= i;
					
					conta++;
					
				}
				
			}
			System.out.println("\n");
			
			if(conta==0) {
				
				System.out.println("Non è uscito alcun 7");
				
			}else if(conta==1) {

				System.out.println("E' uscito 1 sette");
				
				System.out.print("\nEd è uscito nell' indice: ");

			}else {
				
				System.out.println("Sono usciti " + conta +" sette");
				
				System.out.print("\nE sono usciti negli indici: ");
				
			}
			
			
			
			for(int i=0; i < conta; i++) {
				
				if(i == conta-1) {
					
					System.out.print(pos_sette[i] + ". ");
					
				}
				
					else if(i<conta) {
					
					System.out.print(pos_sette[i] + ", "); 
					
					}

					
					
					
				}
				
				
			}
			
		}
		
		
			
		
		
		
		



