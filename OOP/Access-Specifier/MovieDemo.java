class Movie
{
    private String name , producer ;
    
    public void Setname(String name , String producer)
    {
      this.name = name ;
      this.producer = producer ;
    }
    public void display()
    {
      System.out.println("Movie name is : " + name + "  and producer name is :  " + producer);
    }

   

}

class MovieDemo
{
  public static void main(String[] args) {
    Movie movie = new Movie() ;

   // movie.name= "3 idiots" ;  //It doesn't work because tha name data in class Movie.java is private.

   movie.display(); // It will give null .
  
   movie.Setname("ABC" , "XYZ"); // It will set the movies name.
   movie.display(); 



  }
}