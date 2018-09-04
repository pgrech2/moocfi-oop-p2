package ex4ThingSuitecaseContainer;

public class ex4ThingSuitcaseContainer {

    public static void main(String[] args) {

        // Exercise 4.1
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);

        System.out.println("Book name: " + book.getName());
        System.out.println("Book weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Mobile: " + mobile);
        System.out.println("\n");

        // Exercise 4.2 & 4.3
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addThing(book);
        System.out.println(suitcase);

        suitcase.addThing(mobile);
        System.out.println(suitcase);

        suitcase.addThing(brick);
        System.out.println(suitcase);
        System.out.println("\n");

        // Exercise 4.4
        Suitcase suitcase2 = new Suitcase(10);
        suitcase2.addThing(book);
        suitcase2.addThing(mobile);
        suitcase2.addThing(brick);

        System.out.println("Your suitcase contains the following things:");
        suitcase2.printThings();
        System.out.println("Total weight: " + suitcase2.totalWeight() + " kg");
        System.out.println("\n");

        // Exercise 4.5
        Thing heaviest = suitcase2.heaviestThing();
        System.out.println("The heaviest moving: " + heaviest);

        // Exercise 4.6
        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println(container);
        System.out.println("\n");

        // Exercise 4.7
        System.out.println("There are the following things in the container suitcases:");
        container.printThings();
        System.out.println("\n");

        // Exercise 4.8
        Container testContainer = new Container(1000);
        addSuitcasesFullOfBricks(testContainer);
        System.out.println(testContainer);
    }

    public static void addSuitcasesFullOfBricks (Container container) {
        for (int i = 1; i < 101; ++i) {
            Thing brick = new Thing("Brick", i);
            Suitcase suitcase = new Suitcase(200);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }
}
