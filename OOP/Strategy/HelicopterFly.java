package OOP.Strategy;

public class HelicopterFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Пур-пур-пур-пур-пур...");
    }
}
