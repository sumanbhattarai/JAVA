import java.io.* ;


class DesktopList
{
    public static void main(String[] args) 
    {
        File file = new File("/Users/macbookpro/Desktop") ;
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }
        
        
    }
}