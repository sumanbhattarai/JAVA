

interface A
{
    void method1();
    void method2();
}

interface B extends A
{
    void method3();

}

class MyClass implements B
{
    public void method1()
    {
        System.out.println("method1");
    }
    public void method2()
    {
        System.out.println("method2");
    }
    public void method3()
    {
        System.out.println("method3");
    }
    
}

class NI
{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}