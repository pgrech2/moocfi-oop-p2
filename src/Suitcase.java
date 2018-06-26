import java.util.ArrayList;
import java.util.Collections;

public class Suitcase {
    ArrayList<Thing> things = new ArrayList<>();
    private int maxWeight;

    public Suitcase (int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addThing (Thing thing) {
        if ((currentWeight() + thing.getWeight()) <= this.maxWeight) {
            this.things.add(thing);
        }
    }

    private int currentWeight(){
        int weight = 0;
        for (Thing thing : this.things){
            weight += thing.getWeight();
        }
        return weight;
    }

    private String formatWeight(int weight) {
        return "(" + weight + " kg)";
    }

    public String toString(){
        if (this.things.size() == 0) {
            return "empty " + formatWeight(0);
        } else {
            return this.things.size() + " things " + formatWeight(currentWeight());
        }
    }

    public void printThings() {
        for(Thing thing : this.things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        return currentWeight();
    }

    public Thing heaviestThing() {
        if (this.things.isEmpty()){
            return null;
        } else {
            Collections.sort(this.things);
            return this.things.get(this.things.size() - 1);
        }
    }


}
