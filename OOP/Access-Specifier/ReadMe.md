
# Access Modifiers

A Java access modifier specifies which classes can access a given class and its fields, constructors and methods. Access modifiers can be specified separately for a class, its constructors, fields and methods.  Classes, fields, constructors and methods can have one of four different Java access modifiers:

- private
- default (package)
- protected
- public

| 	| ```private``` | ```default``` | ```protected``` | ```public``` |
|---|---------|---------|-----------|--------|
| ```Class``` | No | Yes | No | Yes |
| ```Nested Class``` | Yes	| Yes | Yes | Yes |
| ```Constructor``` |	Yes | Yes | Yes | Yes |
| ```Method``` | Yes | Yes | Yes | Yes |
| ```Field``` | Yes | Yes | Yes | Yes |


# Private Access Modifier

If a method or variable is marked as private, then only code inside the same class can access the variable, or call the method. Code inside subclasses cannot access the variable or method, nor can code from any external class.

Classes cannot be marked with the private access modifier. Marking a class with the private access modifier would mean that no other class could access it, which means that you could not really use the class at all. Therefore the private access modifier is not allowed for classes.

> Example : 

    class Clock 
    {
        private long time = 0;
    }

>  The member variable time has been marked as private. That means, that the member variable time inside the Clock class cannot be accessed from code outside the Clock class. 
