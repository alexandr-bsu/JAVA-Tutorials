package CloneObjectsTutorial;

public class MyObject implements Cloneable{
    int i;
    NewObject newObject;

    public MyObject(int i) {
        this.i = i;
    }

    @Override
    protected MyObject clone() throws CloneNotSupportedException {
        MyObject myObject = (MyObject) super.clone();
        myObject.newObject = newObject.clone();
        return myObject;
    }
}
