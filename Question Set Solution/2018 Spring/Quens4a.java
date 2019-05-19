
import java.awt.*;
import java.awt.event.* ;
import javax.swing.*;

public class Quens4a extends JFrame implements ActionListener 
{
    JPanel p ;
    JFrame f ;
    JTextField tf ;
    JButton b ;

    Quens4a()
    {
        p = new JPanel();
        f = new JFrame();

        tf = new JTextField(20) ;
        b = new JButton("Click");
        p.add(tf);
        p.add(b);

        f.setVisible(true);
        f.setSize(900,900);
        f.add(p);

        b.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
        String data = tf.getText();
        String output = data.toUpperCase();
        tf.setText(output);
        tf.setBackground(Color.RED);
    }

    public static void main(String[] args) {
        new Quens4a();
    }


}

