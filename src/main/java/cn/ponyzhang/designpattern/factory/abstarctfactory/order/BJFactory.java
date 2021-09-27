package cn.ponyzhang.designpattern.factory.abstarctfactory.order;

import cn.ponyzhang.designpattern.factory.factorymethod.pizza.BJCheesePizza;
import cn.ponyzhang.designpattern.factory.factorymethod.pizza.BJPepperPizza;
import cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        if (orderType.equals("cheese")) {
            return new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            return new BJPepperPizza();
        }else{
            return null;
        }
    }
}
