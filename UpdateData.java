import java.sql.*;
import java.util.Scanner;

public class UpdateData{
	public static void main(String str[]){
		Connection conn = null;
		Scanner input = new Scanner(System.in);
		try{
			String userName = "root";
			String password = "Piyush@123";
			String url = "jdbc:mysql://localhost/Film";
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url,userName,password);
			Statement stmt = conn.createStatement();

			//BufferedReader input = new BufferedReader(InputStreamReader(System.in));
			System.out.println("Enter record to update (isbn):");
			String isbn = input.nextLine();
			System.out.println("Enter field to update:");			
			String field = input.nextLine();
			System.out.println("Enter data:");
			String data = input.nextLine();			
			String updateString = 
				"update books set " + field + "='" + data + "'" +
				"where isbn = " + isbn;
			stmt.executeUpdate(updateString);
			
			conn.close();
			System.out.println("recorded updated.");
		}catch(Exception e){
			System.out.println("Error updating record.");
		}
	}
}








