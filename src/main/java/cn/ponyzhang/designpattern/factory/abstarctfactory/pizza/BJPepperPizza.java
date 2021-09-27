package cn.ponyzhang.designpattern.factory.abstarctfactory.pizza;

import cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京pepper pizza");
        System.out.println("准备北京pepper pizza");
    }
}
