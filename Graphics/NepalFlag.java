
import java.awt.*;
import java.applet.* ;

/*

    <applet code = "NepalFlag" height = "1000" width = "1000" > </applet>

*/
public class NepalFlag extends Applet
{
    public void paint ( Graphics g)
    {
        // Color is set to blue for all the border .
        g.setColor(new Color(0, 37, 132)) ;
        
        // All Borders of FLag
        Polygon mainLine = new Polygon();
        mainLine.addPoint(1, 1); //a
        mainLine.addPoint(1, 40); //b
        mainLine.addPoint(1, 740); //c
        mainLine.addPoint(23, 740); //d
        mainLine.addPoint(23, 40); //e
        g.fillPolygon(mainLine);

        Polygon sideLine = new Polygon() ;
        sideLine.addPoint(1, 1); //a 
        sideLine.addPoint(1, 26); //f
        sideLine.addPoint(570, 382); //g
        sideLine.addPoint(610, 382); //h
        g.fillPolygon(sideLine);

        Polygon downLine = new Polygon() ;
        downLine.addPoint(1, 720); //i
        downLine.addPoint(1 , 740); //c 
        downLine.addPoint( 590 ,740); //j
        downLine.addPoint(532,720); //k
        g.fillPolygon(downLine);

        Polygon border1 = new Polygon();
        border1.addPoint(570, 382); //g
        border1.addPoint(536, 360); //l
        border1.addPoint(174, 360); //m
        border1.addPoint(226, 382); //n
        g.fillPolygon(border1);

        Polygon border2 = new Polygon();
        border2.addPoint(174, 360); //m
        border2.addPoint(532,720); //k
        border2.addPoint( 590 ,740); //j
        border2.addPoint(226, 382); // n
        g.fillPolygon(border2);

    }
}