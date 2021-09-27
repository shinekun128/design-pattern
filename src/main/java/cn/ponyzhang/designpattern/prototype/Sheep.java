package cn.ponyzhang.designpattern.prototype;

import java.io.*;
import java.util.Objects;

public class Sheep implements Cloneable,Serializable{
    private String name;
    private int age;
    //浅拷贝，对引用对象不拷贝
    private DeepSheep deepSheep;
    private static final long serialVersionUID = 1L;
    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", deepSheep=" + deepSheep +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DeepSheep getDeepSheep() {
        return deepSheep;
    }

    public void setDeepSheep(DeepSheep deepSheep) {
        this.deepSheep = deepSheep;
    }

    public Sheep(String name, int age, DeepSheep deepSheep) {
        this.name = name;
        this.age = age;
        this.deepSheep = deepSheep;
    }

    @Override
    protected Object clone() {
        ByteArrayOutputStream bos ;
        ByteArrayInputStream bis;
        ObjectOutputStream oos ;
        ObjectInputStream ois;
        Sheep copy = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            copy = (Sheep)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return copy;
    }

}
