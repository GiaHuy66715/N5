public class Car extends Vehicle {
    private int noSeats;

    public Car() {
        super();
    }

    public Car(Owner owner, Manufacturer mf, double damagePercent, int currentSpeed, int noSeats) {
        super(owner, mf, damagePercent, currentSpeed);
        this.noSeats = noSeats;
    }

    public int getNoSeats() {
        return this.noSeats;
    }

    public void setNoSeats(int noSeats) {
        this.noSeats = noSeats;
    }

    public String start() {
        return this.getOwner().getName() + " is starting the engine and ready to drive this car";
    }

    public String stop() {
        return "The car is slowing down and ... stopped!";
    }

    public boolean isPassTheMaxSpeedRules() {
        if (this.currentSpeed > this.getMaxSpeed()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEnoughSeats(int noPassengers) {
        if (noPassengers > this.getNoSeats()) {
            return false;
        } 
        return true;
    }

    @Override
    public String accelerate() {
        int currentSpeed = this.getCurrentSpeed();
        String result = this.getOwner().getName() + " is accelerating the speed up to: ";
        int i = 0;
        do {
            currentSpeed += 2;
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
        return 90;
    }

    @Override
    public int calculateTotalBill() {
        if (this.getDamagePercent() <= 5) {
            return 0;
        } else if (this.getDamagePercent() <= 30) {
            return 400000;
        } else if (this.getDamagePercent() > 30 && this.getDamagePercent() <= 80) {
            return 900000;
        } else {
            return 1200000;
        }
    }

    @Override
    public String toString() {
        return "Car[Manufacturer: " + this.getMf().getName() + ", origin: " + this.getMf().getOrigin() + ", Owner: " + this.getOwner().getName() + ", Seats: " + this.noSeats + ", currentSpeed: " + this.getCurrentSpeed() + "]";
    }
}
