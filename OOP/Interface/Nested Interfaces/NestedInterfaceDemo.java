
interface Phone
{
    void call();
    interface Game
    {
        void pubg();
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
    }
}