import java.sql.*;

public class SimpleQuery{
	public static void main(String str[]){
		Connection conn = null;

		try{
			String userName = "root";
			String password = "Piyush@123";
			String url = "jdbc:mysql://localhost/Film";
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url,userName,password);
			Statement stmt;
			ResultSet rset;

			stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from films");
			while(rset.next()){
				String title = rset.getString("title");
				int year = rset.getInt("year");
				String director = rset.getString("director");
				System.out.println("Title:"+title);
				System.out.println("Year:"+year);
				System.out.println("Director:+director");
			}
			rset.close();
			conn.close();		
		}catch(Exception e){
			System.out.println("Error:"+e.toString());
		}
		
	}
}