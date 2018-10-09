package ex30Container;

public class ex30Container {

    public static void main (String [] args) {
        // the well known way:
        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
        System.out.println(juice.history());
        juice.takeFromTheContainer(11.3);
        System.out.println(juice.history());


        System.out.println(juice.getName()); // Juice
        juice.addToTheContainer(1.0);
        System.out.println(juice);           // Juice: volume = 989.7, free space 10.3 ...
        // but now we have our history record
        System.out.println(juice.history()); // [1000.0, 988.7, 989.7] ...

        juice.printAnalysis();
    }
}
