package cn.ponyzhang.designpattern.builder.improve;

public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("建造普通房子地基5m");
        getHouse().setBasic("5");
    }

    @Override
    public void buildWall() {
        System.out.println("建造普通房子墙高10m");
        getHouse().setWall("10");
    }

    @Override
    public void roofed() {
        System.out.println("建造普通房子屋顶5m");
        getHouse().setRoofed("5");
    }
}
