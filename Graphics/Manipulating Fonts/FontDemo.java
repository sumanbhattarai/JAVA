


import java.applet.Applet ;
import java.awt.* ;


/*

    <applet code = "FontDemo" height = "500" width = "500" > </applet>

*/

public class FontDemo extends Applet
{

    public void paint( Graphics g )
    {
        g.setColor( new Color ( 255 , 0 , 0)) ; // color set
        g.setFont(new Font("Comic Sans MS", Font.BOLD, 24)); // set fonts
        g.drawString("Hello" , 44 , 50) ; // draw
        g.fillRect(150,50,100,20);
        g.setColor( new Color ( 0, 255 , 0)) ; // color set
        g.setFont(new Font("Comic Sans MS", Font.BOLD+Font.ITALIC, 15)); // set fonts
        g.drawString("GCES" , 44 , 100) ; // draw
        g.fillRect(150,100,100,20);

    }
}