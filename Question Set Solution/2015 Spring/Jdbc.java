
import java.sql.* ;

public class ShowData 
{
	public static void main(String[] args)
	{
		Statement s = null ;
		Connection conn =null ;
		ResultSet rs = null ;
		
		try
		{
			//Conneciton
			conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/testdb","suman","admin045");
			
			String sql = "select * from Student where id<100" ;
			
			s = conn.createStatement() ;
			
			
			rs = s.executeQuery(sql) ;
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
			}
			
		//	conn.close();
			
		}
		catch ( Exception e )
		{
			
		}
	}

}
