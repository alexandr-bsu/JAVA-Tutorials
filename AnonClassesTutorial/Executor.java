package AnonClassesTutorial;

public class Executor {
    public void execute(){
        Popcorn popcorn = new Popcorn(){
            @Override
            public void doSomething(){
                System.out.println("2xPopcorn");
            }
        };

//        Переопределение интерфейса
        Comparable comparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        popcorn.doSomething();

//        Анонимные методы
        method(new Popcorn(){
            @Override
            public void doSomething() {
                System.out.println("I'm Anon Popcorn!");
            }
        });
    }

    public void method(Popcorn popcorn){
        popcorn.doSomething();
    }
}
