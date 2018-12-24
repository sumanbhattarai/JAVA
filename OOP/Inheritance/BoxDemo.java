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
