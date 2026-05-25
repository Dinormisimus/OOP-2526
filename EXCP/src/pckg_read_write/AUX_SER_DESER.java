package pckg_read_write;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AUX_SER_DESER {

    public static void saveSpaceShipOne(SpaceShip spaceShip, String filePath){
        File file = new File(filePath);
        try(FileOutputStream fos = new FileOutputStream(file, true)) {
            ObjectOutputStream oos = null;
            if (file.length() == 0){
                oos = new ObjectOutputStream(fos);
            } else {
                oos = new NoHeaderObjectOutputStream(fos);
            }
            oos.writeObject(spaceShip);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveShips(List<SpaceShip> ships, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(ships);
            System.out.println("written");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<SpaceShip> readSpaceShipsData(String filePath) {
        List<SpaceShip> spaceShipList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            spaceShipList = (List<SpaceShip>) ois.readObject();

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found!");
            fnfe.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return spaceShipList;
    }

    public static List<SpaceShip> readOneByOneSpaceShip(String filePath){
        List<SpaceShip> spaceShipList = new ArrayList<>();
        try(FileInputStream fis = new FileInputStream(filePath)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (fis.available()>0){
                SpaceShip spaceShip = (SpaceShip) ois.readObject();
                spaceShipList.add(spaceShip);
                System.out.println("One ship added to a list!");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return spaceShipList;
    }

}