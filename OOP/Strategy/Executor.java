package OOP.Strategy;

public class Executor {
    public void execute(){
        Duck reactiveDuck = new ReactiveDuck();
        reactiveDuck.performFly();
        reactiveDuck.performQuake();
        reactiveDuck.setFlyBehaviour(new HelicopterFly());
        reactiveDuck.performFly();
    }
}
