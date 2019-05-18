
class A
{
  int i = 100 ;
}

class B extends A
{
  int i = 200 ;

  void msg()
  {
    System.out.println("Base class i is : " + super.i);
    System.out.println("Derived class i is : " + i);
  }
}

class UseSuper
{
  public static void main(String[] args) {
    B obj = new B();
    obj.msg();
  }
}