
import java.io.* ;
class Quens3b
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter br = new BufferedWriter(new FileWriter("abc.txt")) ;
        br.write("Hello World");
        br.flush();
        br.close();
        
    }
}