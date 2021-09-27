package cn.ponyzhang.designpattern.factory.abstarctfactory.order;

import cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory factory;
    public OrderPizza(AbsFactory factory){
        setAbsFactory(factory);
    }

    public void setAbsFactory(AbsFactory factory){
        this.factory = factory;
        String orderType;
        Pizza pizza = null;
        do{
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                break;
            }
        }while (true);
    }

    public String getType(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input 披萨类型");
            String str = bufferedReader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
