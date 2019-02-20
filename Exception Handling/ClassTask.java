class ClassTask
{
    public static void main(String[] args) 
    {
        
        try{

        
        int no = args.length ;
        if(no<=2)
        {
            throw new ArithmeticException("Error");
        }
    }
        catch(ArithmeticException e)
        {
            System.out.println("Get Message =  " + e.getMessage());

        }

        System.out.println("GoodBye");
        
    }
}