

//table employee contains only id and name 
import java.sql.*;

public class DeleteData {

	public static void main(String args[]) {

		try{

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","debian-sys-maint","3lyYGHspowE1T3LY");

		System.out.println("Database Connected");
		

		Statement st = con.createStatement();
		String sql = "delete from employee where id = 2";
		
		int count=st.executeUpdate(sql);
		
		System.out.println("The number of rows deleted : "+count);
		
		}catch(Exception e)
		{
			System.out.println(e);
		}	

	}
}

