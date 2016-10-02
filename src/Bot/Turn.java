package Bot;

/**
 * Created by Asomir on 01.10.2016.
 */
public class Turn implements Action {

    @Override
    public Action dogo(MapOfAction mapOfAction) {

        if (mapOfAction.getOs() == 0) {
             if (mapOfAction.isRight())  { //если мы шли вправо по оси Х, повернуть вниз
                mapOfAction.setOs(1);
                 mapOfAction.setDown(true);
            } else {
                 mapOfAction.setOs(1); //если шли влево, повернуть вверх
                 mapOfAction.setDown(false);
             }

        }

        if ( mapOfAction.getOs() == 1) {
            if (mapOfAction.isDown()) {//если мы шли вниз по оси У, повернуть влево
            mapOfAction.setOs(0);
            mapOfAction.setRight(false);
        } else {
                mapOfAction.setOs(0);
                mapOfAction.setRight(true);
            }

        }


        return new CheckToGo();
    }
}
