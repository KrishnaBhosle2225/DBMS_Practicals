

import java.sql.*;

public class ConnectDB 
{
	
	public static void main(String[] args) throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/sys";
		
		String user="debian-sys-maint";
		
		String pass="3lyYGHspowE1T3LY";
		
		DriverManager.getConnection(url,user,pass);
		
		System.out.println("Connection got Successfull");
		
	}

}
