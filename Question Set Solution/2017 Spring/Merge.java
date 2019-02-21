import java.io.* ;

class Merge
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader( new FileReader("abc.txt"));
        BufferedWriter bw = new BufferedWriter( new FileWriter("xyz.txt"));

        String data  = br.readLine() ;

        while(data!= null)
        {
            bw.write(data);
            bw.newLine();
            data = br.readLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}