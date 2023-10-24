package farmacia;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MedSystem {

//	Si implementi la classe MedSystem che gestisce una collezione di medicinali e 
//	consenta, attraverso le operazioni su Stream, di:
//	• Stampa dei medicinali scaduti e prodotti da una certa azienda.
//	• Stampa del numero di medicinali sperimentali che sono in fase intermedia.
//	• Stampa del numero massimo e minimo di unità disponibili.
//	• Stampa ordinata (alfabeticamente) dei medicinali in base al nome.
//	La classe MedSystem dovrà fornire ogni funzionalità descritta attraverso appositi 
//	metodi (Si utilizzino opportunamente le espressioni lambda). 

	
	private List <Medicinale> listaMed;
	
	
	public List <Medicinale> stampaScaduti(String azi) {		
		
	        List<Medicinale> med = listaMed.stream().filter (c -> c.getData().before(new Date(2023,10,23))&&c.getNomeAzienda().startsWith(azi))
	        .sorted(Comparator.comparing(Medicinale::getData))
	        .collect(Collectors.toList());
	        
	        return med;
	        
	}
	
	public List <Medicinale> sperimentaliInt() {
		
		List<Medicinale> med = listaMed.stream().filter (c -> c.getA().getSperimentazione().startsWith("intermedio"))
		.sorted(Comparator.comparing(Medicinale::getNome))
		.collect(Collectors.toList());
		return med;
		   
		
	}
	
	public List <Medicinale> maxEMin() {
		
		Medicinale med = listaMed.stream()
				.min(Comparator.comparing(Medicinale::getNumero))
				.orElseThrow(NumNonTrovatoException::new);
		
				
		Medicinale meda = listaMed.stream()
				.max(Comparator.comparing(Medicinale::getNumero))
				.orElseThrow(NumNonTrovatoException::new);
		
		List<Medicinale> a = Arrays.asList(med,meda);
		
		return a;
		
		
	}
	
	public List <Medicinale> stampa() {
		
	        List<Medicinale> med = listaMed.stream()
	        .sorted(Comparator.comparing(Medicinale::getNome))
	        .collect(Collectors.toList());
		return med;
	       
	        
	}
	
	
	
	public MedSystem(List<Medicinale> listaMed) {
	this.listaMed = listaMed;
}

	public List<Medicinale> getListaMed() {
		return listaMed;
	}

	public void setListaMed(List<Medicinale> listaMed) {
		this.listaMed = listaMed;
	}

	@Override
	public String toString() {
		return "MedSystem [listaMed=" + listaMed + "]";
	}

	
	
	
	
	
}
