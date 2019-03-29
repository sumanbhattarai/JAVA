class All
{

    static void throw1() throws IllegalAccessException
    {
        System.out.println("Inside throw1");
        throw new IllegalAccessException();

        
        
    }
    public static void main(String[] args) 
    {
        try
        {
        throw1();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("Caught Illegal Exception");
        }

        finally
        {

        System.out.println("Have a good day !");
        }
        

        
    }
}