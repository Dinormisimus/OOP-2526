package pcg_static_cls;

public class Test {
    public static void main(String[] args){
        USER us1 = new USER("Ivana","ivana_123@gmail.com");
        us1.performSomeStudyAction();
        System.out.println(us1);
        SuperUser sup1 = new SuperUser("Petar Spasitelj", "petar.spasitej123@gmail.com");

    }
}
