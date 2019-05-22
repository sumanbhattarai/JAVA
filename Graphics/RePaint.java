
import java.awt.* ;
import java.applet.* ;

/* <applet code="RePaint" height=900 width=900></applet> */

public class RePaint extends Applet 
{
    int i ;
    public void paint(Graphics g)
    {
        g.drawString(" i : " + i , 100 , 100);

        try{
            Thread.sleep(1000);
        }
        catch(Exception e )
        {
            System.out.println(e.getMessage());
        }

        i++ ;
        repaint();

    }
}