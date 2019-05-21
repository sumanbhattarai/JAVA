
import java.sql.* ;

public class InsertTable 
{
	public static void main(String[] args)
	{
		Connection conn= null ;
		PreparedStatement ps = null ;
		
		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/testdb" , "suman" , "admin045");
			
			String sql = "INSERT INTO sample (id , name , age)" + "Values(? , ? , ?)" ;
			
			ps = conn.prepareStatement(sql) ;
			
			ps.setInt(1, 1);
			ps.setString(2,"Suman") ;
			ps.setInt(3 ,  19);
			ps.execute();
			
			conn.close();
			
			
		}
		catch(Exception e )
		{
			System.out.println(e.getMessage());
		}
	}

}
