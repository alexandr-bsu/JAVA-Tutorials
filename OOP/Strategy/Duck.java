package OOP.Strategy;

public class Duck {
    FlyBehaviour flyBehaviour;
    QuakeBehaviour quakeBehaviour;

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuake(){
        quakeBehaviour.quake();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuakeBehaviour(QuakeBehaviour quakeBehaviour) {
        this.quakeBehaviour = quakeBehaviour;
    }
}
