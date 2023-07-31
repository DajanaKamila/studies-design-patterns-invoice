package druk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorNumerowFaktur {
    private static List<Integer> numeryFaktur = new ArrayList<>();
    public static int stworzNumerFaktury(){
        int numerFaktury = 0;
        int minNumber = 10000;
        int maxNumber = 109999;
        Random random = new Random();
        int randomNumber = random.nextInt(maxNumber-minNumber) + minNumber;

        if (!numeryFaktur.contains(randomNumber)){
            numerFaktury = randomNumber;
        } else {
            stworzNumerFaktury();
        }
        return numerFaktury;
    }

}
