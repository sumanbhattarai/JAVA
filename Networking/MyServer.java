
import java.io.* ;
import java.net.* ;

public class MyServer 
{
    public static void main(String[] args) 
    {
        try
        {
            ServerSocket ss = new ServerSocket(6666) ; // 6666 is port .
            Socket s = ss.accept() ; // Establish Connection

            DataInputStream dis  = DataInputStream(s.getInputStream()) ;
            String str = (String)dis.readUTF() ;
            System.out.println("Message is : " + str ) ;
            ss.close();
        }
        catch(Exception e)
        {
            System.out.println("Error is : " + e.getMessage());

        }
        
    }
}