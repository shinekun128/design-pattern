package cn.ponyzhang.designpattern.factory.factorymethod.order;

import cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;
import cn.ponyzhang.designpattern.factory.factorymethod.pizza.BJCheesePizza;
import cn.ponyzhang.designpattern.factory.factorymethod.pizza.BJPepperPizza;

public class BJOrderPizza extends OrderPizza {
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
