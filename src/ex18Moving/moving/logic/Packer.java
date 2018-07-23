package ex18Moving.moving.logic;

import ex18Moving.moving.domain.Box;
import ex18Moving.moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {

    private int boxesVolume;

    public Packer (int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<>();
        Box box = new Box(this.boxesVolume);

        for (Thing thing : things) {
            Boolean success = box.addThing(thing);
            if (!success) {
                boxes.add(box);
                box = new Box(this.boxesVolume);
                box.addThing(thing);
            }
        }
        boxes.add(box);
        return boxes;
    }
}
