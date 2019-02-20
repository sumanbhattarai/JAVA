
# Inheritance

- Uses "extends" keyword .

- Being a Super class for a subclass doesn't mean that the superclass cannot be used by itself .

- Further , a subclass can be a superclass for another subclass .


> General Form : 

                 class subclass extends superclass.name
                 {

                 }

- Java doesn't support multiple inheritance .

- Subclass cannot access private member of the superclass .

  

# Using Super()

- Whenever a sub class needs to refer to its immediate superclass , it can do so by use of the keyword super.
  


- ``` super()``` has two general forms :
  
  -  The first calls the superclass constructor .
   
  - IT is used to access a member of the superclass that has been hidden by a member of a subclass .

- ```super()``` must always be the first statement executed inside a subclass constructor .
