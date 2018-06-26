public class Calculator {
    private int value;

    public Calculator (int originalValue) {
        this.value = originalValue;
    }

    public void increaseValue() {
        this.value += 1;
    }

    public int returnValue() {
        return this.value;
    }
}
