Types of variable 

1) Based on tyoe of value
            - Primitive variable
                    int x = 10 ;

            - Reference variable
                    Student s = new Student() ;

2) Based on position of declaration or behaviour 

    a) Instance variable

                    class Student
                    {
                        String name;
                        int rollno ;
                        ...
                    }

    - For every object separate copy of name and roll no is created. This type of variable is instance variables.
    - Instance variable are declare within a class & outside of method / block / constructor .
    - Are created at the time of object creation and destroy when objects is destroyed .
    - They are also known as attribute.




    b) Static variable

    - If the value of variable is not varient frrom object to object , we create static variable.

                    class Student
                    {
                        Static String name ;
                        .....
                    }

    - Are declared inside class but outside of any method / block / constructor .

    - Scope :
          Created at the time of class loading and destroyed at he time of class unloading.



    c) Local Variable

                [Method]
                void main()
                {
                    int x = 10 ;
                }

                [Block]
        for(int i = 0 ; i<5 ; i++)
                {
                    S.o.p(i) ;
                
                [Constructor]
                Test()
                {
                    int x = 10 ;
                }

   Note: isnot available outside for loop.

- Also callled local, temporary , stack ,automatic .

- Are stored in stack memory .

- Scope : 
    - Destroy after finishing method/block/constructor
    - For every thread separate local variable is created.
    - For local variable , JVM won't provide default value.
    So we must provide value explicity before using it.
    - For local variable , the only applicable modifier is final.
            

