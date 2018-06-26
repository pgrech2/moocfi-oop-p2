import java.util.ArrayList;

public class Box {
    private ArrayList<ToBeStored> storedItems = new ArrayList<>();
    private double maxWeight;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    private double weight() {
        double weight = 0.0;
        for (ToBeStored item : this.storedItems) {
            weight += item.weight();
        }
        return weight;
    }

    public void add(ToBeStored item) {
        if ((item.weight() + weight()) <= this.maxWeight) {
            storedItems.add(item);
        }
    }

    public String toString() {
        return "Box: " + this.storedItems.size() + " things, total weight " + weight() + " kg";
    }
}
