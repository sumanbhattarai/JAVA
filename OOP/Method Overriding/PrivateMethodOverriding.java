

// Can private methods be override ?
// No , private methods cannnot be overridden since they are not visibile outside the class .

class Base {

    public void msg()
    {
          System.out.println("In base");         
    }
    public void disp() 
    {
        msg();
    }
}

class Derived extends Base {

    public void msg(){   
          System.out.println("In Derived"); 
    }
}

class PrivateMethodOverriding {
    public static void main(String [] args) {
          Derived D = new Derived();
          D.disp(); 
    }
}

// It will give output : In base .
// Thus , it shows that the private methods cannot be overridden .