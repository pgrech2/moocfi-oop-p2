package ex12OnlineShop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> productPrices = new HashMap<>();
    private Map<String, Integer> productStocks = new HashMap<>();

    public void addProduct(String product, int price, int stock){
        if(!productPrices.containsKey(product)) {
            productPrices.put(product, price);
            productStocks.put(product, stock);
        }
    }

    public int price (String product) {
        if(productPrices.containsKey(product)) {
            return productPrices.get(product);
        }
        return -99;
    }

    public int stock (String product) {
        if(productStocks.containsKey(product)) {
            return productStocks.get(product);
        }
        return -99;
    }

    public boolean take (String product) {
        Integer productStock = productStocks.get(product);

        if (productStock == null ) {
            return false;
        }

        if (productStock == 0) {
            return false;
        } else {
            productStocks.put(product, productStock - 1);
            return true;
        }
    }

    public Set<String> products() {
        return productPrices.keySet();
    }
}
