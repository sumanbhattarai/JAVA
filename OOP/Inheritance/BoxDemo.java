
class Box
{
  double width ;
  double height ;
  double depth ;

  Box(Box obj)
  {
    width = obj.width ;
    height = obj.height ;
    depth = obj.depth ;
  }

  Box(double w , double h , double d)
  {
    width = w ;
    height = h ;
    depth = d ;

  }

  Box()
  {
    width = 1 ;
    height = 1 ;
    depth = 1 ;
  }

  Box(double len)
  {
    width = height = depth = len ;

  }

  double volume()
  {
    return width*height*depth ;
  }
}

class BoxWeight extends Box
{
  double weight ;

  BoxWeight(double w , double h , double d , double we)
  {
    // width = w ;
    // height = h ;
    // depth = d ;
    super(w,h,d) ;
    weight = we ;
  }
}


class BoxDemo
{
  public static void main(String[] args)
  {
    BoxWeight boxWeight1 = new BoxWeight(10,20,15,32) ;
    BoxWeight boxWeight2 = new BoxWeight(2,3,4,5) ;

    double vol ;
    vol = boxWeight1.volume();
    System.out.println("Volume of box is : " + vol + ".") ;
    System.out.println("Weight of boxWeight1 is : " + boxWeight1.weight + ".") ;

    vol = boxWeight2.volume();
    System.out.println("Volume of box is : " + vol + ".") ;
    System.out.println("Weight of boxWeight2 is : " + boxWeight2.weight + ".") ;




  }
}
