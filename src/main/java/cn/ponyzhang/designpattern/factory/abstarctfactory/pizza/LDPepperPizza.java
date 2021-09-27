package cn.ponyzhang.designpattern.factory.abstarctfactory.pizza;

import cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦pepper pizza");
        System.out.println("准备伦敦pepper pizza");
    }
}
