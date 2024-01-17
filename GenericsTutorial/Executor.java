package GenericsTutorial;

public class Executor {

    <T> void method(T type){
        System.out.println(type);
    }
    public void execute(){
        Executor ex = new Executor();
        ex.method(123);
    }
}
