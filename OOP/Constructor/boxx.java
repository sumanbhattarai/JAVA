class boxx
{
  double height , width , length ;

//default constructor
  boxx()
  {
    height = 3.0 ;
    width = 9.0 ;
    length = 1.0 ;
  }


//parameterized constructor
  boxx(double height , double width , double length )
  {
    this.height = height ;
    this.width = width ;
    this.length = length ;
  }

  //void initiateVariable()
  //{
  //  height = 2.0 ;
  //    width = 3.0 ;
  //  length = 4.0 ;
  //}

  void volume()
  {
    System.out.println(height*width*length) ;
  }
}
