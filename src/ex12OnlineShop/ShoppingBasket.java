package ex12OnlineShop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> purchaseMap = new HashMap<>();

    public void add(String product, int price) {
        Purchase purchase = new Purchase (product, 1, price);
        if(this.purchaseMap.containsKey(product)){
            this.increaseAmount(product);
        } else {
            this.purchaseMap.put(product, purchase);
        }
    }

    private void increaseAmount(String product){
        Purchase purchase = this.purchaseMap.get(product);
        purchase.increaseAmount();
        this.purchaseMap.put(product, purchase);
    }

    public int price() {
        int sum = 0;
        for (Purchase purchase : this.purchaseMap.values()){
            sum = sum + purchase.price();
        }
        return sum;
    }

    public void print() {
        for (Purchase purchase : this.purchaseMap.values()){
            System.out.println(purchase.toString());
        }
    }


}
