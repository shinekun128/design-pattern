package cn.ponyzhang.designpattern.observer.improve;

public class CurrentCondition implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;

    public void showWeather(){
        System.out.println("humidity=" + humidity);
        System.out.println("pressure=" + pressure);
        System.out.println("temperature=" + temperature);

    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
    }
}
