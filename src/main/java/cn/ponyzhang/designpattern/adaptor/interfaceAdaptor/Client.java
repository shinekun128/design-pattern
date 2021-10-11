package cn.ponyzhang.designpattern.adaptor.interfaceAdaptor;

public class Client {
    public static void main(String[] args) {
        InterfaceAdaptor adaptor = new InterfaceAdaptor() {
            @Override
            public void m1() {
                System.out.println("实现了m1方法");
            }
        };
        adaptor.m1();
    }
}
