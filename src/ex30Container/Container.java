package ex30Container;

public class Container {

    private double originalCapacity;
    private double volume;

    public Container(double capacity) {
        if (capacity > 0.0){
            this.originalCapacity = capacity;
        } else {
            this.originalCapacity = 0.0;
        }
        this.volume = 0.0;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getOriginalCapacity() {
        return this.originalCapacity;
    }

    public double getCurrentCapacity() {
        return this.originalCapacity - this.getVolume();
    }

    public void addToTheContainer (double amount) {
        if(amount >= 0.0) {
            if (amount <= this.getCurrentCapacity()){
                this.volume = this.volume + amount;
            } else {
                this.volume = this.originalCapacity;
            }
        }

    }

    public double takeFromTheContainer(double amount) {
        double receive = this.volume - amount;
        if (receive > 0.0 && amount > 0.0) {
            this.volume = receive;
            return receive;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "volume = " + this.getVolume() + ", " + "free space " + this.getCurrentCapacity();
    }


}
