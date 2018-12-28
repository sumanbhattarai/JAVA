- There are situations in which you will want to define a superclass that declares the structure of a given abstraction without providing a complete implementation of every method .

- That is ,sometimes you will want to create a superclass that only defines a generalized form that will be shared by all its sub classes , leaving it to each subclass to fill in the detail .

- One way this situations can occur is when a super class is unable to create a meaningful implementation for a method.

- When you want some way to ensure that a subclass does , indeed , override all necessary methods. JAVA's solutions is the abstract method .

      Syntax of abstract method :
              abstract type name(parameter list) ;

      Eg:
              abstract void sum(int a , int b) ;

- This abstract methods are sometimes referred to as sub classes responsibility because they have no implementation specified in the superclass . Thus subclass must override them .

- Any class that contains one or more abstract method must also be declared abstract .
      Eg:
         abstract class A
         {
           ....
         }

- Abstract class cannot be directly instantiated with new operator i.e. no object .

- Cannot declare abstract constructors or abstract static method .

- Any sub class of an abstract class must either implement all of the abstract methods .
    OR be declared abstract itself .
