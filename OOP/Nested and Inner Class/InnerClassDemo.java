class Outer
{
  int outerX = 100 ;
  void test()
  {
    Inner inner = new Inner() ;
    inner.display();

  }
  class Inner
  {
    int y = 10 ;
    void display()
    {
      System.out.println("Display :  outerX = " + outerX) ;
    }
  }

 

}


class InnerClassDemo
{
  public static void main(String[] args)
  {
    Outer outer = new Outer();
    outer.test();

  }
}
