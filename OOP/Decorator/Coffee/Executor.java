package OOP.Decorator.Coffee;

public class Executor {
    public void execute(){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage hb = new HouseBlend();
        hb = new Whip(new Mocha(new Mocha(hb)));
        hb.setSize(Beverage.Size.BIG);

        System.out.println(hb.getDescription()+" $"+hb.cost());

    }
}
