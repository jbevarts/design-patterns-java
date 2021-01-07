package Creational.Builder.Template.Package;

public class BuilderImpl implements IBuilder {
    private String result;

    public BuilderImpl() {
        this.result = "Success";
    }

    public void buildPartA() {}
    public void buildPartB() {}
    public void buildPartC() {}

    public String getResults() {
        return result;
    }
}
