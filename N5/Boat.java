public class Boat extends Transportation {

    public Boat(double load, Manufacturer manufacturer, int dayRelease, String fuel, int usageTime) {
        super(load, manufacturer, dayRelease, fuel, usageTime);
    }
    
    @Override
    public int getMaxSpeed() {
        return 300;
    }

    @Override
    public int getVelocity() {
        return 250;
    }

    @Override
    public void transport() {
        if (this.getLoad() > 15000) {
            System.out.println("Cannot transport this item");
        } else {
            System.out.println("This item can be transported");
        }
    }

    @Override
    public void maintanance() {
        if (this.getUsageTime() > 3) {
            System.out.println("This boat needs to be maintained");
        } else {
            System.out.println("This boat still have a good health");
        }
    }
}