package Creational.Prototype.Template.Package;

import java.util.HashMap;

public class PrototypeRegistry {
    private HashMap<String, Prototype> registry;

    public PrototypeRegistry() {
         registry = new HashMap<>();
    }

    public Prototype getPrototype(String name) {
        for (String s: registry.keySet()) {
            if (s.equals(name)) {
                return registry.get(name).clone();
            }
        }
        return null;
    }

    public void addPrototype(String name, Prototype prototype) {
        registry.put(name, prototype);
    }

}
