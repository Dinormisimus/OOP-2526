package fst_serial;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestApp {

    public static void main(String[] args) {
        SpaceShip spaceShip1 = new SpaceShip("Apollo");
        SpaceShip spaceShip2 = new SpaceShip("Enterprise");
        SpaceShip spaceShip3 = new SpaceShip("Millenium Falcon");
        SpaceShip spaceShip4 = new SpaceShip("Atreidis");
        SpaceShip spaceShip5 = new SpaceShip("Harkonin");

        List<SpaceShip> spaceShips = new ArrayList<>();
        spaceShips.add(spaceShip1);
        spaceShips.add(spaceShip2);
        spaceShips.add(spaceShip3);
        spaceShips.add(spaceShip4);
        spaceShips.add(spaceShip5);


        ArrayList<SpaceShip> spsl = new ArrayList<>(spaceShips);
        System.out.println(spsl);

        listAllSpaceShips(spaceShips);

        String filePath = "./DATA/SpaceShipData.bin";

        saveSpaceShips(spaceShips, filePath);
        saveSpaceShips(spsl, filePath);

        SpaceShip spaceShip6 = new SpaceShip("Zerg685");

        String filePath2 = "./DATA/spaceShipDataFile.dat";
        addSpaceShip(spaceShip6, filePath2);
    }

    private static void listAllSpaceShips(List<SpaceShip> spl){
        for(SpaceShip sp : spl){
            System.out.println(sp);
        }
    }

    private static void saveSpaceShips(List<SpaceShip> ships, String filePath){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))){
            oos.writeObject(ships);
            System.out.println("File saved succesfully.");
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }catch(IOException e){
            System.out.println("Can't write into the file!");
        }
    }

    private static void addSpaceShip(SpaceShip spaceShip, String filePath){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))){
            oos.writeObject(spaceShip);
            System.out.println("Finished writing one spaceship to a file!");
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }catch(IOException e){
            System.out.println("Can't write into the file!");
        }
    }

    private static List<SpaceShip> readSpaceShipData(String filePath){
        List<SpaceShip> spaceShipList = new ArrayList<>();
        try(FileInputStream fis = new FileInputStream(new File(filePath))){
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(fis.available()>0){
                SpaceShip sp = (SpaceShip) ois.readObject();
            }

        }catch(FileNotFoundException e){
            throw new RuntimeException("File not found");
        }catch(IOException e){
            throw new RuntimeException("Can't read from file");
        }catch(ClassNotFoundException e){
            throw new RuntimeException("Class not found");
        }
        return spaceShipList;
    }
}

