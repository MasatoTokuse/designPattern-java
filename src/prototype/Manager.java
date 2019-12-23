package prototype;

import java.util.HashMap;

public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String protoname) {
        //※
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}