import java.util.Scanner;

public class SassoCartaForbice {
    
    public static void main(String[] args) {

        System.out.println("---------------------------------------------");

        System.out.println("BENVENUTO NEL GIOCO");

        if (risultato()){

            System.out.println("Hai vinto!!!!");

        }else{

            System.out.println("Hai perso!");

        }

    }

    public static String sceltaDelGiocatore(){

    Scanner scan = new Scanner(System.in);

    System.out.println("Scegli un opzione tra sasso/carta/forbice."); 

    String risp= scan.nextLine();

    scan.close();

    return risp;

    }

    public static String sceltaDelPc(){

        String sceltaPc = " ";

        switch ((int)(Math.random()*3+1)) {
            case 1:
                
                System.out.println("Ho scelto sasso");

                sceltaPc="sasso";

                break;
        
            case 2:

                System.out.println("Ho scelto forbice");

                sceltaPc="forbice";

                break;
                
            case 3:

                System.out.println("Ho scelto carta");

                sceltaPc="carta";

                break;
        }

        return sceltaPc;

    }


    public static boolean risultato(){

        String sceltaGiocatore = sceltaDelGiocatore();

        System.out.println("---------------------------------------------");

        String sceltaPc = sceltaDelPc();

        if(sceltaGiocatore.equals("sasso") && sceltaPc.equals("carta")){

            return false;

        }else if(sceltaGiocatore.equals("forbice") && sceltaPc.equals("sasso")){

            return false;

        }else if(sceltaGiocatore.equals("carta") && sceltaPc.equals("forbice")){

            return false;

        }else if(sceltaGiocatore.equals(sceltaPc)){

            System.out.println("Abbiamo pareggiato bella mossa!!!");

            System.exit(0);

            return false;

        }else{

            return true;

        }


    }

}
