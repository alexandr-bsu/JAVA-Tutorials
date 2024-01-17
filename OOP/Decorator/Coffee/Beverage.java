package OOP.Decorator.Coffee;

abstract public class Beverage {
    public enum Size {SMALL,  MEDIUM, BIG};
    public Size size = Size.MEDIUM;
    public String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
