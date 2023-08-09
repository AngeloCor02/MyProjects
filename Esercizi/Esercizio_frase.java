package esercizi;

public class Esercizio_frase {

	public static void main(String[] args) {
		
		int x=0;
		
		String frase = "Ciao a tutti";
		
/////////////////////////////////////FRASE IN VERTICALE/////////////////////////////////////
		
//		for(int i=0; i<frase.length(); i++) {
//			
//			System.out.println(frase.charAt(i));
//			
//		}
		
/////////////////////////////////////CONTA LE VOCALI/////////////////////////////////////
		
		for(int i=0; i<frase.length(); i++) {
			
			if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' ||frase.charAt(i) == 'i' ||frase.charAt(i) == 'o' ||frase.charAt(i) == 'u' ) {
				
				x++;
				
			}
			
		}
		
		System.out.println("Le vocai della frase \"" + frase + "\" sono: " + x);
	}//fine main

}
