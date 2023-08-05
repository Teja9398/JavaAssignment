package jdbcPrograms.src;

import java.sql.*;

public class Program5_1d {
	public static void main(String[] args) {
		Connection con = null;
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Bekknqv@12");
			Statement st = con.createStatement();
			ResultSet rs1=null;
			
			if(st.executeUpdate("USE javaDataBase;") != -1) {
				rs1 = st.executeQuery("SELECT * FROM Student WHERE marks>50");
			}
			
			System.out.println("Students list who Scored more than 50 marks: \n"+"ROLLNO\tNAME\tMARKS");
			while(rs1.next()) {
				System.out.println(rs1.getInt("rollno")+"\t"+rs1.getString("sname")+"\t"+ rs1.getInt("marks"));
			}
			
			con.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
