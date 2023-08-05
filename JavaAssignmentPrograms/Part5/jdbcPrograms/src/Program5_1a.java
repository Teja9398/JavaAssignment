package jdbcPrograms.src;

import java.sql.*;

public class Program5_1a {
    public static void main(String[] args) {
    	Connection con =null;
    	try {
//    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Bekknqv@12");
    		Statement st = con.createStatement();
    		st.execute("use JavaDataBase;");  
    		if(st.executeUpdate("CREATE TABLE Student(SName Varchar(20),RollNO INTEGER, Marks INTEGER);")>-1) {
    			System.out.println("Table created successfully");
    		}
    		con.close();
    		
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    }
}
