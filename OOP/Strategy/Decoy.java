package OOP.Strategy;

public class Decoy {
    QuakeBehaviour quakeBehaviour = new DecoyQuake();
    public void quake(){
        quakeBehaviour.quake();
    }
}
