package dao;

import java.util.List;

import model.Ruolo;

public class RuoloDao {
	
	private List<Ruolo> listaRuolo;
	
	
	
	public boolean rimuovi(String idRuolo) {
		
		for(Ruolo a: listaRuolo) {
			
			if(idRuolo.equals(a.getIdRuolo())) {
				listaRuolo.remove(a);
				
				return true;
				
			}
			
		}
		return false;

	}
	
	public boolean aggiorna(Ruolo a) {
		
		for(Ruolo i : listaRuolo) {
			
			if(i.getIdRuolo().equals(a.getIdRuolo())) {
				
				i.setDescrizione(a.getDescrizione());
				return true;
			}
			
		}
		return false;
		
	}
	
	public void inserisci(Ruolo a) {
		
		listaRuolo.add(a);
		
	}
	
	public Ruolo ricercaidRuolo(String idRuolo) {
		
		for(Ruolo a:listaRuolo) {
			
			if(idRuolo.equals(a.getIdRuolo())) {
				
				return a;
				
			}
			
		}
		return null;
		
	}
}
