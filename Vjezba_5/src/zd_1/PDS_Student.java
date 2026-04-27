package zd_1;

public class PDS_Student extends Student {

    public PDS_Student(String name) {
        this.name = name;
        this.idStudent = ++cntStudents;
    }

    @Override
    public void infoStudent() {
        System.out.print("[Poslijediplomski studij] ");
        super.infoStudent();
    }

    @Override
    public void completedStudy(int credits) {
        if (credits >= 180) {
            System.out.println("Student " + name + " je uspješno obranio doktorat.");
        } else {
            System.out.println("Student " + name + " još uvijek prikuplja bodove za doktorat (" + credits + "/180).");
        }
    }
}