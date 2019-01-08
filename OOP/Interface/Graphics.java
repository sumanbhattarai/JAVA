interface Graphics
{
    void draw(); // By default, it is public.
    default void init()
    {
        System.out.println("Init Graphics");
    }
}