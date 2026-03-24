package pckg_arr_1;

public class MainApp {

    public static void main(String[] args){
        String[] names = {"Stjepan", "Marija", "Ivan", "Jošua"};
        Student[] studenti = AUX_CLS.genStudentFromNames(names);
        AUX_CLS.printStudentFromArr(studenti);
        System.out.println("--------------------------------------------");
        AUX_CLS.printStudentFromArr(studenti);

        String[] profNames = {"Vlatko", "katarina", "Marino", "Teo", "Gorana"};
        Profesor[] profesori = AUX_CLS.genProfesorFromNames(profNames);
        AUX_CLS.printElementsFromArr(profesori);
    }
}
