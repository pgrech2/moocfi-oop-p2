package ex30Container;

import java.util.ArrayList;
import java.util.Collections;

public class ContainerHistory {

    private ArrayList<Double> containerHistory = new ArrayList<>();

    public void add(double situation) {
        this.containerHistory.add(situation);
    }

    public void reset() {
        this.containerHistory.clear();
    }

    public double maxValue(){
        if (this.containerHistory.isEmpty()) {
            return 0.0;
        }
        return Collections.max(this.containerHistory);
    }

    public double minValue() {
        if(this.containerHistory.isEmpty()) {
            return 0.0;
        }
        return Collections.min(this.containerHistory);
    }

    public double average() {
        if(this.containerHistory.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;
        for(double situation : this.containerHistory) {
            total = total + situation;
        }
        return total / this.containerHistory.size();
    }

    private ArrayList<Double> fluctuations() {
        ArrayList<Double> fluctuations = new ArrayList<>();
        if(this.containerHistory.isEmpty()) {
            return fluctuations;
        }
        for (int i = 0; i < this.containerHistory.size(); i++){
            if (i == 0) {
                fluctuations.add(0.0);
            } else {
                fluctuations.add(
                        Math.abs(containerHistory.get(i) -
                                containerHistory.get(i - 1)));
            }
        }
        return fluctuations;
    }

    public double greatestFluctuations() {
        ArrayList<Double> fluctuations = this.fluctuations();
        if (fluctuations.size() > 1) {
            return Collections.max(fluctuations);
        }
        return 0.0;
    }

    public double variance(){
        double accumulator = 0.0;
        double mean = this.average();
        for(double situation : this.containerHistory) {
            accumulator = accumulator + Math.pow(situation - mean, 2.0);
        }
        return accumulator / (this.containerHistory.size() - 1);
    }

    @Override
    public String toString() {
        return this.containerHistory.toString();
    }
}
