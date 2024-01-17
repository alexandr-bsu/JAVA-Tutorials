package OOP.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private double temp;
    private double hum;
    private double press;
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addSubscriber(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeSubscriber(Observer o) {
        if (!observers.isEmpty()){
            observers.remove(o);
        }
    }

    @Override
    public void notifySubscriber() {
        for(Observer o: observers){
            o.update(temp, hum, press);
        }
    }
}
