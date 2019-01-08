interface Shape
{
    void area(); //public is default here.
    double length = 5 ; // final is default here. So variable must be intialized.

    default void init()
    {
        System.out.println("Init Shape");
    }
}