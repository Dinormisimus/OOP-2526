package hm_pckg;

public class AppTest {

    public static void main(String[] args){
        String resultFile = POM_CLS.readDataTxtFile("./STRUCT/src/hm_pckg/data.txt");
        System.out.println(resultFile);
    }
}
