
import java.io.* ;
import java.net.* ;

public class MyServer 
{
    public static void main(String[] args) 
    {
        try
        {
            // Server should initiate ServerSocket Object .

            ServerSocket ss = new ServerSocket(6666) ; // 6666 is port .

            // Then , Server object envokes accept() of Server .

            Socket s = ss.accept() ; // Establish Connection

            // This gets the message sent by the Client .

            DataInputStream dis  = new DataInputStream(s.getInputStream()) ;

            // Typehinting the UTF message into String .
            
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