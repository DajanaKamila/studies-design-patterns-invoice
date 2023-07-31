package main;

import java.util.Calendar;

import kategorie.KategoriaProsta;
import kategorie.KategoriaZlozona;
import magazyn.Towar;
import dokumenty.Faktura;

public class Ui {

	public static void main(String[] args) {
		Calendar teraz=Calendar.getInstance();
		
		//Tworzymy towary
		Towar t1=new Towar(10,"buty");
		Towar t2=new Towar(2,"skarpety");
		
		//I przykladowa fakture
		Faktura f=new Faktura(teraz.getTime(),"Fido");
		f.dodajPozycje(t1,3);
		f.dodajPozycje(t2, 5);
//		f.setLiczarkaRabatu(new ObliczCenePoRabacieProcentowym());
//		f.setLiczarkaRabatu(new ObliczCenePoRabacieKwotowym());
//		f.setLiczarkaRabatu(new AdapterRabatuLosowegoKlasowy());

		
		//TEST ZEWN. rabatu;
//		LosowyRabat lr=new LosowyRabat();
//		System.out.println(lr.losujRabat());

		Towar czerwoneSzpilki = new Towar(100, "Czerwone szpilki");
		Towar czarneSzpilki = new Towar(90, "Czarne szpilki");

		Towar czarneKozaki = new Towar(110, "Czarne kozaki");
		Towar kowbojskieKozaki = new Towar(80, "Kowbojskie kozaki");

		Towar sandałkiNaPasek = new Towar(60, "Sandałki na pasek");

		KategoriaZlozona kz1 = new KategoriaZlozona("Buty");
		KategoriaProsta kp1 = new KategoriaProsta("Kozaki");
		KategoriaProsta kp3 = new KategoriaProsta("Botki");

		KategoriaZlozona kz2 = new KategoriaZlozona("Buty letnie");
		KategoriaProsta kp2 = new KategoriaProsta("Szpilki");
		KategoriaProsta kp4 = new KategoriaProsta("Sandałki");

		kp2.dodajTowar(czerwoneSzpilki);
		kp2.dodajTowar(czarneSzpilki);
		kp1.dodajTowar(czarneKozaki);
		kp1.dodajTowar(kowbojskieKozaki);

		kz2.dodajKategorie(kp2);
		kz2.dodajKategorie(kp4);

		kz1.dodajKategorie(kp1);
		kz1.dodajKategorie(kp3);
		kz1.dodajKategorie(kz2);

//		kz1.wypiszNazwe();

		f.drukujFakture(f);
	}
}
