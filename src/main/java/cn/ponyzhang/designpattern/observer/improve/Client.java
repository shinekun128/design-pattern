package cn.ponyzhang.designpattern.observer.improve;


public class Client  {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCondition currentCondition = new CurrentCondition();
        weatherData.registerObserver(currentCondition);
        weatherData.setWeather(11f,12f,13f);
        currentCondition.showWeather();
    }
}
