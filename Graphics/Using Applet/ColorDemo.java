
import java.applet.Applet ;
import java.awt.* ;


/*

    <applet code = "ColorDemo" height = "500" width = "500" > </applet>

*/

public class ColorDemo extends Applet
{

    public void paint( Graphics g )
    {
        g.setColor( new Color ( 255 , 0 , 0)) ; // color set
        g.drawString("Hello" , 44 , 50) ; // draw
        g.setColor( new Color ( 0, 255 , 0)) ; // color set
        g.drawString("GCES" , 44 , 100) ; // draw
    }
}