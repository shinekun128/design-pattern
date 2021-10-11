package cn.ponyzhang.designpattern.adaptor.classAdaptor;

public class Adaptor extends Votalge220 implements Voltage5 {
    @Override
    public int src() {
        int src = output() / 44;
        return src;
    }
}
