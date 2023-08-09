package esercizi;

public class Esercizio_primo_array {

	public static void main(String[] args) {
		
		int grandezza=10;
		
		int[] array_i =new int [grandezza];
		
		int[] numeri= {31,13,23,3,45,5,6,77,8,92};
		
		stampa_ok(numeri);
		
		stampa_numeri(array_i);
		
		stampa_somma_e_media_di_numeri(numeri);
		
		
	}//fine main
		
	

	public static void stampa_ok(int[] numeri) {
		
		System.out.println("|ARRAI DI \"NUMERI\"|");
		
		for(int i=0; i<numeri.length;i++){
				
			if(i<numeri.length-1) {
				
				System.out.print(numeri[i] + ", ");

			}else {
				System.out.println(numeri[i] + ".");
			}
			
		}
		
	}
	
	
	public static void stampa_numeri(int[] array_i) {
		
	System.out.println("\n--------------------------------------------\n");
		
		System.out.println("|ARRAI DI \"I\"|");

		
		for(int i=0; i<array_i.length;i++){
			
			System.out.print(array_i[i]=i); 
			
			if(i<array_i.length-1) {
				
				System.out.print(", ");

				
			}else {
				
				System.out.println(".");
				
			}

		}
	}
	
	
	public static void stampa_somma_e_media_di_numeri(int []numeri) {
		
		System.out.println("\n--------------------------------------------\n");
		System.out.println("|SOMMA DI NUMERI|");
		
		float somma = 0;
		
		
		for(int i=0; i<numeri.length;i++){
			
			somma+=numeri[i];
			
			
		}
		
		float media = somma/numeri.length;
		
		System.out.println("La somma dell'array numeri è : " + somma);
		
		System.out.println("\n--------------------------------------------\n");
		System.out.println("|MEDIA DI NUMERI|");
		
		System.out.println("La media dell'array numeri è : " +  media);

	}
	
	
	
	
}
