
import java.io.* ;

class FileWriterAppendDemo
{
    public static void main(String[] args)  throws IOException
    {
        FileWriter fw = new FileWriter ("abc.txt", true) ;
        fw.write("Suman");
        fw.flush();
        fw.close();
        
    }
}