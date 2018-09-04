package ex11BoxesAndThings;

public class ex11BoxesAndThings {

    public static void main (String [] args) {
        System.out.println("Exercise 11.1");

        Book book1 = new Book("Fedor Dostojevski", "Crime and Punishment", 2.0);
        Book book2 = new Book("Robert Martin", "Clean Code", 1.0);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
        System.out.println("\n\n");


        System.out.println("Exercise 11.2");
        Box box = new Box(10);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2.0) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1.0) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );


        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        System.out.println( box );
        System.out.println("\n\n");

        System.out.println("Exercise 11.4");
        Box anotherBox = new Box(5.0);
        anotherBox.add( new Book("Robert Martin", "Clean Code", 1.0) );
        anotherBox.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );

        Box boxOfBoxes = new Box(15.0);
        boxOfBoxes.add(box);
        boxOfBoxes.add(anotherBox);

        System.out.println("box -> " + box);
        System.out.println("anotherBox -> " + anotherBox);
        System.out.println(boxOfBoxes);


    }
}
