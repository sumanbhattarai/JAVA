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

    public static void main(String[] args) {
      Movie movie = new Movie() ;
      // movie.name= "3 idiots" ;  //It doesn't work because tha name data in class Movie.java is private.
      movie.Setname("ABC" , "XYZ");
      movie.display();
  
  
    }

}
