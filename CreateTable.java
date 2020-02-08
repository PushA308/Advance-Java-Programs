import java.sql.*;

public class CreateTable{
	public static void main(String str[]){
		Connection conn = null;

		try{
			String userName = "root";
			String password = "Piyush@123";
			String url = "jdbc:mysql://localhost/Film";
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url,userName,password);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("drop table books");
			stmt.executeUpdate (
				"create table books(" +
				"isbn char(10),title char(50),"+
				"author char(50),publisher char(50))");
			conn.close();
			System.out.println("Table created.");		
		}catch(Exception e){
			System.out.println("Error creating table");	
		}		
	}
}



