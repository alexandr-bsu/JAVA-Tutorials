package serializableTutorial;
import java.io.Serializable;

public class User implements Serializable {
    public int health;
    User(int health){
        this.health = health;
    }

}
