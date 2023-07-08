package in.ac.iisc;

import java.util.HashMap;

public class Main {
    enum Type {
        LOCAL,
        REMOTE
    }
    public static void main(String[] args) {
        HashMap<String, Type> config1 = new HashMap<>();
        config1.put("Owner", Type.LOCAL);
        config1.put("Car", Type.REMOTE);
        config1.put("Manufacturer", Type.REMOTE);

        HashMap<String, Type> config2 = new HashMap<>();
        config2.put("Owner", Type.LOCAL);
        config2.put("Car", Type.LOCAL);
        config2.put("Manufacturer", Type.REMOTE);

        doTransformation(config1);
        doTransformation(config2);
    }

    public static void doTransformation(HashMap<String, Type> config) {
        // perform source code transformations as per the configuration here
    }
}