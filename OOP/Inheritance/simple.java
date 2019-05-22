
class A
{
    void disp()
    {
        System.out.println("I am A.");
    }
}

class B extends A 
{
    void show()
    {
        System.out.println("I am B.");
    }
}

class simple
{
    public static void main(String[] args) {
        B obj = new B ();
        obj.disp();
        obj.show();
    }
}