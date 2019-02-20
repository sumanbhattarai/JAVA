// We can declare static methods with same signature in subclass, but it is not considered overriding as there won’t be any run-time polymorphism.

// If a derived class defines a static method with same signature as a static method in base class, the method in the derived class hides the method in the base class. 

class Base
{
    public static void disp()
    {
        System.out.println("In Base");
    }
}

class Derived extends Base 
{
    // Here overriding doesnot occur.
    public static void disp()
    {
        System.out.println("In Derived");
    }
}

class StaticMethodOverriding
{
    public static void main(String[] args) {
        Base obj =  new Derived() ;
        obj.disp();
    }
}