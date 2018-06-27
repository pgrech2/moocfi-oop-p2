public class ex12OnlineShop {
    public static void main(String[] args) {
        Storehouse store = new Storehouse();
        Product milk = new Product("milk", 3);
        Product coffee = new Product("coffee", 5);

        store.addProduct(milk, 4);
        store.addProduct(coffee, 2);

        System.out.println("prices:");
        System.out.println("milk:  " + store.price(milk));
        System.out.println("coffee:  " + store.price(coffee));
        Product sugar = new Product("Sugar", 1);
        System.out.println("sugar: " + store.price(sugar));
        System.out.print("\n");

        // Exercise 12.2
        System.out.println("Stocks");
        System.out.println(store.productToString(sugar));
        System.out.println(store.productToString(coffee));
        System.out.println("Take a coffee: " + store.take(coffee));
        System.out.println(store.productToString(coffee));
        System.out.println("Take a coffee: " + store.take(coffee));
        System.out.println(store.productToString(coffee));
        System.out.println("Take a coffee: " + store.take(coffee));
        System.out.println(store.productToString(coffee));
        System.out.print("\n");

        // Exercise 12.3
        Product buttermilk = new Product("buttermilk", 2);
        store.addProduct(buttermilk, 20);
        store.printProducts();
        System.out.print("\n");
    }
}
