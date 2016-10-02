package Bot;

/**
 * Created by Asomir on 01.10.2016.
 */
public class MapOfAction {

    private int robotPositionX; //начальная позиция на карте робота
    private int robotPositionY;
    private int robotEndPositionX; //конечная позиция на карте
    private int robotEndPositionY;
    private int[][] map = new int[10][10]; //создаём двумерное поле для движения робота

    private boolean down = true; // задаём направление движения робота если вниз, правда
    private boolean right = true; //если вправо, правда
    private int os; //задаём переменную для оси, по которой движется робот, по умолчанию - вправо.

    public MapOfAction() { //создаём карту по которой будем перемещать робота
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (((i == 3) && ((j >= 1) && (j <= 3)))
                        || (i == 0) || (j == 0) || (i == map.length) || (j == map[i].length)) {
                    map[i][j] = 1;
                } else {
                    map[i][j] = 0;
                } //поставили преграды посреди поля и заполнили границы преградами

            }

        }
    }

    public int[][] getMap() {
        return map;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }

    public int getRobotPositionX() {
        return robotPositionX;
    }

    public void setRobotPositionX(int robotPositionX) {
        this.robotPositionX = robotPositionX;
    }

    public int getRobotPositionY() {
        return robotPositionY;
    }

    public void setRobotPositionY(int robotPositionY) {
        this.robotPositionY = robotPositionY;
    }

    public int getRobotEndPositionX() {
        return robotEndPositionX;
    }

    public void setRobotEndPositionX(int robotEndPositionX) {
        this.robotEndPositionX = robotEndPositionX;
    }

    public int getRobotEndPositionY() {
        return robotEndPositionY;
    }

    public void setRobotEndPositionY(int robotEndPositionY) {
        this.robotEndPositionY = robotEndPositionY;
    }

    public boolean isDown() {
        return down;
    }

    public boolean isRight() {
        return right;
    }

    public void setDown(boolean down) { //надо повернуть робота
        this.down = down;
    }

    public void setRight(boolean right) { //надо повернуть робота
        this.right = right;
    }

    public int getOs() {
        return os;
    }

    public void setOs(int os) {
        this.os = os;
    }
}
