
import java.awt.Graphics ;
import java.awt.Color ;
import javax.swing.JFrame;
import javax.swing.JPanel ;

class ColorJPanel extends JPanel
{
    public void paintComponent ( Graphics g )
    {
        super.paintComponent(g) ;
        this.setBackground(Color.WHITE) ;
        // set new drawing color using integers 
        g.setColor( new Color(255,0,0)) ;
        g.fillRect(15,50,100,20);
        g.drawString("Current RGB : " + g.getColor(),130 , 40) ;
    }
    
}


public class GraphicsDemo 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Using Colors") ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ColorJPanel colorJPanel = new ColorJPanel() ;
        frame.add(colorJPanel) ;
        frame.setSize(400,180);
        frame.setVisible(true);
        
    }
}