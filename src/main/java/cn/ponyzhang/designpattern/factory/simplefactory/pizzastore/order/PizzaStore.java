package cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.order;

//客户端
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
    }


}
