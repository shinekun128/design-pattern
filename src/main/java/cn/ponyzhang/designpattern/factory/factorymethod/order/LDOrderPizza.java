package cn.ponyzhang.designpattern.factory.factorymethod.order;

import cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;
import cn.ponyzhang.designpattern.factory.factorymethod.pizza.LDCheesePizza;
import cn.ponyzhang.designpattern.factory.factorymethod.pizza.LDPepperPizza;

public class LDOrderPizza extends OrderPizza {
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
