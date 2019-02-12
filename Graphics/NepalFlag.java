
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

        // Changing color to red.
        g.setColor(new Color(204, 0, 43)) ;

        // Upper Red part of FLag
        Polygon upperTriangle = new Polygon();
        upperTriangle.addPoint(23, 40); //e
        upperTriangle.addPoint(23,360); //X
        upperTriangle.addPoint(536, 360); //l
        g.fillPolygon(upperTriangle);

        // Lower Red Part of Flag
        Polygon lowerTriangle = new Polygon();
        lowerTriangle.addPoint(23,360); //X
        lowerTriangle.addPoint(174, 360); //m
        lowerTriangle.addPoint(532,720); //k
        lowerTriangle.addPoint(23,720); // Y
        g.fillPolygon(lowerTriangle);


        // Sun
        g.setColor(new Color(255,255,255));
        Polygon sun = new Polygon();
        sun.addPoint(96, 448);
        sun.addPoint(101, 489);
        sun.addPoint(57, 486);
        sun.addPoint(83, 522);
        sun.addPoint(45, 539);
        sun.addPoint(83, 559);
        sun.addPoint(58, 595);
        sun.addPoint(100, 590);
        sun.addPoint(100, 632);
        sun.addPoint(133, 609);
        sun.addPoint(151, 650);
        sun.addPoint(169, 610);
        sun.addPoint(204, 633);
        sun.addPoint(201, 590);
        sun.addPoint(243, 596);
        sun.addPoint(219, 559);
        sun.addPoint(257, 542);
        sun.addPoint(219, 523);
        sun.addPoint(246, 487);
        sun.addPoint(201, 491);
        sun.addPoint(205, 448);
        sun.addPoint(171, 474);
        sun.addPoint(151, 433);
        sun.addPoint(133, 474);
        g.fillPolygon(sun);

    }
}