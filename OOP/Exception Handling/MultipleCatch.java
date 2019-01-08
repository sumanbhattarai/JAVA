class MultipleCatch
{
    public static void main(String[] args) 
    {
        try
        {
            // int[] arr = new int[2];
            // Arr[56] = 45 ;
            int[] arr = new int[2];
            arr[56] = 45 ;

        }

        // catch(ArithmeticException e)
        // {
        //     System.out.println("Can't divide by zero.");
        // }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("Array out of bound");
        }
        System.out.println("After catch");
        
        
    }
}