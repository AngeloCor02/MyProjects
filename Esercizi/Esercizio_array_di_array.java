package esercizi;

public class Esercizio_array_di_array {

	public static void main(String[] args) {
		
	//numeri è un array composto da 2 array detto array multidimensionale/2D/Matrice
		
	//numeri è un array di array di int
		
		
		
		String [][] parole ={
				
							{"Peppe","Irene","Angelo"},
				
							{"Mila","Lorenzo","Massimo"},
				
							{"Stefi","Riccardo","Fabio"}
							
							};
		
		//System.out.println(parole[2][0]);//stampa "Stefi"
		
		//accediamo tramite ciclo all'array di array
		
		for(int i = 0;i < parole.length;i++) {
			
			for(int j = 0;j < parole[i].length;j++) {
				
				System.out.print(parole[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
	}

}
