import java.lang.Math;

public class Zadatak2_2 {

    public static void main(String[] args){
        int x = 10;
        int y = 5;

        int zbroj = x + y;
        int razlika = x - y;
        int umnozak = x * y;
        int kolicnik = x / y;
        int ostatak = x % y;
        double kvadrat = Math.pow(x,y);
        double korjen = Math.sqrt(x);
        int absolut = Math.abs(x);


        System.out.println("Zbroj x i y je: " + zbroj);
        System.out.println("Razlika x i y je: " + razlika);
        System.out.println("Umnožak x i y je: " + umnozak);
        System.out.println("Količnik x i y je: " + kolicnik);
        System.out.println("Ostatak u djeljenju x i y je: " + ostatak);
        System.out.println("Kvadrat x i y je : "+ kvadrat);
        System.out.println("Korjen broja x je: "+ korjen);
        System.out.println("Absolutna vrijednost broja x je: " + absolut);


    }

}
