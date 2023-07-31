package druk;

import dokumenty.Faktura;
import dokumenty.Pozycja;
import java.util.Iterator;

public abstract class Druk {
    public void wypiszFakture(Faktura faktura){
        drukujNagłówek(faktura);
        drukujPozycje(faktura);
        drukujStopke(faktura);
    }

    abstract void drukujNagłówek(Faktura faktura);
    public void drukujPozycje(Faktura faktura){
        Iterator<Pozycja> iteratorPozycji=faktura.getIteratorPozycji();
        while(iteratorPozycji.hasNext())
        {
            Pozycja pozycja=iteratorPozycji.next();
            System.out.println("Towar: "+pozycja.getNazwa());
            System.out.println("          Cena za sztuke: " + pozycja.getCena()+" Ilosc: "+pozycja.getIlosc()+" Wartosc:" + pozycja.getWartosc());
        }
        System.out.println("=====================================================");
    }

    abstract void drukujStopke(Faktura faktura);

}
