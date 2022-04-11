public class AirPlane extends Vehicle {
    private int noSeats;

    public AirPlane() {
        super();
    }

    public AirPlane(Owner owner, Manufacturer mf, double damagePercent, int noSeats, int currentSpeed) {
        super(owner, mf, damagePercent, currentSpeed);
        this.noSeats = noSeats;
    }

    public int getNoSeats() {
        return this.noSeats;
    }

    public void setNoSeats(int noSeats) {
        this.noSeats = noSeats;
    }
    
    public boolean isEnoughSeats(int noPassengers) {
        if (noPassengers > this.getNoSeats()) {
            return false;
        }
        return true;
    }

    public String takeOff() {
        return "The airplane is taking off";
    }

    public String landing() {
        return "The airplane is landing";
    }

    @Override
    public String accelerate() {
        int currentSpeed = this.getCurrentSpeed();
        String result = this.getOwner().getName() + " is accelerating the speed up to: ";
        int i = 0;
        do {
            currentSpeed += 10;
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
        return 945;
    }

    @Override
    public int calculateTotalBill() {
        if (this.getDamagePercent() <= 5) {
            return 0;
        } if (this.getDamagePercent() <= 30) {
            return 200000000;
        } else if (this.getDamagePercent() > 30 && this.getDamagePercent() <= 80) {
            return 900000000;
        } else {
            return 1200000000;
        }
    }

    @Override
    public String toString() {
        return "Airplane[Manufacturer: " + this.getMf().getName() + ", origin: " + this.getMf().getOrigin() + ", Owner: " + this.getOwner().getName() + ", Seats: " + this.noSeats + ", currentSpeed: " + this.getCurrentSpeed() + "]";
    }
}
