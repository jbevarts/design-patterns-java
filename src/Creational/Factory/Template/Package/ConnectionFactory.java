package Creational.Factory.Template.Package;

public class ConnectionFactory {
    public static Connection getConnection(String type) {
        if (type.equals("database")) {
            return DatabaseConnection.getClient();
        } else {
            return null;
        }
    }
}
