
// If we declare arrays more than its size then it shows run time error i.e. ArrayOutOfBoundsException.
class Array
{
   
    public static void main(String[] args) {
        int x[] = new int[3];
        x[0] = 2 ;
        x[1] = 3 ;
        x[2] = 10 ;
        for(int i=0 ; i<3 ; i++)
        {
            System.out.println(x[i]);
        }
        
    }
    
}