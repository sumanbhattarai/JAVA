
import java.io.* ;

class StringReader
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader ( new FileReader("gces.txt")) ;
        String r = br.readLine() ;
        while(r != null) 
        {
            System.out.println(r);
            r = br.readLine() ;
        }
        br.close();
        
    }
}