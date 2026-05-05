package pckg_fst_excp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AUX_CLS_SCORES {
    public static List<Student> readStudentScores(String filePath) throws FileNotFoundException {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filePath));
        String line = null;
        while(scanner.hasNextLine()){
            line = scanner.nextLine();
            Student student = parseStudentLine(line);
        }

        return students;
    }

    private static Student parseStudentLine(String line){
        String[] parts = line.split(",");
        if(parts.length != 2){
            throw new IllegalArgumentException("There should be two parts: name and score!");
        }else{
            String name = parts[0].trim();
            float score = Float.parseFloat(parts[1].trim());
        }
        return null;
    }
}
