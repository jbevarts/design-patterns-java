package Creational.Factory.Template;

import Creational.Factory.Template.Package.*;

public class Client {
    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();
        Connection dbConnection = factory.getConnection("database");
        dbConnection.createConnection();
    }
}
