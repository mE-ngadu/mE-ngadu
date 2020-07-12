/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.*;

/**
 *
 * @author user
 */
public class dbConnection {

    private static dbConnection instance;
    private Connection conn;
    private String url = "jdbc:derby://localhost:1527/menagdu";
    private String username = "jojo";
    private String password = "123";
    private Statement st = null;

    public Statement dbCon() {

        String driver = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/menagdu";
        String username = "jojo";
        String password = "123";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url , username, password);
            st = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return st;
    }

    public Connection getConnection() {
        return conn;
    }

    public static dbConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new dbConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new dbConnection();
        }
        return instance;
    }

}
