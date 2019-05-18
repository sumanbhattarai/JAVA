import javafx.css.StyleableStringProperty;

interface Web
{
    void frontend();
    void backend();
}


class Suman implements Web 
{
    public void frontend()
    {
        System.out.println("FrontEnd Done by Suman.");
    }
    public void backend()
    {
        System.out.println("BackEnd Done by Suman.");
    }
    
}

class Ram implements Web{
    public void frontend()
    {
        System.out.println("FronEnd done by ram.");
    }
    public void backend()
    {
        System.out.println("backend done by ram.");
    }
}


class InterfaceDemo 
{
    public static void main(String[] args) {
        Web obj = new Suman();
        obj.frontend();
        obj.backend();

        Web obj1 = new Ram();
        obj1.frontend();
        obj1.backend();

        
    }
}