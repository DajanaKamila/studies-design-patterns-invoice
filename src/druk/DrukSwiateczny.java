package druk;

import dokumenty.Faktura;
import java.math.BigDecimal;
import java.math.MathContext;

public class DrukSwiateczny extends Druk {

    public void drukujNagłówek(Faktura faktura){
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("Wesołych Świąt i Szczęśliwego Nowego Roku, życzy firma XYZ!");
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("\n=====================================================");
        System.out.println("Faktura z dnia: "+faktura.getDataSprzedazy().toString());
        System.out.println("Nr: " + "FV GHT" + GeneratorNumerowFaktur.stworzNumerFaktury());
        System.out.println("Wystawiona dla: "+faktura.getKontrahent());
        System.out.println("=====================================================");
    }

    public void drukujStopke(Faktura faktura){
        BigDecimal rabat = BigDecimal.valueOf(faktura.getSuma()).subtract(BigDecimal.valueOf(faktura.getWartoscTowarow()));
        System.out.println("Wartość zamówienia: " + faktura.getWartoscTowarow());
        System.out.println("Udzielony rabat świąteczny: " + rabat.round(new MathContext(2)));
        System.out.println("Do zapłaty: " + (double)(Math.round(faktura.getSuma()*100))/100);
        System.out.println("=====================================================");
        ChristmasTree.printTree();
        System.out.println("\nDziękujemy za zakupy i życzymy Wesołych Świąt!");
        System.out.println("=====================================================");
    }

}
