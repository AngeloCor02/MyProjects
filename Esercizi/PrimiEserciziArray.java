public class PrimiEserciziArray {

    public static void main(String[] args) {
        boolean coppia=false;
        boolean arrayCresc=true;

        int[] numeri = {3,1,22,3,46,5,69,7,8};
        int[] numeriInverso = new int[numeri.length];

        int arrayInv=0;
        int max = numeri[0];
        int conta=0;
        int contaV=0;

        System.out.println("---------------------------------BENVENUTO---------------------------------");

        System.out.print("L' arrey e': ");

//STAMPA ARRAY

        for(int i=0;i<numeri.length;i++){

            System.out.print(numeri[i] + " ");

            if(numeri[i]>max){

                max=numeri[i];
            }

//ESISTENZA DI NUMERI UGUALI

                for(int j=0;j<numeri.length;j++){

                    if(i!=j){

                        if(numeri[i]==numeri[j]){

                            coppia = true;

                        }

                    }

                }

            }

//NUMERO CHE SI RIPETE DI PIU'

            for(int i=0;i<numeri.length;i++){
                conta=0;
                for(int j=0;j<numeri.length;j++){

                    if(i!=j){

                        if(numeri[i]==numeri[j]){

                            conta++;

                        }

                    }

                }
                if(conta>contaV){

                    contaV=numeri[i];

                }
            }

        System.out.println("\n-----------------------------------------------------------------");

//ARRAY CRESCENTE O NON

            for(int i=0;i<numeri.length-1;i++){

                if(numeri[i]>numeri[i+1]){

                    System.out.println("L'array non e' in ordine crescente.");

                    arrayCresc=false;

                    break;

                }

            }

            if(arrayCresc){

                System.out.println("L'array e' in ordine crescente.");

            }
            
//ARRAY INVERSO CON 2 ARRAY

            System.out.println("-----------------------------------------------------------------");

            System.out.print("L'array inverso e': ");

            for(int i=numeri.length-1;i>=0;i--){
   
                numeriInverso[i]=numeri[i];

              System.out.print(numeriInverso[i] + " ");

            }

//ARRAY INVERSO ALTERNATIVO CON UN ARRAY

            System.out.println("\n-----------------------------------------------------------------");
 
            System.out.print("L'array inverso alternativo e': ");
           
            for(int i=0;i<numeri.length;i++){
              
                if(i < (numeri.length-1)/2){

                    arrayInv = numeri[i];

                    if(i==0){

                    numeri[i]=numeri[numeri.length-1];

                }else{

                   numeri[i]=numeri[numeri.length-(i+1)];

                }

                numeri[numeri.length-(i+1)]=arrayInv;
                
                System.out.print(numeri[i] + " ");

                }else{

                    System.out.print(numeri[i] + " ");

                }
            
            } 
            
        System.out.println("\n-----------------------------------------------------------------");

        System.out.println("Il numero massimo e': " + max);

        System.out.println("-----------------------------------------------------------------");

        if(coppia){

            System.out.println("Esistono numeri uguali nell'array.");

        }else{

             System.out.println("Non esistono numeri uguali nell'array.");
               
        }

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Il numero che si ripete di piu' e': " + contaV);

        System.out.println("--------------------------------ARRIVEDERCI---------------------------------");


        }



    }
