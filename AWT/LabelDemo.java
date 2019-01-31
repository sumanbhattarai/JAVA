
import java.awt.*;
import java.applet.*;

public class LabelDemo extends Applet {
    
    public void init()
    {
        Label name = new Label ( "Name : " , Label.CENTER) ;
        Label address = new Label ( "Address : " , Label.CENTER) ;
        Label roll = new Label ( "Roll No. : "  , Label.CENTER) ;
        add(name) ;
        add(address);
        add(roll);
        System.out.println(Label.CENTER);
       


        

    }


}