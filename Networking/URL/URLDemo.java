
import java.net.*;


class URLDemo
{
    public static void main(String[] args) 
    {
        try {
        URL obj = new URL("https://sbofficial.me") ;

        System.out.println("Protocol is : " + obj.getProtocol());
        System.out.println("Hostname is : " + obj.getHost());
        System.out.println("Port number is : " + obj.getPort()) ;
        } catch(Exception e )
        {
            System.out.println(e.getMessage());
        }
        
    }
}