
import java.applet.Applet ;
import java.awt.* ;



public class RectangleAndLines extends Applet
{

    public void paint( Graphics g )
    {
        g.setColor( new Color ( 255 , 0 , 0));
        g.drawLine(10, 10, 80, 10);

        g.drawRect(100, 100, 100, 70);
        
    }

}

/*

    <applet code = "RectangleAndLines" height = "500" width = "500" > </applet>

*/
