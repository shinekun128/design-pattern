package cn.ponyzhang.designpattern.observer.improve;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Weather{
    private float temperature;
    private float pressure;
    private float humidity;
    private List<Observer> observers;

    public WeatherData(){
        this.observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }


    public void dataChange(){
        notifyObserver();
    }

    public void setWeather(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        dataChange();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update(this.temperature,this.pressure,this.humidity);
        }
    }
}
