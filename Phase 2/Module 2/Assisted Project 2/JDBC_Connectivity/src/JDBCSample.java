import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCSample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/db3";
        String username = "root";
        String password = "nareshrao";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            if (connection != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to connect to the database!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
