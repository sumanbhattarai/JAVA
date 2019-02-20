
abstract class website
{
    abstract void ui();
    abstract void frontend();
    abstract void backend();
}

abstract class Samir extends website
{
    void ui()
    {
        System.out.println("UI Part Done");
    }
}

abstract class Suman extends Samir
{
    void frontend()
    {
        System.out.println("FrondEnd Part Done");
    }
}

 class Arjun extends Suman
{
    void backend()
    {
        System.err.println("Backend Part Done.");

    }
}

class AbstractDemo
{
    public static void main(String[] args) {
        Arjun obj = new Arjun() ;
        obj.ui();
        obj.frontend();
        obj.backend();
        
    }
}