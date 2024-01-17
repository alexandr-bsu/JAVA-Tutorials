package OOP.Strategy;

public class DecoyQuake implements QuakeBehaviour{
    @Override
    public void quake() {
        System.out.println("Кря-кря-кру-кря");
    }
}
