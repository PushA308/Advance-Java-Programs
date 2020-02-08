import java.sql.*;

public class InsertData{
	public static void main(String str[]){
		Connection conn = null;
		try{
			String userName = "root";
			String password = "Piyush@123";
			String url = "jdbc:mysql://localhost/Film";
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url,userName,password);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(
				"insert into books(isbn,title,author,publisher)"+
				"values"+
				"('0001','java complete ref',"+
				"'H Schildt','oracle Press'),"+
				"('0002','Effective java',"+
				"'J Bloch','Add-Wesley')");
			conn.close();
			System.out.println("Record added.");			
		}catch(Exception e){
			System.out.print("Error inserting record.");	
		}
	}
}