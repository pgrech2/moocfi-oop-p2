package ex12OnlineShop;

import java.util.Scanner;

public class ex12OnlineShop {

    public static void main (String [] args) {
        System.out.println("Exercise 12.1");

        Storehouse store1 = new Storehouse();
        store1.addProduct("milk", 3, 10);
        store1.addProduct("coffee", 5, 7);

        System.out.println("prices:");
        System.out.println("milk:  " + store1.price("milk"));
        System.out.println("coffee:  " + store1.price("coffee"));
        System.out.println("sugar: " + store1.price("sugar"));
        System.out.println("\n\n");


        System.out.println("Exercise 12.2");
        Storehouse store2 = new Storehouse();
        store2.addProduct("coffee", 5, 1);
        store2.addProduct("sugar", 1, 0);

        System.out.println("stocks:");
        System.out.println("coffee:  " + store2.stock("coffee"));
        System.out.println("sugar: " + store2.stock("sugar"));

        System.out.println("we take a coffee " + store2.take("coffee"));
        System.out.println("we take a coffee " + store2.take("coffee"));
        System.out.println("we take sugar " + store2.take("sugar"));

        System.out.println("stocks:");
        System.out.println("coffee:  " + store2.stock("coffee"));
        System.out.println("sugar: " + store2.stock("sugar"));
        System.out.println("\n\n");

        System.out.println("Exercise 12.3");
        Storehouse store3 = new Storehouse();
        store3.addProduct("milk", 3, 10);
        store3.addProduct("coffee", 5, 6);
        store3.addProduct("buttermilk", 2, 20);
        store3.addProduct("jogurt", 2, 20);

        System.out.println("products:");
        for (String product : store3.products()) {
            System.out.println(product);
        }
        System.out.println("\n\n");

        System.out.println("Exercise 12.4");
        Purchase purchase = new Purchase("milk", 4, 2);
        System.out.println( "the total price of a purchase containing four milks is " + purchase.price() );
        System.out.println( purchase );
        purchase.increaseAmount();
        System.out.println( purchase );
        System.out.println("\n\n");

        System.out.println("Exercise 12.5");
        ShoppingBasket basket1 = new ShoppingBasket();
        basket1.add("milk", 3);
        basket1.add("buttermilk", 2);
        basket1.add("cheese", 5);
        System.out.println("basket price: " + basket1.price());
        basket1.add("computer", 899);
        System.out.println("basket price: " + basket1.price());
        System.out.println("\n\n");

        System.out.println("Exercise 12.6");
        basket1.print();
        System.out.println("\n\n");

        System.out.println("Exercise 12.7");
        ShoppingBasket basket2 = new ShoppingBasket();
        basket2.add("milk", 3);
        basket2.print();
        System.out.println("basket price: " + basket2.price() +"\n");

        basket2.add("buttermilk", 2);
        basket2.print();
        System.out.println("basket price: " + basket2.price() +"\n");

        basket2.add("milk", 3);
        basket2.print();
        System.out.println("basket price: " + basket2.price() +"\n");

        basket2.add("milk", 3);
        basket2.print();
        System.out.println("basket price: " + basket2.price() +"\n");

        System.out.println("Exercise 12.8");
        Storehouse store = new Storehouse();
        store.addProduct("coffee", 5, 10);
        store.addProduct("milk", 3, 20);
        store.addProduct("milkbutter", 2, 55);
        store.addProduct("bread", 7, 8);

        Shop shop = new Shop(store, new Scanner(System.in));
        shop.manage("Pekka");
    }
}
