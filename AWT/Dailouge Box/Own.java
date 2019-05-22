
import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;

public class Own implements ActionListener
{
    JWindow w ;

    Own()
    {
        w = new JWindow() ;
        JLabel l1 = new JLabel("Message Dialog Box") ;
        JButton b  = new JButton("Ok") ;
        JPanel p = new JPanel() ;
        p.add(l1) ;
        p.add(b) ;

        w.add(p) ;

        w.setVisible(true);
        w.setSize(300,300);

        b.addActionListener(this);



    }

    public void actionPerformed(ActionEvent e )
    {
        w.setVisible(false);
    }

    public static void main(String[] args) {
        new Own();
    }
}