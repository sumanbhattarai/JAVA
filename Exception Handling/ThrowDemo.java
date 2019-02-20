class ThrowDemo
{
    public static void main(String[] args) 
    {
        System.out.println("Example of Throw Keyword");
        try
        {
            throw new ArithmeticException("Divide By Zero explicitly");

        } 
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Get Message =  " + e.getMessage());

        }

        System.out.println("Ending");
        
        // int a = 5 ;
        // int c = a / 0 ;



        
    }
}