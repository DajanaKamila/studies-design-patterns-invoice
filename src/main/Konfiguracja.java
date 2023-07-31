package main;

import druk.Druk;
import druk.DrukKlasyczny;
import druk.DrukSwiateczny;
import rabaty.IObliczCenePoRabacie;
import rabaty.ObliczCenePoRabacieProcentowym;

public class Konfiguracja {
    private static Konfiguracja instance;

    private Konfiguracja(){}

    public static Konfiguracja getInstance(){
        if(instance == null) instance = new Konfiguracja();
        return  instance;
    }

    public double getKwotaRabatu() {return 1;}
    public double getProcentRabatu() {return 25;}

    public IObliczCenePoRabacie getBiezacyRabat(){
        //return new ObliczCenePoRabacieKwotowym();
        return new ObliczCenePoRabacieProcentowym();
    }

    public Druk getObecnyRodzajDruku(){
      //return new DrukKlasyczny();
     return new DrukSwiateczny();
    }

}
