import java.util.Scanner;
import java.lang.Math;

public class Sphere {
     static void main(String[] arg){
        double volumen;
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite polumjer: ");
        double p = sc.nextDouble();
        volumen = (4.0/3.0)*Math.PI*Math.pow(p,3);

        System.out.printf("Volumen kugle je: %.2f", volumen);
    }
}
