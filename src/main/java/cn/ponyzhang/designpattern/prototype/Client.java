package cn.ponyzhang.designpattern.prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("小羊",12,new DeepSheep("肖恩",1));
        Sheep clone =(Sheep) sheep.clone();
        System.out.println(sheep.getDeepSheep().hashCode());
        System.out.println(clone.getDeepSheep().hashCode());
    }
}
