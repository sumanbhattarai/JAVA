class MovieDemo
{
  public static void main(String[] args) {
    Movie movie = new Movie() ;
    // movie.name= "3 idiots" ;  //It doesn't work because tha name data in class Movie.java is private.
    movie.Setname("ABC" , "XYZ");
    movie.display();


  }
}
