public class Test {
    public static void main(String[] args) {
        Manufacturer mf1 = new Manufacturer("Boeing", "USA");
        Manufacturer mf2 = new Manufacturer("Vinfast", "VietNam");
        Manufacturer mf3 = new Manufacturer("Damen", "Netherland");

        Plane plane = new Plane(300, mf1, 1916, "AVGas 80/87", 3);
        Car car = new Car(200, mf2, 2020, "A95", 12);
        Boat boat = new Boat(2000, mf3, 1927, "Diesel", 10);

        plane.takeOff();
        System.out.println("Max speed of car: " + car.getVelocity());
        System.out.println("Max speed of boat: " + boat.getVelocity());
    }
}
