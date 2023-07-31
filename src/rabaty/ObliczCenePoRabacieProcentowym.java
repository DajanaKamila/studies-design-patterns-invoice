package rabaty;

import main.Konfiguracja;

public class ObliczCenePoRabacieProcentowym implements IObliczCenePoRabacie {
        @Override
        public double obliczCenePoRabacie(double cena){
            Konfiguracja konfiguracja = Konfiguracja.getInstance();
            double procentRabatu = konfiguracja.getProcentRabatu();
            return cena = cena - (cena * procentRabatu/100);
        }

//  To jest fragment do wzorca strategia
//    @Override
//    public double obliczCenePoRabacie(double cena){
//        double procentRabatu = 10;
//        return cena = cena - (cena * procentRabatu);
//    }
}
