package OOP.Decorator.Coffee;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
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
    public double cost() {
        double condimentPrice = 0.10;

        switch (beverage.getSize()){
            case SMALL -> condimentPrice = 0.05;
            case BIG -> condimentPrice = 0.15;
        }
        return beverage.cost()+condimentPrice;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }
}
