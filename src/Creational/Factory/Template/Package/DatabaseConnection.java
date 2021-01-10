package Creational.Factory.Template.Package;

public class DatabaseConnection implements Connection {
    private static DatabaseConnection databaseConnection;
    private DatabaseConnection() {
        databaseConnection = new DatabaseConnection();
    }

    public static DatabaseConnection getClient() {
        if (databaseConnection == null) {
            new DatabaseConnection();
        }
        return databaseConnection;
    }

    public void createConnection() {
        System.out.println("connection created");
    }
}
