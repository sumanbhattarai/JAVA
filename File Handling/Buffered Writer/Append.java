

import java.io.*;
class Append
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("gces.txt" , true));

        String line = br.readLine() ;
        while(line!=null)
        {
            bw.newLine();
            bw.write(line);
            line = br.readLine();
        }
        br.close();
        bw.flush();
        bw.close();
        
    }
}