
import java.applet.Applet ;
import java.awt.* ;


/*

    <applet code = "RectangleUsingLines" height = "500" width = "500" > </applet>

*/

public class RectangleUsingLines extends Applet
{

    public void paint( Graphics g )
    {
        g.setColor( new Color ( 255 , 0 , 0));
        g.drawLine(10, 10, 80, 10);
        g.drawLine(10,10, 10 , 80);
        g.drawLine(10,80, 80 , 80);
        g.drawLine(80,10, 80 , 80);
    }

}