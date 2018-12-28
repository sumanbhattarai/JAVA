class outer
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

  void showY()
  {
    System.out.println(y) ;
  }

}
