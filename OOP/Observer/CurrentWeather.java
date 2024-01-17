package OOP.Observer;

public class CurrentWeather implements Displayable, Observer{
    private WeatherData weatherData;
    private double temp;
    private double hum;
    private double press;

    public CurrentWeather(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addSubscriber(this);
    }

    @Override
    public void update(double temp, double hum, double press) {
        this.temp = temp;
        this.hum = hum;
        this.press = press;
    }


    @Override
    public void display() {

    }
}
