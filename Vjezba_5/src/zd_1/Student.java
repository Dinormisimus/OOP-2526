package zd_1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Student {
    protected static DateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy.");
    protected Date enrolmentDate;
    protected String name;
    protected int idStudent;
    protected static int cntStudents = 0;
    protected Scanner scanner = new Scanner(System.in);

    public void setEnrollmentDate() {
        System.out.println("Unesite datum upisa (dd.MM.yyyy.): ");
        String dateStr = scanner.nextLine();
        try {
            this.enrolmentDate = DATE_FORMAT.parse(dateStr);
        } catch (Exception e) {
            this.enrolmentDate = new Date();
            System.out.println("Pogrešan format, postavljen današnji datum.");
        }
    }

    public void infoStudent() {
        String dateStr = (enrolmentDate != null) ? DATE_FORMAT.format(enrolmentDate) : "Nije postavljen";
        System.out.println("Student ID: " + idStudent + " | Ime: " + name + " | Datum upisa: " + dateStr);
    }

    public abstract void completedStudy(int credits);
}