package pcg_static_cls;

public class USER {

    protected String name;
    protected String email;

    private static int cntID = 100;

    private static final int MAX_VAL = 200;

    protected int id;

    public USER(String name, String email){
        this.name = name;
        this.email = email;
        this.id = cntID++;
    }
    public void performSomeStudyAction(){
        System.out.println(name + " performing some study action!");
    }}

