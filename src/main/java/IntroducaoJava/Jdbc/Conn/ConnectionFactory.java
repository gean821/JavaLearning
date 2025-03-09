package IntroducaoJava.Jdbc.Conn;
//JAVA.SQL = Connection,
// Statement,ResultSet, DriverManager

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//conectando ao banco de dados.
public class ConnectionFactory {
   public static Connection getconnection () throws SQLException {
       String url = "jdbc:mysql://localhost:3306/mercado"; //cada banco de dados tem uma conexão.
       String username = "root";
       String password = "root"; //coloco todas infos que fiz no sql workBench
       return DriverManager.getConnection(url, username, password);
   }
}

