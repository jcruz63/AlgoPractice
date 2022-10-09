package designPatterns.creational.prototype;


public class GameUnit implements Cloneable{

    private Point2D position;

    public GameUnit(){
        position = Point2D.zero();
    }

    public GameUnit(int x, int y){
        position = new Point2D(x, y);
    }

    public void move(Direction direction, int distance){
        switch (direction){
            case UP: position.setY(position.getY() - distance); break;
            case DOWN: position.setY(position.getY() + distance); break;
            case LEFT: position.setX(position.getX() - distance); break;
            case RIGHT: position.setX(position.getX() + distance); break;
        }
    }

    public Point2D getPosition() {
        return position;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone();
        unit.setPosition(new Point2D(position.getX(),
                position.getY()));
        return unit;
    }

    @Override
    public String toString() {
        return "GameUnit{" +
                "position=" + position +
                '}';
    }
}
