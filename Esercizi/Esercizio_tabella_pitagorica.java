package esercizi;

public class Esercizio_tabella_pitagorica {

	public static void main(String[] args) {

		
		//tabella pitagorica fino al 10
		
				for(int i = 1; i <= 10; i++) {
					
					for(int j = 1; j <= 10; j++) {
						
						int risultato = j * i;
								
						if( risultato < 10) {
							
							System.out.print("  ");
							
						}else if (risultato <= 90) {
							
							System.out.print(" ");
							
						}
						
						System.out.print(" " + risultato);
					}
					
					System.out.println();

				}
				
	}//fine main

}
