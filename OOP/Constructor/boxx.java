class Boxx
{
  double height , width , length ;

//default constructor
  Boxx()
  {
    height = 3.0 ;
    width = 9.0 ;
    length = 1.0 ;
  }


//parameterized constructors
  Boxx(double height , double width , double length )
  {
    this.height = height ;
    this.width = width ;
    this.length = length ;
  }


  void volume()
  {
    System.out.println(height*width*length) ;
  }

  public static void main(String[] args)
  {
    Boxx box1 = new Boxx(10.0 , 2.0 , 10.0) ; // It will call parameterized constructor .
    Boxx box2 = new Boxx() ; // It will calll default constructor
    
    box1.volume() ;
    box2.volume();


  }
}
