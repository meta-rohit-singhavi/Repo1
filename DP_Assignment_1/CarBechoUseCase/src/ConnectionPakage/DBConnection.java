package ConnectionPakage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	
	 private Connection con;
	 private static DBConnection instance = new DBConnection();
	 
	 private DBConnection(){
		 con=null;
	 }
	public  Connection getConnection(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch( ClassNotFoundException e){
			System.out.println("Driver Class Not Found : "+e);
		}
		
		String host = "jdbc:mysql://localhost:3306/";
		String db = "carbecho";		
		String mysqlURL = host.trim() + db.trim();
		String user ="root";
		String pass = "12345"; 
		
		try{
		con = DriverManager.getConnection(mysqlURL,user,pass);
		}catch(SQLException e){
			System.out.println("SQL Exeception : "+e);
		}
		return con;
	}
	
	public static DBConnection getInstance(){
		
		return instance;
	}
}
