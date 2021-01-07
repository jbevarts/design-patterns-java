package Creational.Builder.Template;
import Creational.Builder.Template.Package.*;

public class Client {
    public static void main(String[] args) {
        IBuilder builder = new BuilderImpl();
        Director director = new Director(builder);
        director.construct();
        String results = director.getResults();
        System.out.println("The Results are : " + results);
    }
}
