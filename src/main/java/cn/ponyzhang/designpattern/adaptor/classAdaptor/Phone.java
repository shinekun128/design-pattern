package cn.ponyzhang.designpattern.adaptor.classAdaptor;

public class Phone {
    public void charging(Voltage5 voltage5){
        int src = voltage5.src();
        if(src == 5){
            System.out.println("正在充电");
        }else{
            System.out.println("电压不合适");
        }
    }
}
