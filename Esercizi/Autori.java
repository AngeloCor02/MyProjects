
import java.util.Scanner;

public class Autori {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanti autori vuoi aggiungere?");
        int num = scan.nextInt();
        scan.nextLine();

        String [][] autore = creaAutori(num, scan);

        stampaAutori(autore, num);

        ricercaAutori(autore,num,scan);

        scan.close();

        }//fine main


        
        public static String [][] creaAutori(int num , Scanner scan){

        String[][] autore = new String[num][4];

        for(int i = 0;i<num;i++){

            

            for(int j=0; j<3;j++){

                System.out.print("Nome: ");

                autore[i][j] = scan.nextLine();

                j++;

                System.out.print("Data di nascita: ");

                autore[i][j] = scan.nextLine();

                j++;

                System.out.print("Lavoro: ");

                autore[i][j] = scan.nextLine();

                j++;
            }

            System.out.println();

        }

        return autore;

        }

        public static void stampaAutori(String[][] autore, int num){

            System.out.println("Gli autori che hai inserito sono:");

            for(int i=0;i<num;i++){

                System.out.print("- ");

                for(int j=0;j<3;j++){

                    System.out.print(autore[i][j] + " ");

                }

            System.out.println();

            }

        }

        public static void ricercaAutori(String[][] autore,int num, Scanner scan){

            System.out.println("Su quale autore vuoi informazioni?(Inserisci il nome)");

            String nome = scan.nextLine();

            for(int i=0;i<num;i++){

                if(autore[i][0].equals(nome)){

                    for(int j=0; j<3;j++){

                        System.out.print(autore[i][j] + " ");

                    }

                }

            }


        }

}
