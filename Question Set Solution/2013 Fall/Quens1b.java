
class Quens1b
{
    public static void main(String[] args) {
       for(int i = 1 ; i<=4 ; i++) // for 4th interation
       {
           for(int j = 0 ; j<i ; j++)
           {
               System.out.print((i+j)%2) ;
           }

           System.out.println();

       }
    }
}