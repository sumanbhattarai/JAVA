
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

| 	| ```private``` | ```default``` | ```protected``` | ```public``` |
|---|---------|---------|-----------|--------|
| ```Within Class``` | Yes | Yes | Yes | Yes |
| ```Within Package``` | No | Yes | Yes | Yes |
| ```Outside Package by subclass only``` |	No | No | Yes | Yes |
| ```Oustide Package``` | No | No | No | Yes |



# Private Access Modifier

- If a method or variable is marked as private, then only code inside the same class can access the variable, or call the method. Code inside subclasses cannot access the variable or method, nor can code from any external class.

- Classes cannot be marked with the private access modifier. Marking a class with the private access modifier would mean that no other class could access it, which means that you could not really use the class at all. Therefore the private access modifier is not allowed for classes.

> Example : 

    class Clock 
    {
        private long time = 0;
    }

>  The member variable time has been marked as private. That means, that the member variable time inside the Clock class cannot be accessed from code outside the Clock class. 


# Default Access Modifier

- The default Java access modifier is declared by not writing any access modifier at all. The default access modifier means that code inside the class itself as well as code inside classes in the same package as this class, can access the class, field, constructor or method which the default access modifier is assigned to. Therefore, the default access modifier is also sometimes referred to as the package access modifier.

> Example :

        public class Clock {
                long time = 0;
            }


        public class ClockReader {
            Clock clock = new Clock() ;

            public long readClock {
                    return clock.time;
                }
            }

- The time field in the Clock class has no access modifier, which means that it is implicitly assigned the default / package access modifier. Therefore, the ClockReader class can read the time member variable of the Clock object, provided that ClockReader and Clock are located in the same Java package.


# Protected Access Modifier

- The protected access modifier provides the same access as the default access modifier, with the addition that subclasses can access protected methods and member variables (fields) of the superclass. This is true even if the subclass is not located in the same package as the superclass.

> Example : 

    public class Clock {
        protected long time = 0;    // time in milliseconds
    }


    public class SmartClock() extends Clock{

        public long getTimeInSeconds() {
            return this.time / 1000;
        }
    }

- In the above example the subclass SmartClock has a method called getTimeInSeconds() which accesses the time variable of the superclass Clock. This is possible even if Clock and SmartClock are not located in the same package, because the time field is marked with the protected Java access modifier. 

# Public Access Modifier

- The Java access modifier public means that all code can access the class, field, constructor or method, regardless of where the accessing code is located. The accessing code can be in a different class and different package.

> Example : 

    public class Clock {
        public long time = 0;
    }


    public class ClockReader {
        Clock clock = new Clock();

        public long readClock{
            return clock.time;
        }
    }

- The time field in the Clock class is marked with the public Java access modifier. Therefore, the ClockReader class can access the time field in the Clock no matter what package the ClockReader is located in. 