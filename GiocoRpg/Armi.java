
public class Armi {
    
    private String nomeSpada;

    private int dannoFisico;

    private int quantita;

    
    public Armi(String nomeSpada, int dannoFisico, int quantita){

        this.nomeSpada = nomeSpada;

        this.dannoFisico = dannoFisico;

        this.quantita= quantita;


    }

    public Armi(Armi source){

        this.nomeSpada = source.nomeSpada;

        this.dannoFisico = source.dannoFisico;

        this.quantita = source.quantita;
    }




    public String getnomeSpada() {
        return this.nomeSpada;
    }

    public void setnomeSpada(String nomeSpada) {
        this.nomeSpada = nomeSpada;
    }

    public int getDannoFisico() {
        return this.dannoFisico;
    }

    public void setDannoFisico(int dannoFisico) {
        this.dannoFisico = dannoFisico;
    }

    public int getQuantita() {
        return this.quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }




}


