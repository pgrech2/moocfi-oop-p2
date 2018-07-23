package ex18Moving.moving.domain;

import java.util.ArrayList;

public class Box implements Thing {

    private int maximumCapacity;
    private ArrayList<Thing> things = new ArrayList<>();

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public int getVolume() {
        int total = 0;
        for (Thing thing : this.things) {
            total += thing.getVolume();
        }
        return total;
    }

    public boolean addThing(Thing thing) {
        if ((getVolume() + thing.getVolume()) <= this.maximumCapacity) {
            this.things.add(thing);
            return true;
        }
        return false;
    }
}
