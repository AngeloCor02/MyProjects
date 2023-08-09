
public class SecondoEsercizioArray {
    public static void main(String[] args) {

        String[][] parole = {

                            {"rabbia", "cane", "gatto", "leone", "bottiglia"},

                            {"re", "regina", "gatto", "sardina", "bottiglia"},

                            };

        int[] numeri = {4,5,6,2,2,2,3,5,5,5};

        int sommaPari=0;
        int sommaDispari=0;

//ZIG ZAG (PRIMO,ULTIMO,SECONDO,PENULTIMO,TERZO,TERZULTIMO)

        for(int i=0;i<numeri.length/2;i++){
            
            System.out.print(numeri[i] + " " + numeri[numeri.length-i-1] + " ");

        }

        if(numeri.length%3==0){

            System.out.print(numeri[numeri.length/2]);

        }

    System.out.println("--------------------------------------------------");


//SOMMA POSIZIONI PARI E DISPARI DIVERSI O UGUALI

        for(int i=0;i<numeri.length;i++){

            if(i%2==0){

                sommaPari+=numeri[i];

            }else{

                sommaDispari+=numeri[i];
       
            }

        }

        System.out.println();

        if(sommaPari==sommaDispari){

                System.out.println("La somma tra pari e dispari e' uguale");

            }else{

                System.out.println("La somma tra pari e dispari e' diversa");

            }

    System.out.println("--------------------------------------------------");

//NUMERO DOPPIO DELL'ALTRO NELL'ARRAY

            for(int i=0;i<numeri.length;i++){

                for(int j=0;j<numeri.length;j++){

                    if(numeri[i]*2==numeri[j]){

                        System.out.println(numeri[j] + " e' il doppio di " + numeri[i]);

                    }


                }


            }

    System.out.println("--------------------------------------------------");

//TRE NUMERI UGUALI CONSECUTIVAMENTE

            for(int i=0;i<numeri.length-2;i++){

                if(numeri[i]==numeri[i+1]&&numeri[i]==numeri[i+2])

                    System.out.println("Il numero " + numeri[i] + " si trova 3 volte consecutivamente nell'array.");

            }

    System.out.println("--------------------------------------------------");



//STRINGE UGUALI

            for(int i=0;i<5;i++){

                for(int j=0;j<5;j++){

                    if(parole[0][i].equals(parole[1][j])){

                        System.out.println("La parola " + parole[0][i] + " si ripete anche nella seconda sequenza.");

                    }

                }

            }

//MEDIA DIVISIBILI PER TRE

            double somma=0;

            for(int i=0;i<numeri.length;i++){

                somma+=numeri[i];

            }

            System.out.println("La media dell'array e': " + somma/numeri.length);

            somma=0;
            int conta=0;

            for(int i=0;i<numeri.length;i++){

                if(numeri[i]%3==0){

                    somma+=numeri[i];

                    conta++;
                
                }

            }
            
            System.out.println("La media dell'array dei numeri divisibili per 3 e': " + somma/conta);

    }//fine main

}
