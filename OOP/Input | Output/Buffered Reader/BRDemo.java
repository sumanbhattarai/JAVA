
import java.io.* ;

class BRDemo
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader ( new FileReader("gces.txt")) ;
        int i = br.read() ;
        while(i!= -1) 
        {
            System.out.println((char) i);
            i = br.read();
        }
        br.close();
        
    }
}