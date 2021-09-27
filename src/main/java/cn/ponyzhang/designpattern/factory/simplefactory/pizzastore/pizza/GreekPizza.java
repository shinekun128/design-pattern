package cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给GreekPizza准备原材料");
    }
}
