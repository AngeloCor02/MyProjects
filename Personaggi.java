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

    

    public Personaggi(String nome,int vita, int forza, int difesa, int vitaMassima, Armi arma, Accessori accessorioPrinciple){

        this.nome = nome;

        this.vita = vita;

        this.difesa = difesa;

        this.vitaMassima = vitaMassima;

        this.forza = forza + arma.getDannoFisico() + accessorioPrinciple.getForza();
        
    }

    public Personaggi(Personaggi source, Armi arma){

        this.nome = source.nome;

        this.vita = source.vita;

        this.difesa = source.difesa;

        this.forza = source.forza + arma.getDannoFisico();
    }

    

    public void avanza(Personaggi protagonista,Personaggi nemico, Personaggi nemici[] , Scanner scan, Consumabili[] consumabili, Accessori[] accessorio,Accessori accessorioPrincipale, Armi armaPrincipale, Armi[] arma){
        
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

            scambioStatsNemico(nemico, nemici, nemicoScelto);

            System.out.println("\tIL COMBATTIMENTO E' INIZIATO!!!!\n");

            

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

            attivazioneDardi(protagonista);

        }else if(stanzaRandom == 7){

            leva(levaRandom, scan, protagonista, accessorio, accessorioPrincipale, arma, armaPrincipale, consumabili);

        }else{

            System.out.println("-->PECCATO NON HAI TROVATO NULLA IN QUESTA STANZA, ALMENO NON CI SONO NEMICI<--\n");

        }


    }
   
    
    


    /*
     * METODO combattimento
     * 
     * QUESTO METODO FARA' PARTIRE IL COMBATTIMENTO CON UN NEMICO CASUALE,
     * 
     * QUESTO METODO FINIRA' SOLO SE IL PROTAGONISTA O IL NEMICO HA MENO DI 1 DI VITA.
     * 
     */

    public void combattimento(Personaggi protagonista, Personaggi nemico, Scanner scan, Consumabili[] consumabili,int nemicoScelto){

        statisticheCombattimento(protagonista, nemico);

        System.out.println("1. ATTACCA\n2. DIFENDITI\n3. CURATI\nINSERISCI LA TUA SCELTA: ");
            
        int risp = scan.nextInt();
                
        scan.nextLine();

            switch (risp) {
            
                    case 1:

                        attacca(protagonista, nemico);
                                
                        break;
            
                    case 2:
            
                        difendi(protagonista, nemico);
                               
                        break;

                    case 3:

                        recuperaVita(protagonista, consumabili);

                        break;
                }

                if(protagonista.getVita() <= 0){

                    statisticheCombattimento(protagonista, nemico);

                    System.out.println("-->HAI PERSOOOO!!!<--\n");
                            

                }else if(nemico.getVita() <= 0){

                    statisticheCombattimento(protagonista, nemico);

                    System.out.println("-->HAI VINTOOOO!!!<--\n");
                
                    

                }

    }

    /*
     * METODO recuperaVita
     * 
     * VIENE USATO PER DIMINUIRE LA QUANTITA' DEL CONSUMABILE consumabile[0] E AUMENTA LA VITA DEL PROTAGONISTA.
     * 
     * LA VITA MASSIMA DEL PROTAGONISTA VERRA' SEMPRE RISPETTATA QUINDI DOPO LA CURA,SE LA VITA NON SUPERERA' MAI LA VITA MASSIMA DEL PROTAGONISTA.
     * 
     * SE LA QUANTITA  DI consumabile[0] NON E' MAGGIORE DI 0 LA CURA NON AVVERRA'.
     */

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



    /*
     * METODO attacca
     * IL PROGRAMMA ENTRERA' IN QUESTO METODO SE L'UTENTE SCEGLIE DI ATTACCARE,
     * 
     * DECIDE LA VITA DEL PROTAGONISTA E DEL NEMICO DOPO LO SCONTRO.
     * 
     */

    public void attacca(Personaggi protagonista, Personaggi nemico){

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

    
    /*
     * METODO attacca
     * IL PROGRAMMA ENTRERA' IN QUESTO METODO SE L'UTENTE SCEGLIE DI DIFENDERSI,
     * 
     * DECIDE LA VITA DEL PROTAGONISTA E DEL NEMICO DOPO LO SCONTRO.
     * 
     */

    public void difendi(Personaggi protagonista, Personaggi nemico){

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
     * METODO attivazioneDardi
     * 
     * IL PROGRAMMA ENTRERA' IN QUESTO METODO TRAMITE UN NUMERO CASUALE.
     * 
     * E CI SARA' LA POSSIBILITA' DEL 50% DI ATTIVARE I DARDI O NO
     * 
     * SE VERRANNO ATTIVATI IL PROTAGONISTA PERDERA' 3 DI VITA
     */

    public void attivazioneDardi(Personaggi protagonista){

        System.out.println("-->GIRAVI PER LA STANZA E PER SBAGLIO HAI CALPESATO UNA PEDANA<--");

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

            if((int)(Math.random()*2+1) == 1){

                

                System.out.println("-->DEI DARDI SI SONO SCAGLIATI SU DI TE E TI HANNO FATTO DEL DANNO\n");

                protagonista.setVita(protagonista.getVita()-3);

            }else{

                System.out.println("-->DEI DARDI SI SONO SCAGLIATI SU DI TE E TI SEI ABBASSATO GIUSTO IN TEMPO PER SCHIVARLE\n");

            }


    }

    /*
     * 
     * METODO leva
     * 
     * IL PROGRAMMA ENTRA IN QUESTO METODO CON UN NUMERO CASUALE
     * 
     * SI AVVIERANNO VARI EVENTI ATTRAVERSO NUMERI CAUSALI 
     * 
     */
    public void leva(int levaRandom, Scanner scan, Personaggi protagonista,Accessori[] accessorio, Accessori accessorioPrincipale,Armi[] arma,Armi armaPrincipale, Consumabili[] consumabili){

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
                    
                }else if(levaRandom >= 2 && levaRandom<=4){

                    System.out.println("-->SI APRE UN MURO D'AVANTI A TE E SCORGI UN FORZIERE AL SUO INTERNO\n"+
                    "-->TI AVVICINI AL FORZIERE E TROVI UN AMULETO DELLA FORZA.\n-->E' STATO MESSO NELL'INVENTARIO.\n\n"+
                    "-->VUOI EQUIPAGGIARLO?(si/no)");

                    accessorio[0].setquantita((accessorio[0].getquantita()+1));


                    risposta=scan.nextLine();

                    if(risposta.equals("si")){

                        accessorioPrincipale.setNomeAccessorio(accessorio[0].getNomeAccessorio());

                        accessorioPrincipale.setForza(accessorio[0].getForza());

                        protagonista.setForza(protagonista.getForza() + accessorioPrincipale.getForza());

                    }

                }else if(levaRandom >= 5 && levaRandom <= 7){

                    System.out.println("-->SI APRE UN MURO D'AVANTI A TE E SCORGI UN FORZIERE AL SUO INTERNO\n"+
                    "-->TI AVVICINI AL FORZIERE E TROVI UNO SPADONE.\n-->E' STATO MESSO NELL'INVENTARIO.\n\n");
                    

                    if(arma[2].getQuantita()>=1){

                        System.out.println("-->A QUANTO PARE NE HAI GIA 1 LA AGGIUNGI ALL'INVENTARIO.\n");
                        
                    }else{
                        System.out.println("-->VUOI EQUIPAGGIARLO?(si/no)");

                        risposta=scan.nextLine();

                        if(risposta.equals("si")){

                            armaPrincipale.setnomeSpada((arma[2].getnomeSpada()));

                            armaPrincipale.setDannoFisico(arma[2].getDannoFisico());

                            protagonista.setForza(protagonista.getForza() + armaPrincipale.getDannoFisico());

                        }

                    }
                    
                    arma[2].setQuantita(arma[2].getQuantita()+1);

                    

                }else if(levaRandom >= 8 && levaRandom <= 10){

                    System.out.println("-->SI APRE UN MURO D'AVANTI A TE E SCORGI UN FORZIERE AL SUO INTERNO\n"+
                    "-->TI AVVICINI AL FORZIERE E TROVI UN AMULETO DELLA VITA.\n-->E' STATO MESSO NELL'INVENTARIO.\n\n"+
                    "-->VUOI EQUIPAGGIARLO?(si/no)");

                    accessorio[1].setquantita((accessorio[1].getquantita()+1));

                    risposta=scan.nextLine();

                    if(risposta.equals("si")){

                        accessorioPrincipale.setNomeAccessorio(accessorio[1].getNomeAccessorio());

                        accessorioPrincipale.setVita((accessorio[1].getVita()));

                        protagonista.setVitaMassima((protagonista.getVitaMassima() + accessorioPrincipale.getVita()));

                        protagonista.setVita(protagonista.getVita() + 10);

                    }

              }

            }


    }


    /*
     * METODO scambioStatsNemico
     * 
     * PRENDE UN NEMICO CASUALE NELL' ELENCO DEI NEMICI E LO METTE NELL'OGGETT "nemico",
     * L'HO USATO PER NON PERDERE LE STATISTICHE INIZIALI DEI NEMICI.
     * 
     */

    public void scambioStatsNemico(Personaggi nemico,Personaggi[] nemici, int nemicoScelto){

        nemico.setVita(nemici[nemicoScelto].getVita());
        nemico.setForza(nemici[nemicoScelto].getForza());
        nemico.setDifesa(nemici[nemicoScelto].getDifesa());
        nemico.setNome(nemici[nemicoScelto].getNome());

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

    public static void statisticheCombattimento(Personaggi protagonista, Personaggi nemico){

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


    /*
     * L'HO USATO PER STAMPARE LE STATISTICHE DEL PROTAGONISTA.
     */
    public String toString(){

        String stringa = ("Nome: " + this.getNome() + "\nVita: " +this.getVita() + "\nForza: " +this.getForza() +
        "\nDifesa: " + this.getDifesa());

        return stringa;

    }

    /* 
    * GETTER E SETTER
    */
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


    

}//FINE CLASSE
