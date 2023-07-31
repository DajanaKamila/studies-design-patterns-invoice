package rabaty;

import rabatlosowy.LosowyRabat;

public class AdapterRabatuLosowegoObiektowy implements IObliczCenePoRabacie{

    private LosowyRabat lr;

    public AdapterRabatuLosowegoObiektowy(){lr = new LosowyRabat();}

    @Override
    public double obliczCenePoRabacie(double cena){
        double procentRabatuLosowy = lr.losujRabat();
        return cena = cena - cena * procentRabatuLosowy;
    }

}
