package Exceptions;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
    public static void main() {
        List<Robot> robots = new ArrayList<>(5);
        robots.add(new IndustrialRobot("R2D2"));
        robots.add(new FlyingRobot("2DM"));
        robots.add(new IndustrialRobot("RDR2"));
    }
}
