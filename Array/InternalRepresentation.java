import java.lang.reflect.Array;

class InternalRepresentation
{
  public static void main(String [] args)
  {
    int[] array = new int[2];
    int[][] twoDArray = new int[3][4] ;
    int integer ;
    double itsDouble ;
    short itsShort ;
    byte itsByte ;
    boolean itsBoolean ;
    System.out.println(array.getClass().getName()) ;
    System.out.println(twoDArray.getClass().getName()) ;

    // All these will produce error. 
    
  //  System.out.println(integer.getClass().getName) ;
  //  System.out.println(itsDouble.getClass().getName) ;
  //  System.out.println(itsShort.getClass().getName) ;
  //  System.out.println(itsByte.getClass().getName) ;
   // System.out.println(itsBoolean.getClass().getName) ;

  }
}
