import java.util.Scanner;

public class Personaggi {
    
    private String nome;
    
    private int vita;

    private int vitaMassima;

    private int forza;

    private int difesa;



    public Personaggi(String nome,int vita, int forza, int difesa, Armi arma){

        this.nome = nome;

        this.vita = vita;

        this.difesa = difesa;

        this.forza = forza + arma.getDannoFisico();
        
    }

    

    public Personaggi(String nome,int vita, int forza, int difesa, int vitaMassima, Armi arma){

        this.nome = nome;

        this.vita = vita;

        this.difesa = difesa;

        this.vitaMassima = vitaMassima;

        this.forza = forza + arma.getDannoFisico();
        
    }

    public Personaggi(Personaggi source, Armi arma){

        this.nome = source.nome;

        this.vita = source.vita;

        this.difesa = source.difesa;

        this.forza = source.forza + arma.getDannoFisico();
    }


    public void avanza(Personaggi protagonista,Personaggi nemico, Personaggi nemici[] , Scanner scan, Consumabili[] consumabili, Accessori[] accessorio){
        
        System.out.println("-->" + this.nome + " STA AVANZANDO.");
        
        int nemicoScelto = sceltaNemico(nemici);

        int stanzaRandom = sceltaStanza();

        int levaRandom = sceltaStanza();

        /*
        *QUESTO IF FA PARTIRE UNA SERIE DI EVENTI.
        *NEL CASO DEL NUMERO CASUALE MINORE UGUALE DI 4, 
        *IL PROGRAMMA ENTRERA' NEL METODO "COMBATTIMENTO" ED INIZIERA' UN COMBATTIMENTO.    
        */

        if (stanzaRandom <= 4){

        System.out.println("\tIL COMBATTIMENTO E' INIZIATO!!!!\n");

            nemico.setVita(nemici[nemicoScelto].getVita());
            nemico.setForza(nemici[nemicoScelto].getForza());
            nemico.setDifesa(nemici[nemicoScelto].getDifesa());
            nemico.setNome(nemici[nemicoScelto].getNome());

            /*
            *QUESTO WHILE NON FINIRA' MAI, FINCHE' 
            *UNO TRA IL PROTAGONISTA E IL NEMICO CASUALE NON ARRIVA A 0 DI VITA.
            */
            
            while (protagonista.getVita()>0 && nemico.getVita() > 0) {

                combattimento(protagonista, nemico, scan, consumabili, nemicoScelto);

            }

        /*
        *QUESTO ELSE IF NEL CASO DEL NUMERO CASUALE = 5 AGGIUNGERA' 1 "quantita" AL CONSUMABILE "consumabili[0]".
        */   

        }else if(stanzaRandom==5){

            aggiungiPozioneVita(consumabili);


        }else if(stanzaRandom == 6){

            System.out.println("-->GIRAVI PER LA STANZA E PER SBAGLIO HAI CALPESATO UNA PEDANA<--");

            if((int)(Math.random()*2+1) == 1){

                System.out.println( "_______|\\                  _______|\\  \r\n" + //
                                    "_______  |>                _______  |>\r\n" + //
                                    "       |/       _______|\\         |/      \r\n" + //
                                    "                _______  |>      \r\n" + //
                                    "                       |/           \r\n" + //
                                    "    \t_______|\\\r\n" + //
                                    "    \t_______  |> \r\n" + //
                                    "               |/    _______|\\        \r\n" + //
                                    "\t\t     _______  |>      \r\n" + //
                                    "\t\t            |/                    \r\n" + //
                                    "    \t_______|\\\r\n" + //
                                    "    \t_______  |> \r\n" + //
                                    "               |/");

                System.out.println("-->DEI DARDI SI SONO SCAGLIATI SU DI TE E TI HANNO FATTO DEL DANNO<--\n");

                protagonista.setVita(protagonista.getVita()-3);

            }else{

                System.out.println("-->PER FORTUNA NON E' SUCCESSO NULLA<--\n");

            }

        }else if(stanzaRandom == 7){

            String risposta;

            System.out.println( "          __\r\n" + //
                                "         |__|\r\n" + //
                                "          \\ \\\r\n" + //
                                "           \\ \\\r\n" + //
                                "            \\ \\\r\n" + //
                                "             \\ \\\r\n" + //
                                "            __\\ \\__\r\n" + //
                                "          _/       \\_\r\n" + //
                                "         |___________|\n");

            System.out.println("-->SEI ENTRATO NELLA STANZA ED HAI TROVATO UNA LEVA<--\n-->VUOI ATTIVARE LA LEVA?(si/no)");

            risposta=scan.nextLine();

            if(risposta.equals("si")){

                if(levaRandom == 1){

                    System.out.println("-->HAI ATTIVATO LA LEVA E SI E' APERTA UNA VORAGINE SOTTO DI TE FACENDOTI CADERE NEL VUOTO.");
                    System.out.println("-->SEI CADUTO SU DEGLI SPUNTONI\n -->SEI MORTO");
                    protagonista.setVita(0);
                    
                }else if(levaRandom >= 2 && levaRandom<=6){

                    System.out.println("-->SI APRE UN MURO D'AVANTI A TE E SCORGI UN FORZIERE AL SUO INTERNO\n"+
                    "-->TI AVVICINI AL FORZIERE E TROVI UN AMULETO DELLA FORZA.\n-->VUOI METTERLO NELL'INVENTARIO?(si/no)");
                    risposta=scan.nextLine();

                    if(risposta.equals("si")){

                        

                    }


              }

            }

        }else{

            System.out.println("-->CHE PECCATO NON HAI TROVATO NULLA IN QUESTA STANZA<--\n");


        }


    }
   

