package pckg_read_write;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {
    public static List<SpaceShip> readSpaceShipsFromCSV(String filePath) {
        List<SpaceShip> ships = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                // preskoči zaglavlje ako sadrži "id" ili "name"
                if (firstLine) {
                    String lower = line.toLowerCase();
                    if (lower.contains("name") || lower.contains("id")) {
                        firstLine = false;
                        continue;
                    }
                    firstLine = false;
                }

                // podrška za "name" ili "id,name" (odvojeno zarezom)
                String[] parts = line.split("\\s*,\\s*");
                if (parts.length == 1) {
                    String name = parts[0];
                    ships.add(new SpaceShip(name));
                } else {
                    // pokušaj parsirati id iz prvog stupca; ako nije broj, tretiraj prvi stupac kao name
                    try {
                        int id = Integer.parseInt(parts[0]);
                        String name = parts[1];
                        ships.add(new SpaceShip(id, name));
                    } catch (NumberFormatException e) {
                        // ako prvi stupac nije broj, uzmi prvi stupac kao name
                        ships.add(new SpaceShip(parts[0]));
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading CSV: " + e.getMessage(), e);
        }
        return ships;
    }
}