package cn.ponyzhang.designpattern.factory.factorymethod.order;

import java.util.Scanner;
//将创建实例的方法抽取成抽象方法，对应的子类实例化创建实例方法
public class PizzaStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("请输入城市");
            String city = sc.nextLine();
            if("北京".equals(city)){
                new BJOrderPizza();
            }else if("伦敦".equals(city)){
                new LDOrderPizza();
            }else{
                System.out.println("您输入的城市不存在，请重新输入");
            }
        }while(true);
    }
}
