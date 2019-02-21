
import java.sql.* ;

public class ShowAll {

	public static void main(String[] args) 
	{
		try {
			Connection conn = null ;
			Statement s = null ;
			ResultSet r = null ;

			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/testdb","suman","admin045");
			
			String sql = "select * from employee " ;
			
			s = conn.createStatement() ;
			r = s.executeQuery(sql) ;
			
			while(r.next())
			{
				System.out.println(r.getInt(1));
                System.out.println(r.getString(2));
                System.out.println(r.getString(3));
			}
			
			
			
			
			
		} catch ( Exception ee )
			
			{
				System.out.println("Error is : " + ee.getMessage());
			}

		

	}

}
