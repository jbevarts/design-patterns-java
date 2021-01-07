package Creational.Prototype.Template;

import Creational.Prototype.Template.Package.Prototype;
import Creational.Prototype.Template.Package.PrototypeImpl;
import Creational.Prototype.Template.Package.PrototypeRegistry;

public class Client {
    public static void main(String[] args) {
        PrototypeRegistry registry = new PrototypeRegistry();
        Prototype prototype = new PrototypeImpl();
        registry.addPrototype("prototypeImpl", prototype);
        Prototype clone = registry.getPrototype("prototypeImpl");

        System.out.println("clone class is : " + clone.getClass());
        System.out.println("prototype class is : " + prototype.getClass());
        System.out.println("prototype: data0: " + prototype.data1 + " data1: " + prototype.data2);
        System.out.println("clone: data0: " + clone.data1 + " data1: " + clone.data2);
        ((PrototypeImpl) clone).superSpecialMethod();
    }
}
