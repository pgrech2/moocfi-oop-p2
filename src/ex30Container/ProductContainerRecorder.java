package ex30Container;

public class ProductContainerRecorder extends ProductContainer{

    private ContainerHistory containerHistory = new ContainerHistory();

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        super.addToTheContainer(initialVolume);
        this.containerHistory.add(super.getVolume());
    }

    public void addToTheContainer(double amount){
        if(amount >= 0.0) {
            super.addToTheContainer(amount);
            this.containerHistory.add(super.getVolume());
        }
    }

    public double takeFromTheContainer(double amount){
        double result = super.takeFromTheContainer(amount);
        System.out.println(result);
        if (result > 0.0) {
            this.containerHistory.add(super.getVolume());
        }
        return result;
    }

    public String history() {
        return this.containerHistory.toString();
    }

    public void printAnalysis() {
        System.out.println(
                "Product: " + super.getName() + "\n" +
                "History: " + this.history() + "\n" +
                "Greatest product amount: " + this.containerHistory.maxValue() + "\n" +
                "Smallest product amount: " + this.containerHistory.minValue() + "\n" +
                "Average: " + this.containerHistory.average() + "\n" +
                "Greatest change: " + this.containerHistory.greatestFluctuations() + "\n" +
                "Variance: " + this.containerHistory.variance());
    }
}
