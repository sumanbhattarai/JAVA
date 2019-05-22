
import java.awt.* ;
import java.applet.* ;

/* <applet code = "AppletDemo" width = 500 height = 500></applet> */

public class AppletDemo extends Applet
{
    public void paint ( Graphics g )
    {
        g.drawString("Hello Applet ! How are you ? " , 100 , 300 );
    }
}