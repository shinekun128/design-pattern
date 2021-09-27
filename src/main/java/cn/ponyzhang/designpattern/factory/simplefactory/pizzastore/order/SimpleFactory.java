package cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.order;

import cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

//简单工厂模式,抽象出一个工厂类，专门用来创建pizza，当需要扩展时，只需要修改工厂代码，调用方不用修改代码。
//静态工厂模式
public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("greek ");
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("cheese ");
        }
        return pizza;
    }
}
