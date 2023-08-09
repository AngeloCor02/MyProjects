package esercizi;

public class Esercizio_array_2d_for_each {

	public static void main(String[] args) {
		String [][] frutta = {
				
				{"pesca","melone","mela"},//frutti0 è frutta[0]. Frutto=pesca
				
				{"albicocca","ciliegia","banana"},//frutti1
				
				{"pera","cocomero","ananas"},		
				
				};
		
		
		
		for ( String[] frutti : frutta) {
			
			//(dentro Frutta crea array di stringhe Frutti.) Ogni elemento di frutta è Array.
			//"Per ogni elemento di Frutta, crea array Frutti"
			
			for (String frutto : frutti) {
				
			//(prendo il singolo elemento dell'array Frutti.) Ogni elemento di frutti è una stringa, ad es."pesca".
			//"Per ogni elemento di Frutti, crea una stringa Frutto"
				
				System.out.println(frutto);
	
			}

		}
		
	}//fine main

}
