package cn.ponyzhang.designpattern.adaptor.objectAdaptor;

public class Phone {
    public void charging(Voltage5 voltage5){
        int voltage = voltage5.output();
        if(voltage == 5){
            System.out.println("使用5V电压进行充电");
        }else{
            System.out.println("电压不合适");
        }
    }
}
