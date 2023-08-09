package esercizi;

public class Esercizio_array_2d_parola_più_lunga {

	public static void main(String[] args) {
		
		int [][] numeri ={
				
				{2,32,41},
	
				{1,2,5},
	
				{32,43,2}
				
				};
		
		String[][] parole= {
							
							{"mela", "pera", "astronauta"},
							
							{"erba", "bottiglia", "mouse" },
							
							{"monitor", "transustanziazione", "quadro" },
							
							};
		
		System.out.println("----------------------------------------------------------------------------");

		System.out.println("\"" + stringa_lunga(parole)+ "\" è la parola più lunga di questa matrice");
		
		System.out.println("----------------------------------------------------------------------------");

		System.out.println(min(numeri) + " è il numero più piccolo di questa matrice");
		
		System.out.println("----------------------------------------------------------------------------");

		System.out.println(max(numeri) + " è il numero più grande di questa matrice");

		System.out.println("----------------------------------------------------------------------------");

		System.out.println(somma(numeri) + " è somma di questa matrice");
		
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println(media(numeri) + " è il numero più grande di questa matrice");

	}
	
	public static String stringa_lunga(String[][]parole){
		
		String lunghezza="";
		
		for(String[] parola : parole) {
			
			for(String i : parola) {
				
				if(i.length() > lunghezza.length()) {
					
					lunghezza = i;
					
				}
				
			}
			
		}
		
		return lunghezza;
	}
	

	public static int min(int[][]numeri){
		
		int min= numeri[0][0];
		
		for(int[] numero : numeri) {
			
			for(int i : numero) {
				
				if(i < min) {
					
					min = i;
					
				}
				
			}
			
		}
		
		return min;
	}
	
	public static int max(int[][]numeri){
	
		int max= 0;
	
		for(int[] numero : numeri) {
			
			for(int i : numero) {
			
				if(i > max) {
				
					max = i;
				
				}
			
			}
		
		}
	
		return max;
	}
	
	public static int somma(int[][]numeri){
		
		int somma= 0;
	
		for(int[] numero : numeri) {
			
			for(int i : numero) {
			
				somma+=i;
			
			}
		
		}
	
		return somma;
	}
	
	public static float media(int[][]numeri){
		
		float somma=0;
		
		float media=0;
	
		for(int[] numero : numeri) {
			
			for(int i : numero) {
			somma+=i;
			
			}
			
		}
		
		media=somma/(numeri.length*numeri[0].length);

		return media;
		
	}
	
}
