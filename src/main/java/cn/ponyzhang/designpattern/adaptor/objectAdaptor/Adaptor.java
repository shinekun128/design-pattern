package cn.ponyzhang.designpattern.adaptor.objectAdaptor;

public class Adaptor implements Voltage5 {
    private Votalge220 votalge220;

    public Adaptor(Votalge220 votalge220){
        this.votalge220 = votalge220;
    }

    @Override
    public int output() {
        int src = votalge220.output();
        System.out.println("使用适配器进行转换");
        int des = src/44;
        return des;
    }
}
