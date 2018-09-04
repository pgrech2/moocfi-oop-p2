package ex11BoxesAndThings;

import java.util.ArrayList;

public class Box implements ToBeStored{
    private double maximumWeight;
    private ArrayList<ToBeStored> storage = new ArrayList<>();

    public Box (double maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    @Override
    public double weight() {
        double totalWeight = 0.0;
        for (ToBeStored stored : this.storage) {
            totalWeight = totalWeight + stored.weight();
        }
        return totalWeight;
    }

    public boolean canBeStored(ToBeStored toBeStored) {
        return (weight() + toBeStored.weight()) <= this.maximumWeight;
    }

    public void add (ToBeStored toBeStored) {
        if (canBeStored(toBeStored)) {
            storage.add(toBeStored);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.storage.size() + " things, total weight " + weight() + " kg";
    }
}
