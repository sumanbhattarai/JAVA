import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class Quens3b {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
            String line = br.readLine();

            while (line != null) {
                if (line.contains("Kathmandu")) {
                    System.out.println(line);
                }
                line = br.readLine();
            }

            br.close();
        } catch (IOException exc) {
            System.out.println("Error While opening file.");
        }
    }
}

