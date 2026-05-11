package fst_serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class SpaceShip implements Serializable {
    private String spaceShipName;
    private int id;
    private static int cntID;
    private LocalDate firstMissionDate;

    public SpaceShip(String name){
        this.spaceShipName = name;
        this.id = cntID++;
        this.firstMissionDate = genRandomFiestMissionDate();
    }

    private LocalDate genRandomFiestMissionDate(){
        LocalDate startDate = LocalDate.of(2000,12,27);
        long longStartDate = startDate.toEpochDay();
        LocalDate endDate = LocalDate.of(2090,12,27);
        long longEndDate = endDate.toEpochDay();
        long randomDateBetween = ThreadLocalRandom.current().nextLong(longStartDate, longEndDate);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDateBetween);
        return randomDate;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "spaceShipName='" + spaceShipName + '\'' +
                ", id=" + id +
                ", firstMissionDate=" + firstMissionDate +
                '}';
    }
}
