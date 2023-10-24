package dao;

import java.util.List;

import model.Impiegato;

public class ImpiegatoDao {

	private List<Impiegato> listaImpiegato;
	
	public boolean rimuovi(String codiceFiscale) {
		
		for(Impiegato a: listaImpiegato) {
			
			if(codiceFiscale.equals(a.getCodiceFiscale())) {
				listaImpiegato.remove(a);
				
				return true;
				
			}
			
		}
		return false;

	}
	
	public boolean aggiorna(Impiegato a) {
		
		for(Impiegato i : listaImpiegato) {
			
			if(i.getCodiceFiscale().equals(a.getCodiceFiscale())) {
				
				i.setCognome(a.getCognome());
				i.setNome(a.getNome());
				i.setMatricola(a.getMatricola());
				return true;
			}
			
		}
		return false;
		
	}
	
	public void inserisci(Impiegato a) {
		
		listaImpiegato.add(a);
		
	}
	
	public Impiegato ricercaCodiceFiscale(String codiceFiscale) {
		
		for(Impiegato a:listaImpiegato) {
			
			if(codiceFiscale.equals(a.getCodiceFiscale())) {
				
				return a;
				
			}
			
		}
		return null;
		
	}
	
}
