package rabaty;

import main.Konfiguracja;

public class ObliczCenePoRabacieKwotowym implements IObliczCenePoRabacie {
    @Override
    public double obliczCenePoRabacie(double cena){
        Konfiguracja konfiguracja = Konfiguracja.getInstance();
        double kwotaRabatu = konfiguracja.getKwotaRabatu();
        return cena -= kwotaRabatu;
    }


//  To jest fragment do wzorca strategia
//    @Override
//    public double obliczCenePoRabacie(double cena){
//        double kwotaRabatu = 3;
//        return cena -= kwotaRabatu;
//    }
//

}
