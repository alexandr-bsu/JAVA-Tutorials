package CloneObjectsTutorial;

public class Executor {
    public void execute() throws Exception {
        MyObject obj = new MyObject(1);
        obj.newObject = new NewObject(1);

        MyObject obj2 = obj.clone();
        obj2.i = 2;
        obj2.newObject.j = 2;
        System.out.printf("obj=%d, to_obj=%d \n", obj2.i, obj2.newObject.j);
        System.out.printf("obj=%d, to_obj=%d \n", obj.i, obj.newObject.j);

    }
}
