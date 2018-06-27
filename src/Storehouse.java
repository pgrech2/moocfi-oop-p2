import java.util.HashMap;

public class Storehouse {
    private HashMap<Product, Integer> products = new HashMap<Product, Integer>();

    public void addProduct (Product product, Integer stock) {
        if (!this.products.containsKey(product)) {
            this.products.put(product, stock);
        }
    }

    public int price (Product product) {
        if(this.products.containsKey(product)) {
            return product.getPrice();
        } else {
            return -99;
        }
    }

    public int stock (Product product) {
        return products.get(product);
    }

    public boolean take (Product product) {
        int inventory = products.get(product);
        if (inventory > 0) {
            products.put(product, inventory - 1);
            return true;
        }
        return false;
    }

    public String productToString(Product product) {
        if (this.products.containsKey(product)) {
            return "Inventory " + this.products.get(product) + " for " + product;
        } else {
            return product.getName() + " does not exist";
        }
    }

    public void printProducts() {
        System.out.println("Products:");
        for(Product product : this.products.keySet()) {
            System.out.println(product.getName());
        }
    }
}
