package esercizi;

import java.util.Scanner;

public class NumeriPrimi {
    public static boolean isPrime(int x){
        if(x == 1)
            return false;
        if(x == 2)
            return true;
        for(int divisore = 2; divisore < Math.sqrt(x); divisore++){
            if(x % divisore == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero: ");
        int numero = scan.nextInt();

        String risultato = isPrime(numero) ? " è Primo" : " non è Primo";
        
        System.out.println(numero + risultato);
    }
}
