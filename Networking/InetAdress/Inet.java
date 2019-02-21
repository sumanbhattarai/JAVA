
import java.net.* ;
 
class Inet {
    public static void main(String args[]) throws Exception {
        InetAddress obj = InetAddress.getLocalHost();
        System.out.println("IP Address:- " + obj.getHostAddress());
        System.out.println("Host Name:- " + obj.getHostName());
    }
}