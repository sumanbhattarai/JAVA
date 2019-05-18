class Outer
{
  int outerX = 100 ;
  public void test()
  {
    Inner inner = new Inner() ;
    inner.display();

  }
  class Inner
  {
    
    public void display()
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
