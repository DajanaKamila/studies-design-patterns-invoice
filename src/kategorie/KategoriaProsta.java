package kategorie;

import magazyn.Towar;

import java.util.ArrayList;
import java.util.List;

public class KategoriaProsta extends Kategoria {

    List<Towar> towary = new ArrayList<>();
    public KategoriaProsta(String name){
        this.name = name;
    }

    @Override
    public void wypiszNazwe(){
        System.out.println("Nazwa kategorii prostej: " + name);
        for (Towar t : towary){
            System.out.println("    Nazwa towaru: " + t.getNazwa());
        }
    }

    public void dodajTowar (Towar towar){
        towary.add(towar);
    }
}
