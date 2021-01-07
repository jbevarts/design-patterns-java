package Creational.Prototype.Template.Package;

public abstract class Prototype implements Cloneable {
    public String data1 = "data1";
    public String data2 = "data2";

    abstract void superSpecialMethod();

    public Prototype clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("cloning not available");
        }
        return (Prototype) clone;
    };
}
