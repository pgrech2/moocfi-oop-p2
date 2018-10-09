package ex32DifferentBoxes.boxes;

public class Thing {

    private int weight;
    private String name;

    public Thing(String name, int weight) {
        if (weight < 0){
            throw new IllegalArgumentException("Weight is less than 1");
        }
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this.name = name;
        this.weight = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (this.getClass() != object.getClass()){
            return false;
        }

        Thing compared = (Thing) object;
        if (!this.name.equals(compared.getName()) ||
                !this.name.equals(compared.getName())){
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        if (this.name == null) {
            return 7;
        }

        return this.name.hashCode();
    }




}
