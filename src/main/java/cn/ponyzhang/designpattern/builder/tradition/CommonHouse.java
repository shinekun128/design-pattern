package cn.ponyzhang.designpattern.builder.tradition;

public class CommonHouse extends BuildHouse{
    @Override
    public void buildBase() {
        System.out.println("造地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("建墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("造屋顶");
    }
}
