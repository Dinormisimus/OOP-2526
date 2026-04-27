package zd_1;

public class DS_Student extends Student {

    public DS_Student(String name) {
        this.name = name;
        this.idStudent = ++cntStudents;
    }

    @Override
    public void infoStudent() {
        System.out.print("[Diplomski studij] ");
        super.infoStudent();
    }

    @Override
    public void completedStudy(int credits) {
        if (credits >= 120) {
            System.out.println("Student " + name + " je završio diplomski studij.");
        } else {
            System.out.println("Student " + name + " treba još " + (120 - credits) + " ECTS bodova.");
        }
    }
}