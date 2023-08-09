package esercizi;

import java.util.Scanner;

public class Esercizio_congettora_di_collaz {

	public static void main(String[] args) {
		
		/*
		in pratica la congettura di collaz è che noi prendiamo un qualsiasi numero a caso
		se è pari lo dividiamo per due
		se è dispari lo moltiplicamo per 3 e lo sommiamo ad 1
		se continueremo a fare ste 2 cose arriverà per forza ad 1
		*/
		
		Scanner tastiera = new Scanner(System.in);
			
		int contatore=0;
		
		
		System.out.println("Digita un numero: ");
		int num = tastiera.nextInt();
		int x= num;//salviamo num in un altra variabile per scriverlo alla fine nel print senò si andrebbe a perdere
		
		while (num!=1) {
			
			System.out.print(num + ", ");
		
			if(num % 2== 0) {
	
				num/=2;
			
			}else {
			
				num=num*3+1;
			
			}
			
			contatore++;

			if(contatore%10==0) {
				System.out.println("");
			}
		}//fine while
		
		System.out.println("1.");
		
		System.out.println("Per far arrivare ad 1 dal numero " + x +" sono stati necessari " + contatore + " passaggi.");
		
		tastiera.close();
		
		}//fine main
	}


