package greenCartsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/greencart";
    private static final String USER = "root";
    private static final String PASSWORD = "Gokul@19@69!";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
