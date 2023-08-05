package jdbcPrograms.src;

import java.sql.*;

public class Program5_1f {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Bekknqv@12");
			Statement st = con.createStatement();
			String query = "DELETE FROM Student WHERE RollNo = 1008";
			if(st.executeUpdate("USE javaDataBase") != -1) {
				st.execute(query);
				System.out.println("success");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
