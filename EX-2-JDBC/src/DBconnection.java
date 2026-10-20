import java.sql.Connection;
import java.sql.DriverManager;
public class DBconnection {
    public static Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/college";
            String user = "root";
            String password = "password";

            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Connected Successfully!");
            return con;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

