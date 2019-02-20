
import java.io.*;

class CreatingFile
{
    public static void main(String[] args) 
    {
        try
        {
        File f = new File("/Users/macbookpro/Desktop/JAVA/OOP/Input | Output/suman.txt") ;
        if(f.createNewFile())
        {
            System.out.println("File Created.");
        }
        else
        {
            System.out.println("File not Created");
        }
    }
    catch(IOException e)
    {
        System.out.println("Error Occured");
    }

        
    }
}