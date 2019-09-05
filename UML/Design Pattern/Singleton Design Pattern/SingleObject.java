
public class SingleObject
{
    // Create an object of SingleObject
    private static SingleObject singleObject = new SingleObject();

    private SingleObject()
    {

    }

    // to get an object
    public static SingleObject getInstance()
    {
        return singleObject ;
    }

    public void display()
    {
        System.out.println("Displaying");
    }
}