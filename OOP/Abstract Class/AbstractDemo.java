
abstract class Website
{
    public abstract void ui();
    public abstract void frontend();
    public abstract void backend();
}

abstract class Samir extends Website
{
    public void ui()
    {
        System.out.println("UI Part Done");
    }
}

abstract class Suman extends Samir
{
    public void frontend()
    {
        System.out.println("FrondEnd Part Done");
    }
}

 class Arjun extends Suman
{
    public void backend()
    {
        System.out.println("Backend Part Done.");

    }
}

class AbstractDemo
{
    public static void main(String[] args) {
        Website obj = new Arjun() ;
        obj.ui();
        obj.frontend();
        obj.backend();
        
    }
}