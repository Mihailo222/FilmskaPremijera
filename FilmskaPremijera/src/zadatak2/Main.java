package zadatak2;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		FilmskaPremijera fp=new FilmskaPremijera();
	//	System.out.println(fp.datumPremijereAmerika.getTime());
		//naziv filma je private, znaci njemu ne mozemo pristupiti ovako direktno, vec
		//preko neke metode
		fp.postaviNaziv("Addams family 2");
	//	fp.postaviDatumPremijere(2021/11/15,2020/12/4);
		GregorianCalendar datumAmerika=new GregorianCalendar();
		GregorianCalendar datumSvet=new GregorianCalendar();
		
		datumAmerika.set(2021, 11, 15); //month-dec
		datumSvet.set(2021, 11, 4);     //month-dec
		fp.postaviDatumPremijere(datumAmerika, datumSvet);
	    fp.pomeriPremijeru();
		fp.ispisi();
		

	}

}
