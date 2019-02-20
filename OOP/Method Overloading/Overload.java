

class Example
{
     int sum(int x , int y)
    {
        int result = x + y ;
        return result ; 
    }

     int sum (int x , int y , int z)
    {
        int result = x + y + z ;
        return result ;
    }
}

class Overload
{
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println(obj.sum(2,3));
        System.out.println(obj.sum(2,3,4));

        
    }
}