package ex28Groups;

import ex28Groups.movable.Group;
import ex28Groups.movable.Organism;

public class ex28Groups {

    public static void main (String [] args) {

        System.out.println("Part 1:");
        Printer printer = new Printer();
        String string = "works";
        printer.printCharacters(string);

        System.out.println("Part 2:");
        Organism organism = new Organism(20, 30);
        System.out.println(organism);
        organism.move(-10, 5);
        System.out.println(organism);
        organism.move(50, 20);
        System.out.println(organism);

        System.out.println("Part 3:");
        Group group = new Group();
        group.addToGroup(new Organism(73, 56));
        group.addToGroup(new Organism(57, 66));
        group.addToGroup(new Organism(46, 52));
        group.addToGroup(new Organism(19, 107));
        System.out.println(group);
    }
}
