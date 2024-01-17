package CloneObjectsTutorial;

public class NewObject implements Cloneable{
    int j;

    public NewObject(int j) {
        this.j = j;
    }

    @Override
    protected NewObject clone() throws CloneNotSupportedException {
        return (NewObject) super.clone();
    }
}
