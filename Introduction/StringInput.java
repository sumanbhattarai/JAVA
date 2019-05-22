import java.util.Scanner;

class StringInput
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in) ;
        String name = obj.next(); // use obj.nextLine() for full name. 
        System.out.println(name);
    }
}