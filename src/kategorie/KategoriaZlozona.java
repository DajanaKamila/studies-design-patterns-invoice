package kategorie;

import java.util.ArrayList;
import java.util.List;

public class KategoriaZlozona extends Kategoria {

    private List<Kategoria> listaKategorii = new ArrayList<>();

    public KategoriaZlozona (String name){
        this.name = name;
    }

    public void dodajKategorie (Kategoria kategoria){
        listaKategorii.add(kategoria);
    }

    @Override
    public void wypiszNazwe(){
        System.out.println("Nazwa kategorii złożonej: " + name);
        for (Kategoria k : listaKategorii){
            k.wypiszNazwe();
        }
    }

}
