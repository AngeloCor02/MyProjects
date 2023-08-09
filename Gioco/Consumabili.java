public class Consumabili {
    
    private String nomeConsumabile;

   private int vita;

   private int quantita;

    public Consumabili(String nomeConsumabile, int vita, int quantita){

        this.nomeConsumabile = nomeConsumabile;

        this.vita = vita;

        this.quantita = quantita;

    }



    public String getNomeConsumabile() {
        return this.nomeConsumabile;
    }

    public void setNomeConsumabile(String nomeConsumabile) {
        this.nomeConsumabile = nomeConsumabile;
    }

    public int getVita() {
        return this.vita;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }


    public int getQuantita() {
        return this.quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }



}
