class Animal
{
  void eat()
  {
    System.out.println("I eat grass.") ;
  }
}

class Human extends Animal
{

  void eat()
  {
    super.eat();
    System.out.println("I eat meat.") ;
  }
}


class AnimalDemo
{
  public static void main(String[] args)
  {
    Human obj = new Human() ;
    obj.eat();

  }
}
