
class A
{
    void msg()
    {
        System.out.println("Inside A");
    }

}

class B extends A
{
    void msg()
    {
        System.out.println("Inside B");
    }

}

class RunTime
{
    public static void main(String[] args) {
        A obj = new B();
        obj.msg();
    }
}