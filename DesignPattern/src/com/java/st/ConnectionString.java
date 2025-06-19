package com.java.st;

public class ConnectionString {

    private static ConnectionString cs;

    // Private constructor to prevent external instantiation
    private ConnectionString() {}

    // Public method to return the singleton instance
    public static ConnectionString getInstance() {
        if (cs == null) {
            cs = new ConnectionString();
        }
        return cs;
    }

    // Method to return credentials based on the database name
    public String getCredentials(String db) {
        String result = "";

        switch (db) {
            case "MySql":
                result = "root/India@123";
                break;
            case "Oracle":
                result = "scott/tiger";
                break;
            case "SqlServer":
                result = "sa/password123";
                break;
            default:
                result = "Invalid database";
        }

        return result;
    }
}
