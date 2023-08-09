
import java.util.Scanner;
public class DiceJack {
    
    public static void main(String[] args) {
        
        boolean win = rollDice();

        check(win);

    }




    public static boolean rollDice(){

        Scanner scan = new Scanner(System.in);

        boolean win = false;

        int somma = 0;
        int sommaDue = 0;

        System.out.println("Inserisci 3 numeri: ");

        int numUno = scan.nextInt();
        int numDue = scan.nextInt();
        int numTre = scan.nextInt();

        System.out.println("I tuoi numeri sono: " + numUno + " " + numDue + " " + numTre);

        if(maggiore6(numUno,numDue,numTre)||minore0(numUno, numDue, numTre)){

            System.out.println("I numeri non rispettano il range, addio!!!");

            System.exit(0);

        }

        sommaDue=numUno+numDue+numTre;

        scan.close();

        for(int i=0;i<3;i++){

            somma+= (int) (Math.random()*6+1);

        }

        if(somma<sommaDue && sommaDue-somma<3){

           return win=true;

        }else{

            return win;

        }

    }

    public static void check(boolean win){

        System.out.println();

        if (win){

            System.out.println("Congratulazioni hai vinto!!!");

        }else{

            System.out.println("Hai perso!!");

        }

        System.out.println("ADDIO!!!");

    }

    public static boolean maggiore6(int x, int y, int z){

        if(x>6||y>6||z>6){

            return true;

        }else{

            return false;
        }

        }

    public static boolean minore0(int x, int y, int z){

        if(x<0||y<0||z<0){

            return true;

        }else{

            return false;

        }


    }

}


