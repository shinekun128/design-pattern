package cn.ponyzhang.designpattern.factory.abstarctfactory.order;

import cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

public interface AbsFactory {
    Pizza createPizza(String orderType);
}
