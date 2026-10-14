
class Main {
    public static void main(String[] args) {
        Person person1 =
                new Person("Kate", "Jones", 27, 1.6, 50.0);

        Person person2 =
                new Person("John", "Christopher", "Smith",
                        65, 1.75, 80.0);

        Car car = new Car("フェラーリ", "赤");
        Bicycle bicycle = new Bicycle("ビアンキ", "緑");

        person1.buy(car);
        person2.buy(bicycle);

        car.setVelocity(5);
        car.go(3);

        System.out.println("車の現在地：" + car.getX());

        car.back(2);

        System.out.println("車の現在地：" + car.getX());
        System.out.println("位置の差：" + car.diff(15, 5));

        System.out.println("【車の所有者】");
        car.getOwner().printData();

        System.out.println("【自転車の所有者】");
        bicycle.getOwner().printData();
    }
}
