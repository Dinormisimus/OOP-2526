// Generirajte jednodimenzionalni niz tipa double s 15 elemenata i potom izvršite
// sortiranje niza od najviše do najniže vrijednosti (eng. Sort Descending).
// Ispišite nesortirani i sortirani niz jedan ispod drugog s pripadajućim porukama.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Zadatak8{
    public static void main(String[] args){
        double[] doubleArr = new double[15];

        for(int i = 0; i < doubleArr.length; i++){
            doubleArr[i] = ThreadLocalRandom.current().nextDouble(0.0 , 500.0);
        }
        System.out.println(Arrays.toString(doubleArr));

        // Algoritam za sortiranje ( usput da vjezbamo za AIS)

        AUX.selectionSortDescending(doubleArr);
        System.out.println(Arrays.toString(doubleArr));


    }
}