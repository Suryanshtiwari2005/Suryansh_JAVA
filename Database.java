import java.sql.*;
import java.util.Scanner;
public class Database {
    public static void main(String[] args) throws Exception {
        // Load the SQLite JDBC driver
        Class.forName("org.sqlite.JDBC");

        // Establish connection
        Connection con = DriverManager.getConnection("jdbc:sqlite:D://Sql lite//univ");

        Statement stm = con.createStatement();

        stm.executeUpdate("insert into dept values(60,'Chem')");


        // Close the statement and connection
        stm.close();
        con.close();
    }
}
