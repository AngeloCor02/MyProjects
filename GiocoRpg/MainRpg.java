import java.util.Scanner;

public class MainRpg{

    public static void main(String[] args) {
////////////////////////////ACCESSORI/////////////////////////////////////
        Accessori[] accessorio = new Accessori[]{

            new Accessori("Amuleto della forza", 3, 3, 0),
            new Accessori("Amuleto della vita", 0, 5, 0),

        };
////////////////////////CONSUMABILI///////////////////////////////////////////////

        Consumabili[] consumabili = new Consumabili[]{

            new Consumabili("Pozione della vita",7,2),

        };

//////////////////////ARMI////////////////////////////////////////////////

        Armi[] arma = new Armi[]{

            new Armi("Spada lunga", 3, 1),

            new Armi("Arco", 2, 0),

        };

        Armi armaPrincipale = new Armi(arma[0]);

////////////////PERSONAGGI////////////////////////////////////////////////////        

        Personaggi protagonista = new Personaggi("Cortiz", 25, 4, 2, 25, armaPrincipale);

        Personaggi[] nemici = new Personaggi[]{

            new Personaggi("Gondulf", 12, 3, 2, arma[armaCasualeNemico()]),
            new Personaggi("Randgarz", 10,  4, 2, arma[armaCasualeNemico()]),

        };

        Personaggi nemico = new Personaggi(nemici[0],arma[armaCasualeNemico()] );

//////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("IL GIOCO E' INIZIATO!!");

        gioco(protagonista,nemico, nemici, consumabili, armaPrincipale, arma, accessorio);  

        System.out.println("IL GIOCO E' FINITO!!!");
    
        }



    public static void gioco(Personaggi protagonista, Personaggi nemico, Personaggi[] nemici, Consumabili[] consumabili , Armi armaPrincipale, Armi[] arma, Accessori[] accessorio){

        Scanner scan = new Scanner(System.in);

        System.out.println( ".....................................\r\n" + //
                            "..................|_______...........\r\n" + //
                            ".....()...........|      /....().....\r\n" + //
                            "....(  )..........|______\\...(  )....\r\n" + //
                            "...(____).........|.........(____)...\r\n" + //
                            "...|    |_________|_________|    |...\r\n" + //
                            "...|    |___|___|___|___|___|    |...\r\n" + //
                            "...|    |__|___|___|___|____|    |...\r\n" + //
                            "...|    |___|___|___|___|___|    |...\r\n" + //
                            "...|    |__|___|___|___|____|    |...\r\n" + //
                            "...|    |_|__ _________\t__|_|    |...\r\n" + //
                            "...|    |__|_|    |    |_|__|    |...\r\n" + //
                            "...|    |_|__|    |    |__|_|    |...\r\n" + //
                            "...|    |__|_|\t  |    |_|__|    |...\r\n" + //
                            "...|    |_|__|   O|O   |__|_|    |...\r\n" + //
                            "../______\\___|____|____|___/______\\..\r\n" + //
                            ".....................................\r\n" + //
                            ".....................................");

            while(protagonista.getVita()>0){
            

            System.out.println("1.MOSTRA LE TUE STATISTICHE\n2.INVENTARIO\n3.VAI A SINISTRA\n4.VAI AVANTI\n5.VAI A DESTRA\n\nINSERISCI LA TUA SCELTA: ");

            int risp = scan.nextInt();

            scan.nextLine();

            switch (risp) {

                case 1:
                
                    System.out.println("----------------------------------------------");
                    
                    System.out.println(protagonista.toString()); 

                    System.out.println("----------------------------------------------");
                    
                    break;

                case 2:

                    inventario(protagonista, consumabili, arma, accessorio, scan);
                    

                    break;

                default :

                    protagonista.avanza(protagonista,nemico, nemici, scan, consumabili, accessorio);
    
                    break;


            }

        }

        scan.close();


    }


    public static void inventario(Personaggi protagonista, Consumabili[] consumabili, Armi[] arma, Accessori[] accessorio,Scanner scan){

        String risposta;

        System.out.println("-->ARMI");

        for(int i=0;i < arma.length;i++ ){

            if(arma[i].getQuantita() != 0){

                System.out.println(arma[i].getnomeSpada());

            }

        }
        

        System.out.println("\n-->CONSUMABILI");

        for(int i=0;i < consumabili.length ;i++ ){

            if(consumabili[i].getQuantita() != 0){

                System.out.println(consumabili[i].getNomeConsumabile() + " "+ consumabili[i].getQuantita());

            }

        }

        System.out.println("\n-->ACCESSORI");
                    
        for(int i=0;i < accessorio.length ;i++ ){

            if(accessorio[i].getquantita() != 0){

                System.out.println(accessorio[i].getNomeAccessorio() + " " + consumabili[i].getQuantita());

            }

        }

        System.out.println();


        System.out.println("SCRIVI 'Q' PER CURARTI");
        System.out.println("SCRIVI 'W' PER TRONARE INDIETRO");
        risposta=scan.nextLine();

        if(risposta.equalsIgnoreCase("q")){

            protagonista.recuperaVita(protagonista, consumabili);

        }

    }



    public static int armaCasualeNemico(){

        return (int)(Math.random()*2);


    }

}

    