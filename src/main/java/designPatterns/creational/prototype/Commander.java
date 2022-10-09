package designPatterns.creational.prototype;


public class Commander extends GameUnit{

    private State state = State.IDLE;

    public void boostMorale(GameUnit unit){
        //do something
    }

    @Override
    public String toString() {
        return "Commander{" +
                "state=" + state +
                '}' + "@position: " + getPosition();
    }
}
