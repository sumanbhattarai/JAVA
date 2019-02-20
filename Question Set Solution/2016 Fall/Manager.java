

class Human
{
   protected String name ;
   protected int age ;

   Human(String name , int age )
   {
       this.name = name ;
       this.age = age ;

   }
}

class Employee extends Human
{
    double salary ;

    Employee(String name , int age , double salary )
    {
        super(name , age);
        this.salary = salary ;

    }

    void showdata()
    {
        System.out.println("Name is : " + name );
        System.out.println("Age is : " + age );
        System.out.println("Salary is : " + salary );
    }
}

class Manager extends Employee
{
    Manager(String name , int age , double salary )
    {
        super(name, age, salary);

    }
    void showdata()
    {
        System.out.println("Name is : " + name );
        System.out.println("Age is : " + age );
        System.out.println("Salary is : " + salary );

    }

    public static void main(String[] args) {
        Manager obj = new Manager("Suman" , 19 , 2000.0) ;
        obj.showdata();
    }
}