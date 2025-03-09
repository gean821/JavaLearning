package IntroducaoJava.CrudJDBC.Conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory2 {
        public static Connection getConnection() throws SQLException {
            String url = "jdbc:mysql://localhost:3306/mercado"; //cada banco de dados tem uma conexão.
            String username = "root";
            String password = "root"; //coloco todas infos que fiz no sql workBench
            return DriverManager.getConnection(url, username, password);
        }
}
