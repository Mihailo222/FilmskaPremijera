package zadatak2;

import java.util.GregorianCalendar;

public class FilmskaPremijera {
	private String nazivFilma;
	GregorianCalendar datumPremijereAmerika = new GregorianCalendar();
	GregorianCalendar datumPremijereSvet = new GregorianCalendar();
    
	
	//postaviti da novi objekti mogu samo sadrzati datum premijere za buducnost
	
	void postaviDatumPremijere(GregorianCalendar datumPremijereAmerika, 
			GregorianCalendar datumPremijereSvet) {
		
		//pravimo pomocnu promenljivu koja ima vrednost sadasnjeg vremena
		GregorianCalendar sada=new GregorianCalendar();
		
		if(datumPremijereAmerika==null|| datumPremijereSvet==null || datumPremijereSvet.before(sada) || datumPremijereAmerika.before(sada))
			System.out.println("Greska");
		else {
		this.datumPremijereAmerika=datumPremijereAmerika;
		this.datumPremijereSvet=datumPremijereSvet;
		}
			
	}
	
	void ispisi() {
		System.out.println("Naziv filma:"+nazivFilma);
		int dan=datumPremijereAmerika.get(GregorianCalendar.DAY_OF_MONTH);
		int mesec=datumPremijereAmerika.get(GregorianCalendar.MONTH)+1;
		//jer meseci idu od indeksa 0, kakva glupost
		int godina=datumPremijereAmerika.get(GregorianCalendar.YEAR);
		
		System.out.println("Datum premijere u Americi: " + dan+"/"+mesec+"/"+godina);
		
		
		int dan1=datumPremijereSvet.get(GregorianCalendar.DAY_OF_MONTH);
		int mesec1=datumPremijereSvet.get(GregorianCalendar.MONTH)+1;
		int godina1=datumPremijereSvet.get(GregorianCalendar.YEAR);
		
		System.out.println("Datum premijere u svetu je: "+ dan1+"/"+mesec1+"/"+godina1);
		
	}
	
	
	//pomeri premijeru za godinu dana
	void pomeriPremijeru() {
		int godina=datumPremijereAmerika.get(GregorianCalendar.YEAR)+1;
		datumPremijereAmerika.set(GregorianCalendar.YEAR, godina);
		int godina1=datumPremijereSvet.get(GregorianCalendar.YEAR)+1;
		datumPremijereSvet.set(GregorianCalendar.YEAR, godina1);
		}
	
	void postaviNaziv(String nazivFilma) {
		if(nazivFilma==null || nazivFilma.isEmpty())
			System.out.println("Greska");
		else
			this.nazivFilma=nazivFilma;
	}
	
}
