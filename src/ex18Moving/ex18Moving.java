package ex18Moving;

import ex18Moving.moving.domain.Box;
import ex18Moving.moving.domain.Item;
import ex18Moving.moving.domain.Thing;
import ex18Moving.moving.logic.Packer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex18Moving {
    public static void main(String[] args) {
        // Exercise 18.1
        Thing item = new Item("toothbrash", 2);
        System.out.println(item);
        System.out.println();

        // Exercise 18.2
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("passport", 2));
        items.add(new Item("another toothbrash", 1));
        items.add(new Item("circular saw", 100));

        Collections.sort(items);
        System.out.println(items);
        System.out.println();

        // Exercise 18.3
        Box box = new Box(5);
        System.out.println(box.addThing(new Item("item 1", 3)));
        System.out.println(box.addThing(new Item("item 2", 3)));
        System.out.println(box.addThing(new Item("item 3", 2)));
        System.out.println();

        // Exercise 18.4
        List<Thing> things = new ArrayList<Thing>();
        things.add(new Item("passport", 2));
        things.add(new Item("toothbrash", 1));
        things.add(new Item("book", 4));
        things.add(new Item("circular saw", 8));


        // we create a packer which uses boxes whose volume is 10
        Packer packer = new Packer(10);

        // we ask our packer to pack things into boxes
        List<Box> boxes = packer.packThings( things );

        System.out.println("number of boxes: "+boxes.size());
        for (Box b : boxes) {
            System.out.println("  things in the box: "+b.getVolume()+" dm^3");
        }
        System.out.println();

        // Exercise 18.5

    }
}
