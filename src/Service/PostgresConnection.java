package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {
    static Connection connection = null;
    public static Connection getInstance(){
        try {
            connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","qwerty");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
