
# Abstract Class

- There are situations in which you will want to define a superclass that declares the structure of a given abstraction without providing a complete implementation of every method .

- That is ,sometimes you will want to create a superclass that only defines a generalized form that will be shared by all its sub classes , leaving it to each subclass to fill in the detail .

- One way this situations can occur is when a super class is unable to create a meaningful implementation for a method.

- When you want some way to ensure that a subclass does , indeed , override all necessary methods. JAVA's solutions is the abstract method .

> Syntax of abstract method :

``` abstract type name(parameter list) ; ```

> Eg:

``` abstract void sum(int a , int b) ;```

- This abstract methods are sometimes referred to as sub classes responsibility because they have no implementation specified in the superclass . Thus subclass must override them .

- Any class that contains one or more abstract method must also be declared abstract .
  
> Eg:
         
```abstract class A ```

 {

 // codes

 }

- Abstract class cannot be directly instantiated with new operator i.e. no object .

- Cannot declare abstract constructors or abstract static method .

- Any sub class of an abstract class must either implement all of the abstract methods or be declared abstract itself .


# DIfference between Interface and Abstract

|``` Abstract class```|	```Interface```|
|---------------------|----------------|
| Abstract class can have abstract and non-abstract methods.|	Interface can have only abstract methods. Since Java 8, it can have default and static methods also.|
| Abstract class doesn't support multiple inheritance.|	Interface supports multiple inheritance.|
| Abstract class can have final, non-final, static and non-static variables.|	Interface has only static and final variables.|
| Abstract class can provide the implementation of interface.|	Interface can't provide the implementation of abstract class.|
| The ```abstract ``` keyword is used to declare abstract class.| The ```interface``` keyword is used to declare interface.|
| An abstract class can extend another Java class and implement multiple Java interfaces.|	An interface can extend another Java interface only.|
| An abstract class can be extended using keyword ```extends```.|	An interface class can be implemented using keyword ```implements```.|
| A Java abstract class can have class members like private, protected, etc.|	Members of a Java interface are public by default. |