import java.awt.*;
import javax.swing.* ;
import java.awt.event.*;
import javax.swing.event.*;


public class Solution extends JFrame  implements ActionListener
{
    JTextField tf ;
    JButton b ;

    public Solution()
    {
        tf = new JTextField(20);
        b = new JButton("Click") ;

        add(tf);
        add(b);

        setVisible(true);
        setSize(800,800) ;
        setLayout( new FlowLayout());

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e )
    {
        tf.setText(tf.getText().toUpperCase());
        tf.setBackground(Color.RED);
    }

    public static void main(String[] args) {
        new Solution();
    }

 
}