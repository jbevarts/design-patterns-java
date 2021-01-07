package Creational.Builder.Template.Package;

public class Director {
    private IBuilder builder;

    public Director(IBuilder builder) {
        this.builder = builder;
    }
    public void construct() {
        this.builder.buildPartA();
        this.builder.buildPartB();
        this.builder.buildPartC();
    }
    public String getResults() {
        return this.builder.getResults();
    }
}
