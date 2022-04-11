public class Boat extends Vehicle {
    private int noPassengers;

    public Boat() {
        super();
        this.noPassengers = 0;
    }
    
    public Boat(Owner owner, Manufacturer mf, double damagePercent, int noPassengers, int currentSpeed) {
        super(owner, mf, damagePercent, currentSpeed);
        this.noPassengers = noPassengers;
    }

    public int getNoPassengers() {
        return this.noPassengers;
    }

    public void setNoPassengers(int noPassengers) {
        this.noPassengers = noPassengers;
    }
    
    public boolean isEnoughSpace() {
        if (this.noPassengers > 3000) {
            return false;
        }
        return true;
    }

    public String start() {
        return this.getOwner().getName() + " is starting the boat";
    }

    public String stop() {
        return "The boat is slowing down and ... stopped!";
    }

    @Override
    public String accelerate() {
        int currentSpeed = this.getCurrentSpeed();
        String result = this.getOwner().getName() + " is accelerating the speed up to: ";
        int i = 0;
        do {
            currentSpeed += 4;
            if (i == 2) {
                result += currentSpeed;
            } else {
                result += currentSpeed + " .. ";
            }
            i++;
        } while (i < 3);
        result += " km/h";
        return result.trim();
    }

    @Override
    public int getMaxSpeed() {
        return 50;
    }

    @Override
    public int calculateTotalBill() {
        if (this.getDamagePercent() <= 5) {
            return 0;
        } else if (this.getDamagePercent() <= 30) {
            return 100000000;
        } else if (this.getDamagePercent() > 30 && this.getDamagePercent() <= 80) {
            return 500000000;
        } else {
            return 1000000000;
        }
    }

    @Override
    public String toString() {
        return "Boat[Manufacturer: " + this.getMf().getName() + ", origin: " + this.getMf().getOrigin() + ", Owner: " + this.getOwner().getName() + ", Passengers: " + this.noPassengers + ", currentSpeed: " + this.getCurrentSpeed() + "]";
    }
}
