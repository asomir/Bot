package Bot;

/**
 * Created by Asomir on 01.10.2016.
 */
public class Robot {
    Action action;
    MapOfAction mapOfAction;

    public Robot(Action action) {
        this.action = action;
    }

    public Robot(MapOfAction mapOfAction) {
        this.mapOfAction = mapOfAction;
        action = new CheckToGo();
    }



    public void run(){
        do {
            action = action.dogo(mapOfAction);
            System.out.println("Я поползло на " + mapOfAction.getRobotPositionX() + " " + mapOfAction.getRobotPositionY());
        } while (action != null);
    }

}