    public void recuperaVita(Personaggi protagonista, Consumabili[] consumabile){
        

        if(consumabile[0].getQuantita()>0){

            protagonista.setVita(protagonista.getVita()+consumabile[0].getVita());

            System.out.println( "      _\r\n" + //
                                "    _/_\\_\r\n" + //
                                "   /  _  \\\r\n" + //
                                "  / _| |_ \\ \r\n" + //
                                " | |_   _| |\r\n" + //
                                " |_  |_|  _|\r\n" + //
                                "   \\_____/\n");

            System.out.println("-->LA CURA E' ANDATA A BUON FINE<--");

            if(protagonista.getVita() > protagonista.getVitaMassima()){

                protagonista.setVita(protagonista.getVitaMassima());

            }

            consumabile[0].setQuantita(consumabile[0].getQuantita()-1);

            System.out.println("-->RIMANGONO " + consumabile[0].getQuantita() + " POZIONI DELLA VITA<--\n");

        }else{

            System.out.println("-->CERCHI UNA POZIONE DELLA VITA NELLO ZAINO MA TI ACCORGI CHE SONO FINITE.<--\n");

        }


    }



    public void attacca(Personaggi protagonista, Personaggi nemico,int nemicoScelto){

        System.out.println( "            /\\ \r\n" + //
                            "           /  \\  \r\n" + //
                            "           |  | \r\n" + //
                            "           |  | \r\n" + //
                            "           |  |  \r\n" + //
                            "           |  | \r\n" + //
                            "           |  | \r\n" + //
                            "           |  |  \r\n" + //
                            "           |  | \r\n" + //
                            "           |  | \r\n" + //
                            "         __|__|__ \r\n" + //
                            "    ____/        \\____                     \r\n" + //
                            "    \\______    ______/                 \r\n" + //
                            "           |  | \r\n" + //
                            "           |  |        \r\n" + //
                            "          _|  |_          \r\n" + //
                            "          \\____/\n");

        if(sceltaCasuale() == true){

            protagonista.setVita((protagonista.getVita() - nemico.getForza()) + (protagonista.getDifesa()/2));

            nemico.setVita((nemico.getVita() - protagonista.getForza()) + (nemico.getDifesa()/2));

            System.out.println("-->IL NEMICO HA ATTACCATO.<--\n");

        }else{

            nemico.setVita(nemico.getVita() - protagonista.getForza()+ nemico.getDifesa());

            System.out.println("-->IL NEMICO SI E' DIFESO.<--\n");

        }

    }

    


    public void difendi(Personaggi protagonista, Personaggi nemico,int nemicoScelto){

        System.out.println( "\t _______\r\n" + //
                            "\t/       \\\r\n" + //
                            "       /         \\\r\n" + //
                            "      /           \\\r\n" + //
                            "     /             \\\r\n" + //
                            "    |               |\r\n" + //
                            "     \\             /\r\n" + //
                            "      \\           /\r\n" + //
                            "       \\         /\r\n" + //
                            "        \\_______/\n");

        if(sceltaCasuale() == true){

            protagonista.setVita(protagonista.getVita() - nemico.getForza() + protagonista.getDifesa());

            System.out.println("-->IL NEMICO HA ATTACCATO.<--\n");

        }else{

            System.out.println("-->VI SIETE ENTRAMBI DIFESI.<--\n");

        }

    }




    public void combattimento(Personaggi protagonista, Personaggi nemico, Scanner scan, Consumabili[] consumabili,int nemicoScelto){

        statisticheCombattimento(protagonista, nemico, nemicoScelto);

        System.out.println("1. ATTACCA\n2. DIFENDITI\n3. CURATI\nINSERISCI LA TUA SCELTA: ");
            
        int risp = scan.nextInt();
                
        scan.nextLine();

            switch (risp) {
            
                    case 1:

                        attacca(protagonista, nemico, nemicoScelto);
                                
                        break;
            
                    case 2:
            
                        difendi(protagonista, nemico, nemicoScelto);
                               
                        break;

                    case 3:

                        recuperaVita(protagonista, consumabili);

                        break;
                }

                if(protagonista.getVita() <= 0){

                    statisticheCombattimento(protagonista, nemico, nemicoScelto);

                    System.out.println("-->HAI PERSOOOO!!!<--");
                            

                }else if(nemico.getVita() <= 0){

                    statisticheCombattimento(protagonista, nemico, nemicoScelto);

                    System.out.println("-->HAI VINTOOOO!!!<--");
                
                    

                }

    }

