



import java.applet.Applet ;
import java.awt.* ;


/*

    <applet code = "FontMetricsDemo" height = "500" width = "500" > </applet>

*/

public class FontMetricsDemo extends Applet
{

    public void paint( Graphics g )
    {
        g.setColor( new Color ( 255 , 0 , 0)) ; // color set
        g.setFont(new Font("Comic Sans MS", Font.BOLD, 24)); // set fonts
        FontMetrics fm = g.getFontMetrics() ;
        g.drawString("Hello"+fm.getAscent() , 44 , 50) ; // draw
        
    }
}