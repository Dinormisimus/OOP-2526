/*Zadatak 9: Primjenom for-each petlje za niz float[] nums = {2.44f, 4.55f, 7.88f, 44.32f, 51.11f}
 ispišite pripadnu indeksnu poziciju i vrijednost elementa niza. Konzolni izlaz bi vam trebao biti:
 */

public class Zadatak9{
    static void main(String[] args) {
        float[] nums = {2.44f, 4.55f, 7.88f, 44.32f, 51.11f};

        int index = 0;
        for(float i : nums){
            System.out.println("Index " + index + "<-> Value: " + i) ;
            index++;
        }
    }
}