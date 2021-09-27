package cn.ponyzhang.designpattern.prototype;

import java.io.Serializable;

public class DeepSheep implements Serializable {
    private String name;
    private int age;
    //反序列化失败
    private static final long serialVersionUID = 2L;

    public DeepSheep(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
