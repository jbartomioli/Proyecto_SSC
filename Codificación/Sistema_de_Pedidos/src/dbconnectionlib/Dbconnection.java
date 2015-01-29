package dbconnectionlib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver found");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found: "+e);
		}
		
		String url = "jdbc:mysql://localhost/bd_ssc";
		String user = "root";
        String password = "root";
        
        Connection connection = null;
        
        try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Conexión correcta.");
		} catch (SQLException e) {
			System.out.println("Error al leer la cadena de conexión: "+e);
		}

	}

}
