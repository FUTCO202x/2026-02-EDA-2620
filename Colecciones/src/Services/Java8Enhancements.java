package Services;

import java.util.HashMap;
import java.util.Map;

import Models.Product;
import Models.Product2;

public class Java8Enhancements {

    public static void main(String[] args) {
        final Product2 defaultProduct = new Product2(-1, "Producto No existe con esta llave", 0);

        Product2 door = new Product2(1, "Wooden Door", 35);
        Product2 floorPanel = new Product2(2, "Floor Panel", 25);
        Product2 window = new Product2(3, "Glass Window", 10);

        final Map<Integer, Product2> idToProduct = new HashMap<>();
        idToProduct.put(1, door);
        idToProduct.put(2, floorPanel);
        idToProduct.put(3, window);

        /*System.out.println(idToProduct);
        Product2 result = idToProduct.getOrDefault(7, defaultProduct);
        System.out.println(result);
        System.out.println(idToProduct.get(7));
        System.out.println();

        result = idToProduct.computeIfAbsent(10, (id) -> 
                        new Product2(id, "Custom Product", 10));
        System.out.println(result);
        System.out.println(idToProduct.get(10));
        System.out.println();

        result = idToProduct.replace(1, new Product2(1, "Big Door", 50));
        System.out.println(result);
        System.out.println(idToProduct.get(1));
        System.out.println();

        result = idToProduct.replace(1, new Product2(1, "Big Door 2", 500));
        System.out.println(result);
        System.out.println(idToProduct.get(1));
        System.out.println();*/

        idToProduct.replaceAll((key, oldProduct) -> new Product2(oldProduct.getId(), 
                oldProduct.getName(), oldProduct.getWeight() + 10));
        System.out.println(idToProduct);
        System.out.println();

        idToProduct.forEach((key, value) -> System.out.println(key + " -> " + value));
    }


}
