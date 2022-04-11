import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Manufacturer mf1 = new Manufacturer("Boeing", "USA");
        Manufacturer mf2 = new Manufacturer("Vinfast", "VietNam");
        Manufacturer mf3 = new Manufacturer("Damen", "Netherland");

        Owner owner1 = new Owner("Dave Calhoun", 64, "American");
        Owner owner2 = new Owner("Pham Nhat Vuong", 53, "VietNam");
        Owner owner3 = new Owner("Kommer Damen", 77, "Dutch");

        AirPlane airPlane = new AirPlane(owner1, mf1, 20, 100, 800);
        Car car = new Car(owner2, mf2, 10, 80, 4);
        Boat boat = new Boat(owner3, mf3, 80, 2000, 30);

        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-------------------- MENU --------------------");
            System.out.println("1. Start the vehicle");
            System.out.println("2. Stop the vehicle");
            System.out.println("3. Get the current speed");
            System.out.println("4. Accelerate the speed");
            System.out.println("5. Get max speed");
            System.out.println("6. Check if the car passes the max speed rules");
            System.out.println("7. Check if it is enough space or seats for passengers");
            System.out.println("8. Get damage percent");
            System.out.println("9. Calculate total bill");
            System.out.println("10. Print the vehicle info");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("**********");
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.println(airPlane.takeOff());
                    System.out.println(car.start());
                    System.out.println(boat.start());
                    break;
                case 2:
                    System.out.println(airPlane.landing());
                    System.out.println(car.stop());
                    System.out.println(boat.stop());
                    break;
                case 3:
                    System.out.println("Airplane current speed: " + airPlane.getCurrentSpeed() + " km/h");
                    System.out.println("Car current speed: " + car.getCurrentSpeed() + " km/h");
                    System.out.println("Boat current speed: " + boat.getCurrentSpeed() + " km/h");
                    break;
                case 4:
                    System.out.println(airPlane.accelerate());
                    System.out.println(car.accelerate());
                    System.out.println(boat.accelerate());
                    break;
                case 5:
                    System.out.println("Airplane max speed: " + airPlane.getMaxSpeed() + " km/h");
                    System.out.println("Car max speed: " + car.getMaxSpeed() + " km/h");
                    System.out.println("Boat max speed: " + boat.getMaxSpeed() + " km/h");
                    break;
                case 6:
                    System.out.println(car.isPassTheMaxSpeedRules());
                    break;
                case 7:
                    System.out.println("Airplane: " + airPlane.isEnoughSeats(700));
                    System.out.println("Car: " + car.isEnoughSeats(3));
                    System.out.println("Boat: " + boat.isEnoughSpace());
                    break;
                case 8:
                    System.out.println("Airplane: " + airPlane.getDamagePercent() + "%");
                    System.out.println("Car: " + car.getDamagePercent() + "%");
                    System.out.println("Boat: " + boat.getDamagePercent() + "%");
                    break;
                case 9:
                    System.out.println("Airplane total bill: " + airPlane.calculateTotalBill());
                    System.out.println("Car total bill: " + car.calculateTotalBill());
                    System.out.println("Boat total bill: " + boat.calculateTotalBill());
                    break;
                case 10:
                    System.out.println(airPlane.toString());
                    System.out.println(car.toString());
                    System.out.println(boat.toString());
                    break;
                default:
                    System.out.println("Please enter one of the above options");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}
