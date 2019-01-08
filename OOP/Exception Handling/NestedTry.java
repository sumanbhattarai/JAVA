

/*

The try statement can be nested i.e. a try statement can be inside tha block of another try . Each time a
try stamement is entered, the context of that exception is pushed on the stack. If an inner try statement 
doesn't have a catch handler for a particular exception , the stack is unwound and the next try statements 
catch handlers are inspected for a match. This continues until one of the catch statement succeeds, or until 
all of the nested try statements are exhausted. If no catch satements matches, then the java runtime system 
will handle the exception.

*/
class NestedTry
{
    public static void main(String[] args) 
    {
        System.out.println(args[1]);
        try
        {
            int a = args.length ;
            int b = 42/a ;
            System.out.println("a="+a);
            try
            {
                //nested try block
                if(a==1)
                {
                    a =a/(a-a) ;
                }
                //System.out.println(args[89]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array out of Bound.  " + e);

            }
            
            

        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by 0 .  " + e);
        }
    }
}




