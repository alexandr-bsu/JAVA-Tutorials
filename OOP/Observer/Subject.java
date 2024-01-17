package OOP.Observer;

public interface Subject {
    public void addSubscriber(Observer o);
    public void removeSubscriber(Observer o);
    public void notifySubscriber();
}
