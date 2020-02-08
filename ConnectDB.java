import java.sql.*;

public class ConnectDB{
	public static void main(String str[]){
		Connection conn = null;

		try{
			String userName = "pusha";
			String password = null;
			String url = "jdbc:mysql://localhost/test";
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			//conn = DriverManager.getConnection(url,userName,password);
			System.out.println("Database connection successful.");	
		}catch(Exception e){
			System.out.println("Cannot connect to the databse.");
		}	
		finally{
			if(conn != null){
				try{
					conn.close();
					System.out.println("Database connection closed.");
				}catch(Exception e){
					System.out.println("Database connection cannot be closed.");
				}	
			}
		}
	}
}