package OOP.Decorator.Coffee;

public class Whip extends CondimentDecorator{

    Beverage beverage;

    public Whip(Beverage beverage) {
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
        double condimentPrice = 0.15;

        switch (beverage.getSize()){
            case SMALL -> condimentPrice = 0.1;
            case BIG -> condimentPrice = 0.45;
        }
        return beverage.cost()+condimentPrice;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }
}
