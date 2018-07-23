package ex3Calculator;

import java.util.ArrayList;

public class Calculator {
    private Reader reader;
    private int operationCount = 0;
    private ArrayList<Integer> inputs;

    public Calculator() {
        this.reader = new Reader();
        this.inputs = new ArrayList<Integer>();
    }

    public void start() {
        while (true) {
            System.out.print("Commands: ");
            String command = this.reader.readString();
            if (command.equals("end")) {
                break;
            }

            this.operationCount++;

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void input() {
        System.out.print("First value: ");
        this.inputs.add(this.reader.readInteger());

        System.out.print("Second value: ");
        this.inputs.add(this.reader.readInteger());
    }

    private void sum() {
        input();
        int result = this.inputs.get(0) + this.inputs.get(1);
        this.inputs.clear();
        System.out.println("Sum of the values: " + result);
    }

    private void difference() {
        input();
        int result = this.inputs.get(0) - this.inputs.get(1);
        this.inputs.clear();
        System.out.println("Difference between the values: " + result);

    }

    private void product() {
        input();
        int result = this.inputs.get(0) * this.inputs.get(1);
        this.inputs.clear();
        System.out.println("Product of the values: " + result);
    }

    private void statistics() {
        System.out.println("Calculations: " + this.operationCount);
    }
}
