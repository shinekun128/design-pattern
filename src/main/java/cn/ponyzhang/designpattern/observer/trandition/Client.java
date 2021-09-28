package cn.ponyzhang.designpattern.observer.trandition;


//没有办法动态添加第三方
//违反了开闭原则
public class Client {
    public static void main(String[] args) {
        CurrentCondition currentCondition = new CurrentCondition();
        WeatherData weatherData = new WeatherData(currentCondition);
        weatherData.setWeather(34.2f,15.2f,55.3f);
        currentCondition.showWeather();
        System.out.println("==============天气改变====================");
        weatherData.setWeather(31.2f,11.2f,51.3f);
        currentCondition.showWeather();
    }
}
