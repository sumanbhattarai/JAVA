class Box
{
  double height , width , depth ;
  void volume()
  {
    System.out.println("Volume is : " + height*width*depth) ;
  }

  public static void main(String[] args) {
    Box b1 = new Box() ;
    Box b2 = new Box();
    b2.width = 10.0 ;
    b2.height = 40.0 ;
    b2.depth = 20.0 ;
    b1.volume();
    b2.volume();


 }
}
