
abstract class Book
{
     String name ;
     String author ;
     long totalpage ;
     String publisher ;

    public abstract String getBookType();


}

class Novel extends Book
{
    Novel( String name , String author , long totalpage , String publisher)
    {
        this.name = name ;
        this.author = author ;
        this.totalpage = totalpage ;
        this.publisher = publisher ;

    }

    public String getBookType()
    {
        return "Novel" ;
    }


}

class Magazine extends Book
{
    
    Magazine( String name , String author , long totalpage , String publisher)
    {
        this.name = name ;
        this.author = author ;
        this.totalpage = totalpage ;
        this.publisher = publisher ;

    }

    public String getBookType()
    {
        return "Magazine" ;
    }

}


class Solution
{
    public static void main(String[] args) {
        Novel obj = new Novel("MunaMudan" , "LaxmiPrsd" , 1000 , "Readmoew") ;
        obj.getBookType();
    }
}