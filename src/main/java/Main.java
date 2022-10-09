import designPatterns.creational.prototype.Direction;
import designPatterns.creational.prototype.GameUnit;
import designPatterns.creational.prototype.Swordsman;

public class Main {


    public static void main(String[] args) {
        GameUnit gameUnit = new GameUnit();

        try {
            GameUnit unit2 = gameUnit.clone();
            gameUnit.move(Direction.UP, 1);
            System.out.println(gameUnit);
            System.out.println(unit2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
