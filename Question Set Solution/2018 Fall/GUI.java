
import java.awt.*;
import javax.swing.* ;
import java.awt.event.*;
import javax.swing.event.*;

public class GUI extends JFrame implements ActionListener
{
    JTextField t1 ;
    JTextField t2 ;
    JTextField t3 ;
    JButton sum ;
    JButton diff;


    public GUI()
    {
        t1 = new JTextField(20) ;
        t2 = new JTextField(20) ;
        t3 = new JTextField(20) ;
        sum = new JButton("Sum") ;
        diff = new JButton("Diff") ;

        add(t1);
        add(t2);
        add(t3);
        add(sum);
        add(diff);
        t3.setEditable(false);
        setSize(800,800);
        setVisible(true);
        setLayout( new FlowLayout()) ;

        sum.addActionListener(this);
        diff.addActionListener(this);





    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==sum)
        {
       int value = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText()) ;
       String sumValue = Integer.toString(value);
        t3.setText(sumValue);
        }
        else if(e.getSource()==diff)
        {
            int value = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText()) ;
       String diffValue = Integer.toString(value);
        t3.setText(diffValue);

        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}

