package cn.ponyzhang.designpattern.template;

public class PeanutSoyMilk extends SoyMilk{
    @Override
    protected void add() {
        System.out.println("add peanut");
    }
}
