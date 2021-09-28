package cn.ponyzhang.designpattern.observer.trandition;

public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;

    private CurrentCondition currentCondition;

    public WeatherData(CurrentCondition currentCondition){
        this.currentCondition = currentCondition;
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

    public CurrentCondition getCurrentCondition() {
        return currentCondition;
    }

    public void setCurrentCondition(CurrentCondition currentCondition) {
        this.currentCondition = currentCondition;
    }

    public void dataChange(){
        currentCondition.dataChange(temperature,pressure,humidity);
    }

    public void setWeather(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        dataChange();
    }


}
