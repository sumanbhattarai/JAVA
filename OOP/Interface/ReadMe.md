- Using the keyword " interface" , you can fully abstract a class interface from its implementation .

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

#Implementing interface

    class classname [extends superclass][implements interface1 ,interface2 ......]
    {
      ///////
    }

  * When you implement an interface method , it must be declared as public .
