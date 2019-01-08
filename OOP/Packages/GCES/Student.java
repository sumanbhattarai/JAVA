
package GCES ;
public class Student
{
    String name ;
    int rollNo ;
    
    public Student( String n , int r)
    {
        name = n ;
        rollNo = r ;

    }

    public void displayDetails()
    {
        System.out.println("Name is : " +  name );
        System.out.println("Roll is : " + rollNo );

    }
}