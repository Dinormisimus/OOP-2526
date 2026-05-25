package gamePckg;

import auxPckg.Generator;
import auxPckg.UserInputException;
import auxPckg.UsrInpts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    private static Scanner sc = new Scanner(System.in);

    public static void runGame() {

        int age = Generator.genAge2Guess(1, 120);

        boolean play = true;

        int counter = 1;

        while(play) {

            try {

                UsrInpts user = userInputs();

                if(user.getGuess() == age) {

                    System.out.println("YOU WON!");
                    System.out.println("Correct age is: " + age);

                    break;

                } else {

                    System.out.println("Miss!");

                    System.out.println(counter + ": Your guess = " + user.getGuess());

                    if(age < user.getLower()) {

                        System.out.println("Real value is smaller than lower bound!");

                    } else if(age > user.getUpper()) {

                        System.out.println("Real value is greater than upper bound!");

                    } else {

                        System.out.println("Real value is inside your interval!");
                    }

                    play = contGame();

                    counter++;
                }

            } catch (InputMismatchException e) {

                System.out.println("Only integers allowed!");

                sc.nextLine();

            } catch (UserInputException e) {

                System.out.println(e.getMessage());
            }
        }

        System.out.println("Game ended!");
    }

    private static UsrInpts userInputs() throws UserInputException {

        UsrInpts us = new UsrInpts();

        System.out.println("Enter lower bound:");
        int low = sc.nextInt();

        System.out.println("Enter upper bound:");
        int up = sc.nextInt();

        if(low < 0 || up < 0) {
            throw new UserInputException("Negative values are not allowed!");
        }

        if(low >= up) {
            throw new UserInputException("Lower bound must be smaller than upper bound!");
        }

        System.out.println("Guess age:");
        int guess = sc.nextInt();

        if(guess < 0) {
            throw new UserInputException("Negative guess is not allowed!");
        }

        us.setLower(low);
        us.setUpper(up);
        us.setGuess(guess);

        return us;
    }

    private static boolean contGame() {

        System.out.println("Continue? 1 for YES, any other number for NO");

        int ans = sc.nextInt();

        return ans == 1;
    }
}