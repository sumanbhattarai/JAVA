

import java.awt.* ;

import java.applet.*;

/*

        <applet code = "PolylineDemo" height = "500" width = "500" > </applet>

*/

public class PolylineDemo extends Applet
{
    public void paint ( Graphics g )
    {
        g.setColor(new Color(255,0,0));
        Polyline  polyline1 = new Polyline () ;
        polyline1.addPoint(200,200) ;
        polyline1.addPoint(300,200) ;
        polyline1.addPoint(300,300) ;
        polyline1.addPoint(200,300) ;
        g.drawPolyline(polyline1);



    }
}

