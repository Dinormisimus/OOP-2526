package V8_Zad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppClient {

    private static Scanner sc;
    private static int inpt;

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        boolean run = true;

        while(run) {

            try {

                System.out.println("Please enter one integer:");

                inpt = sc.nextInt();

                System.out.println("You entered -> " + inpt);

                run = false;

            } catch (InputMismatchException e) {

                System.out.println("Wrong input -> only integers are allowed :)");

                System.out.println("Try again? 1 for YES, any other number for NO");

                sc.next();

                int choice = sc.nextInt();

                if(choice != 1) {

                    System.out.println("User aborted program!");

                    break;
                }
            }
        }

        sc.close();
    }
}