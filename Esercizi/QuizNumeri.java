import java.util.Scanner;
public class QuizNumeri{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int punti = 0;

        System.out.println("------------------------------------------");

        System.out.println("BENVENUTO NEL GIOCO DEI QUIZ");


        System.out.println("2 * 3= ?");


        System.out.println("a.3\nb.5\nc.6\nd.9\nQual' e' la tua risposta");

        String ris = scan.nextLine();

        switch (ris) {

            case "a","b","d":
                
                System.out.println("Hai sbagliato");

                break;
        
            case "c":

            System.out.println("Bravo, risposta corretta!!!");

            punti++;

                break;
        }
        
        System.out.println("------------------------------------------");

        System.out.println("5 * 3= ?");

        System.out.println("a.30\nb.15\nc.90\nd.32\nQual' e' la tua risposta");

        ris = scan.nextLine();

        switch (ris) {

            case "a","c","d":
                
                System.out.println("Hai sbagliato");

                break;
        
            case "b":

            System.out.println("Bravo, risposta corretta!!!");

            punti++;

                break;
        }

        System.out.println("------------------------------------------");


        System.out.println("1 * 3= ?");

        System.out.println("a.3\nb.5\nc.6\nd.9\nQual' e' la tua risposta");

        ris = scan.nextLine();

        switch (ris) {

            case "c","b","d":
                
                System.out.println("Hai sbagliato");

                break;
        
            case "a":

            System.out.println("Bravo, risposta corretta!!!");

            punti++;

                break;
        }

        System.out.println("------------------------------------------");

        System.out.println("9 * 3= ?");

        System.out.println("a.1\nb.5\nc.6\nd.27\nQual' e' la tua risposta");

        ris = scan.nextLine();

        switch (ris) {

            case "a","b","c":
                
                System.out.println("Hai sbagliato");

                break;
        
            case "d":

            System.out.println("Bravo, risposta corretta!!!");

            punti++;

                break;
        }
        System.out.println("------------------------------------------");

        System.out.println("Il tuo punteggio e': " + punti + "/4");

        scan.close();

    }

}