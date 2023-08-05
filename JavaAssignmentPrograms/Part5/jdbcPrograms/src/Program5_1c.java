package jdbcPrograms.src;

import java.sql.*;

public class Program5_1c {
	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Bekknqv@12");
			Statement st = con.createStatement();
			ResultSet rs = null;
			if(st.executeUpdate("USE javaDataBase") != -1) {
				rs = st.executeQuery("SELECT * FROM Student");				
			}
			System.out.println("Students list: \n"+"ROLLNO\tNAME\tMARKS");
			while(rs.next()) {
				System.out.println(rs.getInt("rollno")+"\t"+rs.getString("sname")+"\t"+ rs.getInt("marks"));
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