    /*
     * METODO aggiungiPozioneVita
     * AGGIUNGE 1 ALLA quantita DEL CONSUMABILE "consumabili[0]".
     */

    public void aggiungiPozioneVita(Consumabili[] consumabili){

        System.out.println("      _\r\n" + //
                                "    _/_\\_\r\n" + //
                                "   /  _  \\\r\n" + //
                                "  / _| |_ \\ \r\n" + //
                                " | |_   _| |\r\n" + //
                                " |_  |_|  _|\r\n" + //
                                "   \\_____/\n");

            System.out.println("-->GIRAVI PER LA STANZA E HAI TROVATO UNA POZIONE DELLA VITA<--");

            consumabili[0].setQuantita((consumabili[0].getQuantita()+1));

            System.out.println("-->QUANTITA' ATTUALE: " + consumabili[0].getQuantita() + "\n");

    }

    /*
     * Metodo sceltaNemico
     * 
     * Serve per scegliere casualmente il nemico con cui si andrà ad affrontare il protagonista
     * 
     * Attraverso un numero casuale si prendereà un nemico uno tra i personaggi e si salvera ogni volta nell'oggetto nemico
     * 
     */
    public int sceltaNemico(Personaggi[] nemici){

        return (int)(Math.random()*2);

    }



    /*
     * Metodo sceltaStanza
     * 
     * Utilizzo: serve per ritornare un numero int da 1 a 10
     * 
     * E' stato aggiunto per dare una randomicità alla scelta della stanza
     * 
    */
    public int sceltaStanza(){

        return (int)(Math.random()*10+1);

    }


    /*
     * METODO sceltaCasuale();
     * 
     * Ritorna un valore booleano casuale
     * 
     * Ritorna "true" o "false" con una probabilità del 50% 
     * 
     * E' stato usato per la scelta dell'attacco o la difesa del nemico
     * 
     */

    public boolean sceltaCasuale(){

        if ((int)(Math.random()*2+0) == 1){

            return true;

        }else{

            return false;

        }

    }


    /*
     * METODO statisticheCombattimento();
     * 
     * Stampa le statistiche del protagonista e del nemico
     * 
     * Viene stampato dall'inizio di un combattimento ogni azione che compie il protagonista.
     * 
     */

    public static void statisticheCombattimento(Personaggi protagonista, Personaggi nemico,int  nemicoScelto){

        if(protagonista.getVita()>=10){

            System.out.println("-----------------------------------------------------------------");

            System.out.println("\t" + protagonista.getNome() + "\t\t\t\t\t" + nemico.getNome() + "\n");

            System.out.print("\tVita: " + protagonista.getVita() + "\t\t\t\tVita: " + nemico.getVita() + 

            "\n\tForza: " + protagonista.getForza() + "\t\t\t\tForza: " + nemico.getForza() + 

            "\n\tDifesa: " + protagonista.getDifesa() + "\t\t\t\tDifesa: " + nemico.getDifesa());

            System.out.println("\n-----------------------------------------------------------------");

        }else{

            System.out.println("-----------------------------------------------------------------");

            System.out.println("\t" + protagonista.getNome() + "\t\t\t\t\t" + nemico.getNome() + "\n");

            System.out.print("\tVita: " + protagonista.getVita() + "\t\t\t\t\tVita: " + nemico.getVita() + 

            "\n\tForza: " + protagonista.getForza() + "\t\t\t\tForza: " + nemico.getForza() + 

            "\n\tDifesa: " + protagonista.getDifesa() + "\t\t\t\tDifesa: " + nemico.getDifesa());

            System.out.println("\n-----------------------------------------------------------------");

        }

        

    }


    public String toString(){

        String stringa = ("Nome: " + this.getNome() + "\nVita: " +this.getVita() + "\nForza: " +this.getForza() +
        "\nDifesa: " +this.getDifesa());

        return stringa;

    }


    public int getVita() {
        return this.vita;
    }

    public void setVita(int vita) {
        this.vita = vita;        
    }

    public int getVitaMassima() {
        return this.vitaMassima;
    }

    public void setVitaMassima(int vitaMassima) {
        this.vitaMassima = vitaMassima;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForza() {
        return this.forza;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }

    public int getDifesa() {
        return this.difesa;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
    }


    

}
