package Creational.Singleton.Template.Package;

public class Singleton {
    private static Singleton instance;
    private Singleton() {
        System.out.println("creating instance");
    }

    public static Singleton getObject() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


}
