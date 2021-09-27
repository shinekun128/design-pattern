package cn.ponyzhang.designpattern.builder.improve;

public abstract class HouseBuilder {
    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    private House house = new House();

    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();

    public House build(){
        return house;
    }


}
