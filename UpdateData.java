
import java.sql.*;

public class UpdateData {

	public static void main(String args[]) {

		try{

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","debian-sys-maint","3lyYGHspowE1T3LY");

		System.out.println("Database Connected");
		

		Statement st = con.createStatement();
		
		String sql = "update employee set name='Aniket Chakkarwar' where id = 76";
		
		st.executeUpdate(sql);
		
		System.out.println("Data updated Successfully");
		
		String select_query = "select * from employee";
		
		ResultSet rs = st.executeQuery(select_query);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2));
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}	

	}
}

