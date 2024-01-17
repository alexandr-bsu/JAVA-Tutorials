package OOP.Strategy;

public class ReactiveDuck extends Duck{
    public ReactiveDuck() {
        quakeBehaviour = new QuakeRor();
        flyBehaviour = new FlyReactivePower();
    }
}
