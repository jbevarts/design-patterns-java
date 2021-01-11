package Creational.Singleton.Template;

import Creational.Singleton.Template.Package.Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getObject();
        Singleton singleton1 = Singleton.getObject();
        Singleton singleton2 = Singleton.getObject();

        System.out.println(singleton.equals(singleton1));
        System.out.println(singleton.equals(singleton2));

        //Singleton failure = new Singleton();
    }
}
