package Bot;

/**
 * Created by Asomir on 01.10.2016.
 */
public class StopAction implements Action {

    @Override
    public Action dogo(MapOfAction mapOfAction) {
        System.out.println("Добрался, чертяка железный! Сокровище твоё!");
        return null;
    }
}
