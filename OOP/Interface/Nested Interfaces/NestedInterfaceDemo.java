
interface Phone
{
    void call();
    interface Game
    {
        void pubg();
    } 
    
}

class Nokia implements Phone
{
    public void call()
    {
        System.out.println("Nokia Call");
    }
    
}

class Iphone implements Phone.Game
{
    public void pubg()
    {
        System.out.println("Played Pubg.");
    }

}

class NestedInterfaceDemo
{
    public static void main(String[] args) {
        Iphone obj = new Iphone();
        obj.pubg();
        Nokia obj1 = new Nokia();
        obj1.call();
       
    }
}