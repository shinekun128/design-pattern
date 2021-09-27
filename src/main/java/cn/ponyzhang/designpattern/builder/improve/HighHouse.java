package cn.ponyzhang.designpattern.builder.improve;

public class HighHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("建造高楼地基10m");
        getHouse().setBasic("5");
    }

    @Override
    public void buildWall() {
        System.out.println("建造高楼墙高20m");
        getHouse().setWall("20");
    }

    @Override
    public void roofed() {
        System.out.println("建造高楼屋顶10m");
        getHouse().setRoofed("10");
    }
}
