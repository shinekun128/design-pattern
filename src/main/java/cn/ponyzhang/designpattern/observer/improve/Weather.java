package cn.ponyzhang.designpattern.observer.improve;

public interface Weather {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();


}
