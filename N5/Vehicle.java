public abstract class Vehicle {
    protected Owner owner;
    protected Manufacturer mf;
    protected double damagePercent;
    protected int currentSpeed;

    public Vehicle() {
        this.owner = new Owner();
        this.mf = new Manufacturer();
        this.damagePercent = 0;
        this.currentSpeed = 0;
    }    

    public Vehicle(Owner owner, Manufacturer mf, double damagePercent, int currentSpeed) {
        this.owner = owner;
        this.mf = mf;
        this.damagePercent = damagePercent;
        this.currentSpeed = currentSpeed;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Manufacturer getMf() {
        return this.mf;
    }

    public void setMf(Manufacturer mf) {
        this.mf = mf;
    }

    public double getDamagePercent() {
        return this.damagePercent;
    }

    public void setDamagePercent(double damagePercent) {
        this.damagePercent = damagePercent;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    
    public abstract String accelerate();
    public abstract int getMaxSpeed();
    public abstract int calculateTotalBill();
    public abstract String toString();
}