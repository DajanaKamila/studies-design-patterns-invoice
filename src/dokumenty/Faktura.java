package dokumenty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;

import druk.Druk;
import magazyn.Towar;
import main.Konfiguracja;
import rabaty.AdapterRabatuLosowegoKlasowy;
import rabaty.IObliczCenePoRabacie;
import rabaty.ObliczCenePoRabacieKwotowym;
import rabaty.ObliczCenePoRabacieProcentowym;


public class Faktura {
	private Date dataSprzedazy;
	private String kontrahent;
	private ArrayList<Pozycja> pozycje;
	private double suma;
	private Druk wybieranieDrukowania;
	private IObliczCenePoRabacie liczarkaRabatu;
	private Konfiguracja konfiguracja;

	public Faktura(Date dataSprzedazy,String kontrahent)
	{
		this.dataSprzedazy=dataSprzedazy;
		this.kontrahent=kontrahent;
		pozycje=new ArrayList<Pozycja>();
		suma=0;
//		liczarkaRabatu = new ObliczCenePoRabacieKwotowym();
//		liczarkaRabatu = new ObliczCenePoRabacieProcentowym();  //dodaliśmy dla singletonu
		Konfiguracja k = Konfiguracja.getInstance();
//		liczarkaRabatu = k.getBiezacyRabat();
		wybieranieDrukowania = k.getObecnyRodzajDruku();
		liczarkaRabatu = new AdapterRabatuLosowegoKlasowy();
	}

//	public void setLiczarkaRabatu(IObliczCenePoRabacie lr){
//		this.liczarkaRabatu = lr;
//	}

	public void dodajPozycje(Towar towar, double ilosc)
	{
		pozycje.add(new Pozycja(towar,ilosc));
		this.przeliczSume();
	}
	public double getSuma()
	{
		return suma;
	}
	public Date getDataSprzedazy()
	{
		return dataSprzedazy;
	}
	private void przeliczSume()
	{
		Iterator<Pozycja> iteratorPozycji=pozycje.iterator();
		Pozycja pozycja;
		suma=0;
		while(iteratorPozycji.hasNext())
		{
			pozycja = iteratorPozycji.next();
			suma+=pozycja.getWartosc();
		}
		suma = liczarkaRabatu.obliczCenePoRabacie(suma);
	}

	public double getWartoscTowarow()
	{
		double wartosc = 0;
		Iterator<Pozycja> iteratorPozycji=pozycje.iterator();
		Pozycja pozycja;
		while(iteratorPozycji.hasNext())
		{
			pozycja = iteratorPozycji.next();
			wartosc+=pozycja.getWartosc();
		}
		return wartosc;
	}
	public Iterator<Pozycja> getIteratorPozycji()
	{
		return pozycje.iterator();
	}
	public String getKontrahent()
	{
		return this.kontrahent;
	}
	
	public void drukujFakture(Faktura f){
		wybieranieDrukowania.wypiszFakture(f);
	}
}
