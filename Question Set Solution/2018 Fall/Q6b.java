
import java.awt.*;
import javax.swing.*;


public class Q6b extends JFrame 
{
    JFrame f ;
    JPanel p ;

    Q6b()
    {
        f = new JFrame();
        p = new JPanel();
        f.setSize(100,100);
        f.setVisible(true);
        f.add(p);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Q6b();
    }

}