
import java.applet.* ;
import java.awt.* ;

/*

        <applet code = "ArcDemo" height = "500" width = "500" > </applet>

*/

public class ArcDemo extends Applet
{
    public void paint( Graphics g )
    {
        g.setColor( new Color(255,0,0)) ;
        g.drawArc(250, 250, 100, 100, 0, -270);
        // -ve means a anticlockwise.
    }

}