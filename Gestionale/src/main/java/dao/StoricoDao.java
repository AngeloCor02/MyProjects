package dao;

import java.util.List;

import model.Storico;

public class StoricoDao {

private List<Storico> listaStorico;
	
	public boolean rimuovi(String idStorico) {
		
		for(Storico a: listaStorico) {
			
			if(idStorico.equals(a.getIdStorico())) {
				listaStorico.remove(a);
				
				return true;
				
			}
			
		}
		return false;

	}
	
	public boolean aggiorna(Storico a) {
		
		for(Storico i : listaStorico) {
			
			if(i.getIdStorico().equals(a.getIdStorico())) {
				
				i.setDataFine(a.getDataFine());
				i.setDataInizio(a.getDataInizio());
				i.setIdRuolo(a.getIdRuolo());
				i.setMatricola(a.getMatricola());
				return true;
			}
			
		}
		return false;
		
	}
	
	public void inserisci(Storico a) {
		
		listaStorico.add(a);
		
	}
	
	public Storico ricercaidStorico(String idStorico) {
		
		for(Storico a:listaStorico) {
			
			if(idStorico.equals(a.getIdStorico())) {
				
				return a;
				
			}
			
		}
		return null;
		
	}
	
}
