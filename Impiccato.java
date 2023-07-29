import java.util.Scanner;

public class Impiccato {
    
    public static void main(String[] args) {

    Scanner scan = new Scanner (System.in);

    String[] words = {"carta", "pizza", "cobra", "uovo", "scheda", "scarpa", "negozio", "capra",
    "pelle", "gallette", "leone", "barbone", "telefono", "ventola", "scimmia", "ventilatore",
    "mouse", "processore", "gatto", "lucertola", "lama", "panda", "sarta", "piccione", 
    "gambe", "coniglio", "computer", "lampada", "corvo","salmone", "carne", "sale",
    "rete", "lattina", "bottiglia", "rana", "cane", "ragno", "strada", "mercato",
    "tigre", "pane", "rinoceronte", "serpente", "tartaruga", "mutande", "balena", "lupo",
    "banana", "zebra"};

    char[] lettereSbagliate= new char[6];

    //QUI HO PRESO L'INDICE DELLA STRINGA NELL'ARRAY INIZIALE WORD PER PRENDERE LA PAROLA
    int indiceParolaRandom = (int) (Math.random()*words.length);

    //QUI ATTRAVERSO L'INDICE MI SALVO LA PAROLA IN UNA VARIABILE
    String parolaRandom = words[indiceParolaRandom];

    //QUI HO CREATO UN ARRAY CON LA PAROLA DA INDOVINARE IN MODO DA ATTRAVERSARLO LETTERA PER LETTERA
    char[] parola=new char[parolaRandom.length()];

    //QUI HO INIZIALIZZATO "SPAZI" COSI DA FAR FINIRE IL GIOCO SE GLI SPAZI FINIRANNO
    int spazi=parolaRandom.length();

    //RISP SERVIRA A PRENDERE L'INPUT DALL'UTENTE E CONFRONTARLO CON LE LETTERE DELLA PAROLA
    char risp=' ';

    //GLI TENTATIVI SERVONO PER CAMBIARE L'IMPICCATO QUANDO SBAGLIA
    int tentativi=0;


    //NELL'ARRAY VUOTO PIAZZO I TRATTINI PER FAR CAPIRE ALL'UTENTE QUANTO E' GRANDE LA PAROLA
        for(int i=0;i<parola.length;i++){

            parola[i] = '_';

        }

    int sbagli=0;

    boolean letteraRipetuta= false;

    while(spazi>0){

        letteraRipetuta= false;

        System.out.println("Indovina la parola usando una lettera alla volta: ");
        System.out.println("Hai " + (6-tentativi) + " tentativi.");


        stampaImpiccato(tentativi);

        System.out.println();

        for(char z : parola){

            System.out.print(z + " ");

        }

        System.out.println();

        risp=scan.next().charAt(0);
        for(int i=0;i<parola.length;i++){

            if(risp==parola[i]){

                letteraRipetuta=true;

            }

        }
        if(letteraRipetuta==true){

            continue;

        }


        sbagli=0;

        for(int i=0;i<parolaRandom.length();i++){

            if(parolaRandom.charAt(i)==risp){

                parola[i]=risp;

                spazi--;

                sbagli--;

            }else{

                sbagli++;

            }

        }
        if(sbagli==parolaRandom.length()){

            lettereSbagliate[tentativi]=risp;
            tentativi++;

        }

        System.out.print("Lettere sbagliate: ");
        for(int i=0;i<6;i++){

            if (lettereSbagliate[i]!=0){

                 System.out.print(lettereSbagliate[i] + " ");

            }

        }
        if(tentativi==6){

            break;

        }
        System.out.println();

    }
    
    stampaImpiccato(sbagli+1);

    System.out.println("\nLa parola era: " + parolaRandom);

    if(tentativi!=6){

        System.out.println("Complimenti hai indovinato la parola!!!");

    }

    scan.close();
    }//FINE MAIN


    public static void stampaImpiccato(int errori){

      switch(errori){


        case 0:
        
        System.out.println( "+---+\n" +
                            "|   |\n" +
                            "    |\n" +
                            "    |\n" +
                            "    |\n" +
                            "    |\n" +
                            "=========\n"); 

        break;

        case 1:
        
        System.out.println("+---+\n" +
        "|   |\n" +
        "O   |\n" +
        "    |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n"); 
        break;
        

        case 2:
        
         System.out.println("+---+\n" +
        "|   |\n" +
        "O   |\n" +
        "|   |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n");
        break;

        case 3:
        
         System.out.println(" +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|   |\n" +
        "     |\n" +
        "     |\n" +
        " =========\n");

        break;

        case 4:
        
         System.out.println(" +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" + 
        "     |\n" +
        "     |\n" +
        " =========\n");
        break;

        case 5:
        
          System.out.println(" +---+\n" +
                " |   |\n" +
                " O   |\n" +
                "/|\\  |\n" +
                "/    |\n" +
                "     |\n" +
                " =========\n");
        break;

        case 6:
        System.out.println(" +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" + 
        "/ \\  |\n" +
        "     |\n" +
        " =========\n");
        break;

      }  

    }

}//FINE TUTTO



