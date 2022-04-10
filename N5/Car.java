public class Car extends Transportation {

    public Car(double load, Manufacturer manufacturer, int dayRelease, String fuel, int usageTime) {
        super(load, manufacturer, dayRelease, fuel, usageTime);
    }

    @Override
    public int getMaxSpeed() {
        return 220;
    }

    @Override
    public int getVelocity() {
        return 60;
    }

    @Override
    public void transport() {
        if (this.getLoad() > 1000) {
            System.out.println("Cannot transport this goods");
        } else {
            System.out.println("This goods can be delivered");
        }
    }

    @Override
    public void maintanance() {
        if (this.getUsageTime() > 6) {
            System.out.println("This car should be maintained");
        } else {
            System.out.println("This car is still good");
        }
    }
}