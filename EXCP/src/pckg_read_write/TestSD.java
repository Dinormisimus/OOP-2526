package pckg_read_write;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class TestSD {

    public static void main(String[] args){
        /*
        SpaceShip sp1 = new SpaceShip("Enterprise");
        SpaceShip sp2 = new SpaceShip("Voyager");
        SpaceShip sp3 = new SpaceShip("Millenium Falcon");
        List<SpaceShip> spaceShipList = new ArrayList<>();
        spaceShipList.add(sp1);
        spaceShipList.add(sp2);
        spaceShipList.add(sp3);
        listElements(spaceShipList);
        String filePath = "./EXCP/src/pckg_read_write/spaceShipData_1.bin";
        AUX_SER_DESER.saveShips(spaceShipList, filePath);
        spaceShipList.clear();
        listElements(spaceShipList);
        spaceShipList = AUX_SER_DESER.readSpaceShipsData(filePath);
        listElements(spaceShipList);
        */
        String filePath = "./EXCP/src/pckg_read_write/spaceShipCSV.csv";
        List<SpaceShip> spaceShips = CSVUtils.readSpaceShipsFromCSV(filePath);
        listElements(spaceShips);



    }

    private static <E> void listElements(List<E> lista){
        if(lista.size()!=0){
            for (E element : lista){
                System.out.println(element);
            }
        }else {
            System.out.println("Lista je prazna!");
        }

    }
}