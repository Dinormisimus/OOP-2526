package zadaci_int;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AUX_CLS {

    public static void otvoriSve(ArrayList<Pregledljivo> pregledljiviMaterijali){
        if(pregledljiviMaterijali.size() == 0){
            System.out.println("prazno");
        }else{
        for(Pregledljivo materijal : pregledljiviMaterijali){
            materijal.otvori();
        }
    }}
    public static int ukuonaVelicinaKBMaterijala(ArrayList<Pregledljivo> pregledljiviMaterijali){
        int ukupno = 0;
        for(Pregledljivo materijal : pregledljiviMaterijali){
            ukupno += materijal.velicinaKB();
        }
        return ukupno;
    }
    public static Pregledljivo nadjiNajveciKapacitetKB(ArrayList<Pregledljivo> pregledljiviMaterijali){
        Pregledljivo najveci = pregledljiviMaterijali.get(0);
        for(int k=1; k<pregledljiviMaterijali.size(); k++){
            if(najveci.velicinaKB() < pregledljiviMaterijali.get(k).velicinaKB()){
                najveci = pregledljiviMaterijali.get(k);
            }
        }
        return najveci;
    }
}
