import java.util.ArrayList;

public class Container {
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    private int weightLimit;

    public Container (int weightLimit) {
        this.weightLimit = weightLimit;
    }

    private int currentWeight(){
        int weight = 0;
        for (Suitcase suitcase : this.suitcases){
            weight += suitcase.totalWeight();
        }
        return weight;
    }

    public void addSuitcase (Suitcase suitcase) {
        if ((currentWeight() + suitcase.totalWeight()) <= this.weightLimit) {
            this.suitcases.add(suitcase);
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + currentWeight() + " kg)";
    }

    public void printThings(){
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printThings();
        }
    }
}
