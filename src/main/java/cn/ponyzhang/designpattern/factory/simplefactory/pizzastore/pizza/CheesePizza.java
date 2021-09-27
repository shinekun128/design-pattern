package cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给CheesePizza准备原材料");
    }
}
