
interface A
{
    void msg();
}

interface B
{
    void show();
}

class Demo implements A , B 
{
    public void msg()
    {
        System.out.println("A");
    }
    public void show()
    {
        System.out.println("B");
    }
}

class MultipleInheritance
{
    public static void main(String[] args) 
    {
        Demo obj = new Demo();
        obj.msg();
        obj.show();
        
    }
}