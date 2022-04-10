public abstract class Transportation {
    private double load;
    private Manufacturer manufacturer;
    private int dayRelease;
    private String fuel;
    private int usageTime;

    public Transportation(double load, Manufacturer manufacturer, int dayRelease, String fuel, int usageTime) {
        this.load = load;
        this.manufacturer = manufacturer;
        this.dayRelease = dayRelease;
        this.fuel = fuel;
        this.usageTime = usageTime;
    }

    public double getLoad() {
        return this.load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    public Manufacturer getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getDayRelease() {
        return this.dayRelease;
    }

    public void setDayRelease(int dayRelease) {
        this.dayRelease = dayRelease;
    }

    public String getFuel() {
        return this.fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getUsageTime() {
        return this.usageTime;
    }

    public void setUsageTime(int usageTime) {
        this.usageTime = usageTime;
    }

    public void start() {
        System.out.println("Starting ....");
    }

    public void stop() {
        System.out.println("Braking .....");
    }

    public void accelerate() {
        System.out.println("Speeding up ...");
    }    

    public abstract void transport();
    public abstract void maintanance();
    public abstract int getMaxSpeed();
    public abstract int getVelocity();
}