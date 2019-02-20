
import java.io.* ;


class MergeDesktopFile
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter pw = new PrintWriter("/Users/macbookpro/Desktop/Output.txt") ;
        File file = new File("/Users/macbookpro/Desktop") ;
        File[] files = file.listFiles();
        for(File f: files){
            
            if (f.getName().endsWith(".txt")) {
                
                String location = "/Users/macbookpro/Desktop/" + f.getName() ;
                BufferedReader br = new BufferedReader(new FileReader(location)) ;
                String line = br.readLine() ;
                while(line!= null)
                {
                    pw.println(line) ;
                    line = br.readLine() ;

                }
              }


        }

        pw.flush();
        pw.close();
        
        
    }
}