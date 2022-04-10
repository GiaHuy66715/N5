public class Plane extends Transportation {

    public Plane(double load, Manufacturer manufacturer, int dayRelease, String fuel, int usageTime) {
        super(load, manufacturer, dayRelease, fuel, usageTime);
    }

    public void takeOff() {
        System.out.println("The plane is taking off ...");
    }

    public void landing() {
        System.out.println("The plane is landing on the ground");
    }

    @Override
    public int getMaxSpeed() {
        return 800;
    }

    @Override
    public int getVelocity() {
        return 700;
    }

    @Override
    public void transport() {
        if (this.getLoad() > 20000) {
            System.out.println("Cannot transport this item");
        } else {
            System.out.println("This item can be transported");
        }
    }

    @Override
    public void maintanance() {
        if (this.getUsageTime() > 1) {
            System.out.println("This plane needs to be maintained");
        } else {
            System.out.println("This plane still have a good health");
        }
    }
}