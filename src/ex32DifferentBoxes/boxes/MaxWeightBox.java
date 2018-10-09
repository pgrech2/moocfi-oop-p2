package ex32DifferentBoxes.boxes;

import java.util.ArrayList;
import java.util.Collection;

public class MaxWeightBox extends Box{

    private int maxWeight;
    private ArrayList<Thing> things = new ArrayList<>();

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        if (this.things.isEmpty()){
            return 0;
        }

        int total = 0;
        for (Thing thing : this.things) {
            total = total + thing.getWeight();
        }
        return total;
    }

    public boolean isInTheBox(Thing thing){
        return things.contains(thing);
    }

    @Override
    public void add (Thing thing){
        if (thing.getWeight() + this.totalWeight() <= this.maxWeight){
            this.things.add(thing);
        }
    }
}
