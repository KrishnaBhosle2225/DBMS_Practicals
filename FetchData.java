
import java.sql.*;

public class FetchData {

	public static void main(String args[]) {

		try{

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","debian-sys-maint","3lyYGHspowE1T3LY");

		System.out.println("Database Connected");

		Statement st = con.createStatement();
			
		ResultSet rs = st.executeQuery("select * from employee");
		
		Boolean flag = false;
		
		while(rs.next())
		{
			flag = true;
			
			System.out.println("Id is " +rs.getInt(1) + " Name is "+rs.getString(2));
			
		}
		if(flag == false)
		{
			
			System.out.println("No data found");
			
		}
		
		
		}catch (Exception e) {
			
			System.out.println(e.getMessage());		
		}	
	}
}

