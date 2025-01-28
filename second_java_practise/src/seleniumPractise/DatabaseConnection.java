package seleniumPractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub


		   // JDBC URL, username, and password of MySQL server
     String url = "jdbc:mysql://localhost:3306/your_database_name";
     String username = "your_username";
     String password = "your_password";

     // Initialize connection and statement objects
     Connection connection = null;
     Statement statement = null;

     try {
         // Load the MySQL JDBC driver
         Class.forName("com.mysql.cj.jdbc.Driver");

         // Establish the connection
         connection = DriverManager.getConnection(url, username, password);
         System.out.println("Database connected successfully!");

         // Create a statement object to execute SQL queries
         statement = connection.createStatement();

         // Execute a query
         String query = "SELECT * FROM your_table_name";
         ResultSet resultSet = statement.executeQuery(query);

         // Process the result set
         while (resultSet.next()) {
             System.out.println("Column1: " + resultSet.getString("column1_name"));
             System.out.println("Column2: " + resultSet.getString("column2_name"));
         }

         // Close the result set
         resultSet.close();
     } catch (Exception e) {
         e.printStackTrace();
     } finally {
         try {
             // Close the statement and connection
             if (statement != null) statement.close();
             if (connection != null) connection.close();
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
		
	}

}
