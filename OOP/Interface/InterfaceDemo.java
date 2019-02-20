

interface Web
{
    void frontend();
    void backend();
}


class Suman implements Web 
{
    public void frontend()
    {
        System.out.println("FrontEnd Done.");
    }
    public void backend()
    {
        System.out.println("BackEnd Done.");
    }
    
}



class InterfaceDemo 
{
    public static void main(String[] args) {
        Web obj = new Suman();
        obj.frontend();
        obj.backend();
        
    }
}