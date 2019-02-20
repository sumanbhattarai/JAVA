

public class WrapperClassDemo
{
    public static void main(String[] args) {
        
        // Primitive to Wrapper
        int a = 10 ;
        Integer i = Integer.valueOf(a); //Converting int into Integer
        System.out.println(i);

        // Wrapper to Primitive
        Integer x =new Integer(3);    
        int num = x.intValue(); //converting Integer to int  
        System.out.println(num);
    }
}