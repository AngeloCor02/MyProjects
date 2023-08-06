public class Accessori {
    
    private String nomeAccessorio;

    private int forza;

    private int vita;

    private int quantita;


    
    public Accessori(String nomeAccessorio, int forza, int vita, int quantita){

        this.nomeAccessorio = nomeAccessorio;

        this.forza = forza;

        this.vita = vita;

        this.quantita = quantita;

    }

    public Accessori(Accessori source){

        this.nomeAccessorio = source.nomeAccessorio;

        this.forza = source.forza;

        this.vita = source.vita;

        this.quantita = source.quantita;


    }





    public String getNomeAccessorio() {
        return this.nomeAccessorio;
    }

    public void setNomeAccessorio(String nomeAccessorio) {
        this.nomeAccessorio = nomeAccessorio;
    }

    public int getForza() {
        return this.forza;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }

    public int getVita() {
        return this.vita;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    public int getquantita() {
        return this.quantita;
    }

    public void setquantita(int quantita) {
        this.quantita = quantita;
    }

}
