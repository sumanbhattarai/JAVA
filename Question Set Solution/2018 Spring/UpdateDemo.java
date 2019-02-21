

import java.sql.* ;

public class UpdateDemo {

	public static void main(String[] args) 
	{
		try {
			Connection conn = null ;
			PreparedStatement p = null ;

			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/testdb","suman","admin045");
			
			String sql = "update employee set Salary = ? where Post = ? " ;
			
			p = conn.prepareStatement(sql);
			p.setString(1, "50000");
			p.setString(2, "Manager");
			
			p.execute();
			
			
			
			
			
			
		} catch ( Exception ee )
			
			{
				System.out.println("Error is : " + ee.getMessage());
			}

		

	}

}
