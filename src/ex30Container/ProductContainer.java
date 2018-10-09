package ex30Container;

public class ProductContainer extends Container{

    private String name;

    public ProductContainer(String name, double capacity) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public String toString() {
        return this.name + ": " + super.toString();
    }
}
