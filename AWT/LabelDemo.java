
import java.awt.*;
import java.applet.*;

/*  <applet code = "LabelDemo" width = "1000" height = "1000"></applet> */

public class LabelDemo extends Applet {
    
    public void init()
    {
        Label name = new Label ( "Name : " , Label.CENTER) ;
        TextArea ta = new TextArea(2 , 40);
        add(name);
        add(ta);
    }


}