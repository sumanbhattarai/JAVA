

import java.awt.* ;
import java.applet.*;

/*

        <applet code = "Traingle" height = "500" width = "500" > </applet>

*/


public class Traingle extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(new Color(255,0,0));
        Polygon triangle = new Polygon () ;
        triangle.addPoint(100,100) ;
        triangle.addPoint(50,200) ;
        triangle.addPoint(200,250) ;
        g.drawPolygon(triangle);

    }
}