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
