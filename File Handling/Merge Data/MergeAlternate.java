
import java.io.* ;

class MergeAlternate
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter pw = new PrintWriter("fileNew.txt") ;
        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt")) ;
        BufferedReader br2 = new BufferedReader(new FileReader("file2.txt")) ;
        String Line1 = br1.readLine() ;
        String Line2 = br2.readLine() ;
        while(Line1!=null || Line2!=null)
        {
            pw.println(Line1) ;
            pw.println(Line2) ;
            Line1 = br1.readLine() ;
            Line2 = br2.readLine() ;
        }
        pw.flush();
        pw.close();
        

        
    }
}