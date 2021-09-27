package cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.order;

import cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//存在的问题，不满足开闭原则，当添加一个类pepperPizza，需要修改代码
public class OrderPizza  {
//    public OrderPizza(){
//        Pizza pizza = null;
//        String orderType;
//        do{
//            orderType = getType();
//            if(orderType.equals("CheesePizza")){
//                pizza = new CheesePizza();
//                pizza.setName("CheesePizza");
//            }else if(orderType.equals("GreekPizza")){
//                pizza = new GreekPizza();
//                pizza.setName("GreekPizza");
//            }else {
//                break;
//            }
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while(true);
//    }

    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do{
            orderType = getType();
            Pizza pizza = this.simpleFactory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("不存在此类pizza，请联系商家添加");
            }
        }while(true);
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
