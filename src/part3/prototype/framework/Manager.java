package part3.prototype.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String,Product> map = new HashMap<>();

    public void register(String name,Product product){
        map.put(name,product);
    }

    public Product create(String productName){
        Product product = map.get(productName);
        return product.createClone();
    }
}
