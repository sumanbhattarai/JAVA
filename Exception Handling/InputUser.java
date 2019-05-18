import java.util.Scanner;

class InputUser
{
    public static void main(String[] args) {
        try
        {
        Scanner obj  = new Scanner(System.in) ;
        int a = obj.nextInt() ;
        System.out.println("You Entered : " + a );

        } catch(Exception e)
        {
            System.out.println("Only Integers Allowed");
        }
    }
}