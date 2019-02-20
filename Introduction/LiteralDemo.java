class LiteralDemo
{
  public static void main(String[] args)
  {
    int deciamlLiteral = 10 ;
    int octalLiteral = 010 ; //put 0 at front for octal literal
    int hexliteral = 0x10; //put 0x for hexadeciaml
    int binaryLiteral = 0b0110 ; //put 0b for binary , b is not case sensitive
    boolean boolLiteral = true ; // boolean literal must be true or false .. all in smallcase.
    char charLiteral = 'S' ; //we can give value from 0 to 65535 , we can also give value in respective hexadecimal instead of decimal
    float floatLiteral = 94.8F ; //Put F at last for floating literals
    double doubleliteral = 123.456 ; //d is not necessary , we cannot give hexadecimal in float .
    // double doubleliteral = 0x123.456 is wrong.
    // double doubleliteral = 0123.456 is correct.
    // double doubleliteral = 0x123 is correct .
    String name = "Suman Bhattarai" ;
    System.out.println(name) ;
    boolean x = true ;
    if(x)
    {
      System.out.println("Correct") ;
    }

    /*while(true)
    {
      System.out.println("Whileloop");
    }  */ // it will not work because the down statement is unreachable.

    /*while(x)
    {
      System.out.println("Whileloop");
    } */ // it will work because the compiler doesnt place tha variable value during compiling.


    /* final boolean y = true ;
    while(y)
    {
      System.out.println("final");
    } */ //It will not work because it place the value of y as constant.



    System.out.println("Decimal : " + deciamlLiteral + "Octal : "+ octalLiteral + "  Hexa : "+hexliteral + "  Binary : "+binaryLiteral + "  Boolean : "+boolLiteral + "  Character  : "+charLiteral + "  Float : " + floatLiteral + "  Double : "+doubleliteral);
  }

}
