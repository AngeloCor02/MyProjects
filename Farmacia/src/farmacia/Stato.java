package farmacia;

public class Stato {
	private String sperimentazione;
	private int numSpe;
	
	
	public int getNumSpe() {
		return numSpe;
	}
	public void setNumSpe(int numSpe) {
		this.numSpe = numSpe;
	}
	
	public String getSperimentazione() {
		return sperimentazione;
	}
	public void setSperimentazione(String sperimentazione) {
		this.sperimentazione = sperimentazione;
	}
	public Stato(String sperimentazione, int numSpe) {
		super();
		this.sperimentazione = sperimentazione;
		this.numSpe = numSpe;
	}
	@Override
	public String toString() {
		return "Stat [sperimentazione=" + sperimentazione + ", numSpe=" + numSpe + "]";
	}
	
	
	
}
