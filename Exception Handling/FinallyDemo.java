class FinallyDemo
{

    
    public static void main(String[] args) 
    {
        int b = 1;
        try
        {
            System.out.println("Inside Try");
            int a = 2 / b ;
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("Inside Catch");
           
        }
        finally
        {

        System.out.println("Have a good day !");
        }
    }
    
       

}