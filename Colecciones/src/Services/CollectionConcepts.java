package Services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import Models.Product;

public class CollectionConcepts {

    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        /*
         * for (Product product : products) {
         * System.out.println(product);
         * }
         */

        /*
         * for (Product product : products) {
         * if (product.getWeight() > 20) {
         * products.remove(product);
         * } else {
         * System.out.println(product);
         * }
         * }
         */

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            final Product product = iterator.next();
            if (product.getWeight() > 20) {
                iterator.remove();
            } 
        }
        System.out.println(products);

        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(window));
        products.remove(window);
        System.out.println(products);
    }

}
