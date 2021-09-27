package cn.ponyzhang.designpattern.factory.abstarctfactory.pizza;

import cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦cheese pizza");
        System.out.println("准备伦敦cheese pizza");
    }
}
