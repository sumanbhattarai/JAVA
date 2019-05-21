
import java.awt.* ;
import java.applet.*;

/* <applet code="Ellipse" height=1000 width=1000></applet> */

public class Ellipse extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.drawOval(400, 200, 400, 300);
        g.drawString("POKHARA UNIVERSITY", 500, 300);
    }
}