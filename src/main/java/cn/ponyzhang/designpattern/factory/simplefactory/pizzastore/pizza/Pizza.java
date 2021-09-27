package cn.ponyzhang.designpattern.factory.simplefactory.pizzastore.pizza;

/**
 * 需求，披萨有很多种
 * 披萨制作有prepare,bake,cut,box
 */

public abstract class Pizza {
    protected String name;
    //各类pizza准备方法不同
    public abstract void prepare();

    public void bake(){
        System.out.println(name + "baking");
    }
    public void cut(){
        System.out.println(name + "cutting");
    }
    public void box(){
        System.out.println(name + "boxing");
    }
    public void setName(String name){
        this.name = name;
    }
}
