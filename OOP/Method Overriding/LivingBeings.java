class Animal
{
  void eat() // It will be overridden in sub class.
  {
    System.out.println("I eat grass.") ;
  }
}

class Human extends Animal
{

  void eat()
  {
    
    System.out.println("I eat meat.") ;
  }
}


class LivingBeings
{
  public static void main(String[] args)
  {
    Human obj = new Human() ;
    obj.eat();  

  }
}

// Ouput :-
// I eat grass .
// I eat meat.
