
import java.io.* ;

class PWDemo 
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter pw = new PrintWriter("abc.txt") ;
        pw.write("Suman");
        pw.println("Bhattarai");
        pw.println("GCES");
        pw.flush() ;
        pw.close();
        
    }

}