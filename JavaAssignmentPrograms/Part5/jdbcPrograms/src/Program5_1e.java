package jdbcPrograms.src;

import java.sql.*;

public class Program5_1e {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Bekknqv@12");
			Statement st = con.createStatement();
			String query = "UPDATE student SET marks=marks+4 WHERE marks < 50";
			if(st.executeUpdate("USE javaDataBase") != -1) {
				st.executeUpdate(query);
				System.out.println("Updated");	
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
