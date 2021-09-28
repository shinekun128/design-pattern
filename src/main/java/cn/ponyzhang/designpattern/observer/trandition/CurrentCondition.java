package cn.ponyzhang.designpattern.observer.trandition;

public class CurrentCondition {
    private float temperature;
    private float pressure;
    private float humidity;

    public void dataChange(float temperature,float pressure,float humidity){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
    }

    public void showWeather(){
        System.out.println("humidity=" + humidity);
        System.out.println("pressure=" + pressure);
        System.out.println("temperature=" + temperature);

    }

}
