

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