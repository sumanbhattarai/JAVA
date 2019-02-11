
import javax.swing.* ;
import java.awt.*;

public class SwingDemo extends JFrame 
{
    
    SwingDemo()
    {
        JLabel name = new JLabel("Hello World") ;
        JButton b = new JButton("Click") ;
        setLayout(new FlowLayout());
        setVisible(true);
        add(name) ;
        add(b);
    }

    public static void main(String[] args)
    {
        new SwingDemo();
        
    }
}