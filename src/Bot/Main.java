package Bot;

/**
 * Created by Asomir on 01.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        MapOfAction map = new MapOfAction();
        Robot robot = new Robot(map);
        map.setRobotPositionX(1);
        map.setRobotPositionY(1);
        map.setRobotEndPositionX(2);
        map.setRobotEndPositionY(4);
        map.setOs(0);
        map.setRight(true);
        robot.run();
    }
}
