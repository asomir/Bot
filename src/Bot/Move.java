package Bot;

/**
 * Created by Asomir on 01.10.2016.
 */
public class Move implements Action {

    @Override
    public Action dogo(MapOfAction mapOfAction) {



        if (mapOfAction.getOs() == 0) {
            if (mapOfAction.isRight()) {
                mapOfAction.setRobotPositionX(mapOfAction.getRobotPositionX() + 1); //если робот движется по Х в направлении вправо, +1
            }
           } else {
                mapOfAction.setRobotPositionX(mapOfAction.getRobotPositionX() - 1); //если влево, минус один

        }

        if (mapOfAction.getOs() == 1) { //если робот движется по оси У
            if (mapOfAction.isDown()) { //в направлении вниз
                mapOfAction.setRobotPositionY(mapOfAction.getRobotPositionY() + 1); //прибавляем к ординате единицу

            } else {
                mapOfAction.setRobotPositionY(mapOfAction.getRobotPositionY() - 1); //если вверх, убавляем единицу
            }
        }

        return new CheckToGo(); //надо понять, надо ли двигаться дальше
    }
}
