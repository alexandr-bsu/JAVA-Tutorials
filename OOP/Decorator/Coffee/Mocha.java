package OOP.Decorator.Coffee;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void setSize(Size size) {
        beverage.setSize(size);
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        double condimentPrice = 0.20;

        switch (beverage.getSize()){
            case SMALL -> condimentPrice = 0.15;
            case BIG -> condimentPrice = 0.35;
        }
        return beverage.cost()+condimentPrice;
    }


}
