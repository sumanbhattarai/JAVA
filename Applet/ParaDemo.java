
import java.awt.* ;
import java.applet.* ;

/* <applet code = "ParaDemo" height = 900 width = 900 >

<param name="fontSize" value = "140">
<param name = "fontName" value = "TimesRoman">


</applet */

public class ParaDemo extends Applet 
{
    int value ;
    public void init()
    {
        String fs = getParameter("fontSize"); 
        value = Integer.parseInt(fs) ;
        


    }
    public void paint(Graphics g)
    {
        g.setFont(new Font(getParameter("fontName"), Font.PLAIN, value));
        g.drawString("Suman Bhattarai" + value ,100, 200);

        
    }
}
