public class PrimaLetteraGrande {
    public static void main(String[] args) {
        
        String frase = "la rapida volpe marrone salta sopra il cane pigro. La volpe marrone rapida salta sopra il cane pigro.";

        for(int i=0; i<frase.length()-1;i++){


            if(frase.charAt(i)==' '){

                System.out.print(" " + frase.toUpperCase().charAt(i+1));
                i++;
                
            }else if(i==0){

                System.out.print(frase.toUpperCase().charAt(i));

            }else{

                System.out.print(frase.charAt(i));

            }
        }

    }
}
