public enum EnumTest { SMALL, MEDIUM, BIG, LARGE }

class Ship {

    public static void main(String[] args) {
        EnumTest smallShip = EnumTest.SMALL;
        System.out.println(smallShip + " SHIP");
        EnumTest mediumShip = EnumTest.MEDIUM;
        System.out.println(mediumShip + " SHIP");
        EnumTest bigShip = EnumTest.BIG;
        System.out.println(bigShip + " SHIP");
    }
}
