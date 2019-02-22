package fr.application.hocine1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJDBC {

	Connection con = null;
	private static String URL = "jdbc:mysql://localhost:3306/employee";
	private static String LOGIN = "root";
	private static String PASSWORD = "Hocine15";

public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// List<Employee> employee = new ArrayList<Employee>();
	        Class.forName("com.mysql.jdbc.Driver"); 
		    Connection con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
		    Statement stmt = con.createStatement();
		    ResultSet rset = stmt.executeQuery("SELECT * FROM employee");

		    while ( rset.next() ) {
		        int EMP_Id = rset.getInt("EMP_Id");
		        String EMP_NAME = rset.getString("EMP_NAME");
		        int SALARY = rset.getInt("SALARY");
	        
	        System.out.println("Mr"+ EMP_Id + " " + EMP_NAME + " touche " + SALARY + "euros");
		    }
		    rset.close();
		    stmt.close();
		    con.close();
	}

}
