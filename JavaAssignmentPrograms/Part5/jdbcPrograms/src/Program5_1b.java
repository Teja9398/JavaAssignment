package jdbcPrograms.src;

import java.sql.*;

public class Program5_1b {
	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Bekknqv@12");
			Statement st = con.createStatement();
			String query = "INSERT INTO student VALUES "
						 + "(\"Rama\",1001,98),"
						 + "(\"Sita\",1002,95),"
						 + "(\"David\",1004,50),"
						 + "(\"teja\",1008,48),"
						 + "(\"sid\",1016,58),"
						 + "(\"surya\",1032,30);";
			if(st.executeUpdate("USE javaDataBase")>-1) {
				st.execute(query);
				System.out.println("Values Inserted");
			}
			con.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
