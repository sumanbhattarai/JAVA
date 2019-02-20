
# Interface

- Using the keyword ``` interface ``` , you can fully abstract a class interface from its implementation .

- That is , using interface , you can specify what a class must do , but not how it does it .

- They are syntactically similar to classes , but they lack instance variables and their methods are declared without any body.

- Interfaces are designed to support dynamic method resolution at run time.



- Designing a  Interfaces :


      access_modifier interface name
      {
        return_type method.name1(parameter list) ; //public abstract method
        .
        .
        .
        type final variable_name1= value ; // final/static
      }



- But beginning with JDK 8 , it is possible to add  default implementation to an interface method , Thus it is now possible for interface to specify some behavior .

# Implementing interface

    class classname [extends superclass][implements interface1 ,interface2 ......]
    {
      ///////
    }

  * When you implement an interface method , it must be declared as public .


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