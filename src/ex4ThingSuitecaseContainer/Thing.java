package ex4ThingSuitecaseContainer;

public class Thing implements Comparable<Thing> {
    private String name;
    private Integer weight;

    public Thing (String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }

    public int compareTo(Thing otherThing) {
        return weight.compareTo(otherThing.weight);
    }
}
