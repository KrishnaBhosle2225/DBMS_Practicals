
import java.sql.*;

public class InsertData {

	public static void main(String args[]) {

		try{

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","debian-sys-maint","3lyYGHspowE1T3LY");

		System.out.println("Database Connected");
		

		String sql="insert into employee values(76,'Sanket Kumbhar')";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.executeUpdate();
		System.out.println("Data inserted Successfully");
	
		
		}catch (Exception e) {
			
			System.out.println(e.getMessage());		
		}	
	}
}

