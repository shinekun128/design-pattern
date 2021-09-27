package cn.ponyzhang.designpattern.builder.improve;

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.ConstructHouse();
        System.out.println(house);
        houseDirector.setHouseBuilder(new HighHouse());
        house = houseDirector.ConstructHouse();
        System.out.println(house);
        StringBuilder builder = new StringBuilder("Hello world");
        System.out.println(builder);
    }
}
