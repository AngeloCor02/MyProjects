package farmacia;

import java.util.Date;

public class Medicinale {

/*
Si realizzi un’applicazione Java per la gestione di un elenco di medicinali garantendo i 
seguenti requisiti e/o funzionalità:
Un medicinale è caratterizzato dal nome, l’azienda di produzione, la data di scadenza 
e il numero di unità disponibili. Inoltre, un medicinale può essere sperimentale cioè, 
possedere uno stato di avanzamento della sperimentazione (Inizio, Intermedio e Fine) 
e dal numero di giorni sotto sperimentazione.




*/
	
	private String nome;
	private String nomeAzienda;
	private Date data;
	private int numero;
	private Stato a;
	
	
	
	
	
	public Medicinale(String nome, String nomeAzienda, Date data, int numero, Stato a) {
		super();
		this.nome = nome;
		this.nomeAzienda = nomeAzienda;
		this.data = data;
		this.numero = numero;
		this.a = a;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeAzienda() {
		return nomeAzienda;
	}
	public void setNomeAzienda(String nomeAzienda) {
		this.nomeAzienda = nomeAzienda;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	public Stato getA() {
		return a;
	}
	public void setA(Stato a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Medicinale [nome=" + nome + ", nomeAzienda=" + nomeAzienda + ", data=" + data.getYear()+"/"+ data.getMonth()+"/"+data.getDay()  + ", numero=" + numero
				+ ", a=" + a + "]";
	}
	
	
	
	
	
}
