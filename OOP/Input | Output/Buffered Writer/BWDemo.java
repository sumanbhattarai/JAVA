import java.io.* ;

class BWDemo
{
    public static void main(String[] args)  throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter("gces.txt")) ;
        bw.write("gces");
        bw.newLine();
        bw.write("2019");
        bw.newLine();

        bw.write("Happy New Year") ;
        bw.flush();
        bw.close();
        
    }
}