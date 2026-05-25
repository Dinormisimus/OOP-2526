package V8_Zad1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    private static Scanner sc;
    private static BufferedReader br;
    private static BufferedWriter bw;

    public static void readFileScanner(String fileName) {

        File file = new File(fileName);

        try {
            sc = new Scanner(file);

            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
            System.out.println("Reading finished!");

        } catch (FileNotFoundException e) {

            System.out.println("File " + fileName + " does not exist!");
        }
    }

    public static void readFileBufferedReader(String fileName) {

        File file = new File(fileName);

        try {

            br = new BufferedReader(new FileReader(file));

            String line;

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

            System.out.println("Reading finished!");

        } catch (FileNotFoundException e) {

            System.out.println("File " + fileName + " does not exist!");

        } catch (IOException e) {

            System.out.println("Error while reading file!");
        }
    }

    public static void write2File(String fileName) {

        File file = new File(fileName);

        try {

            bw = new BufferedWriter(new FileWriter(file, true));

            bw.write("Neki tekst...");
            bw.newLine();
            bw.write("Nova linija teksta...");
            bw.newLine();

            bw.flush();
            bw.close();

            System.out.println("Writing finished!");

        } catch (IOException e) {

            System.out.println("Error while writing to file!");
        }
    }

    public static void askUser4File() {

        Scanner input = new Scanner(System.in);

        boolean running = true;

        while(running) {

            System.out.println("Enter file name:");

            String fileName = input.nextLine();

            File file = new File(fileName);

            if(file.exists()) {

                readFileScanner(fileName);
                running = false;

            } else {

                System.out.println("File does not exist!");

                System.out.println("Try again? y/n");

                String ans = input.nextLine().toLowerCase();

                if(!ans.equals("y")) {

                    running = false;
                    System.out.println("Program ended.");
                }
            }
        }

        input.close();
    }
}