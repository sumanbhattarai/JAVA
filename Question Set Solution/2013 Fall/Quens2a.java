
class Quens2a
{
    static void sum(int num[])
    {
        int result = 0 ;
        for(int i = 0 ; i < num.length ; i++)
        {
            if(num[i]%2 == 0)
            {
                result = result + num[i] ;
            }
        }

        System.out.println(result);
    }
    
    public static void main(String[] args) {

       
        int arr[] = {2,4,6,1,16,78,5,3,12,13} ;
        sum(arr);
    }
}