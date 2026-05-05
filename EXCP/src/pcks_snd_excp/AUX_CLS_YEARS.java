package pcks_snd_excp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AUX_CLS_YEARS {

    public static void enterAge(){
        boolean provjera = true;
    while(provjera){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age as integer: \n");
        try{

            int age = scanner.nextInt();

            checkNegativeValues(age);
            System.out.println("Entered value is: " + age);
            scanner.nextLine();
            provjera = false;

        }catch (InputMismatchException ime){
            System.out.println("Entered value must be a integer!");
            scanner.nextLine();
        }}}

    private static void checkNegativeValues(int inputAge){
            if(inputAge <= 0){
                throw new InputMismatchException("Age must be positive!");
            }
        }
}
