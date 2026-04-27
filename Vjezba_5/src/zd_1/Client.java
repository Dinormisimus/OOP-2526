package zd_1;

public class Client {
    public static void main(String[] args) {
        DS_Student ds = new DS_Student("Ivan Horvat");
        ds.setEnrollmentDate();
        ds.infoStudent();
        ds.completedStudy(125);

        PDS_Student pds = new PDS_Student("Ana Anić");
        pds.setEnrollmentDate();
        pds.infoStudent();
        pds.completedStudy(90);
    }
}