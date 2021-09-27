package cn.ponyzhang.designpattern.factory.abstarctfactory.order;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}