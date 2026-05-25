package V8_Zad1;

public class App {

    public static void main(String[] args) {

        String fileName = "randTekst.txt";

        System.out.println("===== Scanner =====");
        FileHandling.readFileScanner(fileName);

        System.out.println("\n===== BufferedReader =====");
        FileHandling.readFileBufferedReader(fileName);

        System.out.println("\n===== Writing =====");
        FileHandling.write2File("nova.txt");

        System.out.println("\n===== User input =====");
        FileHandling.askUser4File();
    }
}