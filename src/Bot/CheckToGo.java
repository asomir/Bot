package Bot;

/**
 * Created by Asomir on 01.10.2016.
 */
public class CheckToGo implements Action {

    @Override
    public Action dogo(MapOfAction mapOfAction) {
        int posX, posY;
        posX = mapOfAction.getRobotPositionX();
        posY = mapOfAction.getRobotPositionY();

        if((posX == mapOfAction.getRobotEndPositionX()) && (posY == mapOfAction.getRobotEndPositionY())) {
            return new StopAction();
        }


        if ( mapOfAction.getOs() == 0){ //если мы движемся по оси Х
             if(mapOfAction.isRight()){ //вправо
                 if (mapOfAction.getMap()[posX+1][posY] == 0) { //если следующая клетка содержит ноль
                     return new Move(); //движемся
                 } else return new Turn(); //иначе поворачиваем
            } else { // иначе, если влево
                 if (mapOfAction.getMap()[posX-1][posY] == 0) { //если предыдущая клетка содержит ноль
                     return new Move(); //движемся

                } else return new Turn(); //иначе поворачиваем
            }

        }
          else if ( mapOfAction.getOs() == 1){ // если движемся по оси У
            if(mapOfAction.isDown()){ //вниз
                if (mapOfAction.getMap()[posX][posY+1] == 0) { //и следующая клетка содержит ноль
                    return new Move(); //движемся дальше
                } else return new Turn(); //иначе поворачиваем
            } else { //иначе если движемся вверх
                if (mapOfAction.getMap()[posX][posY-1] == 0) { //и предыдущая содержит ноль
                    return new Move(); //движемся дальше

                } else return new Turn(); //иначе поворачиваем
            }

        }


        throw new RuntimeException("Я заблудился");
    }

}
