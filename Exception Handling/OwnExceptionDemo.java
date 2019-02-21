
class InvalidAge extends Exception
{
    int age ;
    InvalidAge(int age)
    {
        this.age = age ;
    }

    public String toString()
    {
        return "People of age " + age + " are incapable to vote." ;
    }

}


class OwnExceptionDemo
{
    static void ageCheck( int age) throws InvalidAge
    {
        if(age<18)
        {
            throw new InvalidAge(age) ;
        }
        else
        {
            System.out.println("You can Vote");
        }

    }

    public static void main(String[] args) {
        try
        {
            ageCheck(16);
        }
        catch(InvalidAge e )
        {
            System.out.println(" Message is : " + e );
        }
    }
}