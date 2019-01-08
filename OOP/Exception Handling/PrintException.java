class PrintException
{
    public static void main(String[] args) 
    {
        int d , a ;
        try 
        {
            d = 0 ;
            a = 42/d ;
            System.out.println("This will not be displayed.");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Can't divide by 0.");
        }
        System.out.println("After Catch");
        
    }
}