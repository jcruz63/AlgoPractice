package designPatterns.creational.prototype;

public class Swordsman extends GameUnit{

    private State state = State.IDLE;

    public void attack(){
        state = State.ATTACKING;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Swordsman{" +
                "state=" + state +
                '}' + "@position: " + getPosition();
    }
}
