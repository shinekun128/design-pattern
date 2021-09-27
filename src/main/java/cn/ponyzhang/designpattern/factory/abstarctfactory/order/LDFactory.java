package cn.ponyzhang.designpattern.factory.abstarctfactory.order;

import cn.ponyzhang.designpattern.factory.factorymethod.pizza.LDCheesePizza;
import cn.ponyzhang.designpattern.factory.factorymethod.pizza.LDPepperPizza;
import cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        if (orderType.equals("cheese")) {
            return new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            return new LDPepperPizza();
        }else{
            return null;
        }
    }
}
