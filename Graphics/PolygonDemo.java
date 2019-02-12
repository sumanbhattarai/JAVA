
import java.awt.* ;
import java.applet.* ;

/*

        <applet code = "PolygonDemo" height = "500" width = "500" > </applet>

*/

public class PolygonDemo extends Applet
{
    public void paint(Graphics g)
    {
        int[] xvalues = {20,40,50,30,20,15} ;
        int[] yvalues = {50,50,60,80,80,60} ;
        Polygon poly1 = new Polygon( xvalues , yvalues , 6) ;
        g.setColor(new Color(255, 0 , 0));
        g.drawPolygon(poly1);

        Polygon polygon2 = new Polygon () ;
        polygon2.addPoint(165,135) ;
        polygon2.addPoint(175,150) ;
        polygon2.addPoint(270,200) ;
        polygon2.addPoint(200,220) ;
        polygon2.addPoint(130,180) ;
        g.fillPolygon(polygon2);




        
    }

}