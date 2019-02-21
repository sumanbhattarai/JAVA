
class Outer
{
    static int a = 10 ;

    // Static Inner Class
    static class Inner
    {
         void msg()
        {
            System.out.println("Number is ; " + a);
        }
    }
}

class StaticInner
{
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner() ;
        obj.msg();
    }
}