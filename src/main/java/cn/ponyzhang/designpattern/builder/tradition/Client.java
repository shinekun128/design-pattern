package cn.ponyzhang.designpattern.builder.tradition;

//问题：结构过于简单，没有设计缓存层，产品和创建过程封装在一起
//解决：将产品和创建过程解耦
public class Client {
    public static void main(String[] args) {
        new CommonHouse().build();
    }
}
