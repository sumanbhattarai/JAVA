
class Employee
{
    int id ;
    String name ;
    String post ;
    long salary ;

    Employee( int id , String name , String post , long  salary )
    {
        this.id = id ;
        this.name = name ;
        this.post = post ;
        this.salary = salary ;
    }

    public String toString()
    {
        return "Id is : " + id + " , name is : " + name + " , post is : " + post + " and salary is : " + salary ;
    }
}

class Solution
{
    public static void main(String[] args) {
        Employee obj = new Employee( 1 , "Suman" , "Cyber Security Engineer" , 20000) ;
        System.out.println(obj);
    }
}