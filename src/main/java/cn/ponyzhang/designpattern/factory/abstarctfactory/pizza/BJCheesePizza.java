package cn.ponyzhang.designpattern.factory.abstarctfactory.pizza;

import cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京cheese pizza");
        System.out.println("准备北京cheese pizza");
    }
}
