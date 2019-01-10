import java.io.* ;


class CountFile
{
    public static void main(String[] args) 
    {
        int count = 0;
        File file = new File("/Users/macbookpro/Desktop") ;
        File[] files = file.listFiles();
        for(File f: files)
        {
            count++;
        }
        System.out.println(count);
        
        
    }
}