
import java.awt.* ;
import java.awt.event.* ;
import javax.swing.*;


public class Q4a extends JFrame implements ActionListener
{
    JPanel p ; 
    JFrame f ;
    JButton add ;
    JButton sub ;
    JTextField t1 ;
    JTextField t2 ;
    JTextField t3 ;

    Q4a()
    {
        p  = new JPanel();
        f = new JFrame() ;
        add = new JButton("Sum");
        sub = new JButton("Subtract");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        t3.setEditable(false);

        p.add(add);
        p.add(sub);
        p.add(t1);
        p.add(t2);
        p.add(t3);

        f.setSize(900,900);
        f.setVisible(true);
        f.add(p);

        add.addActionListener(this);
        sub.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==add)
        {
            String data1 = t1.getText() ;
            String data2 = t2.getText() ;

            int output = Integer.parseInt(data1) + Integer.parseInt(data2) ;
           
            t3.setText(Integer.toString(output));
        }
        else if ( ae.getSource()==sub)
        {
            String data1 = t1.getText() ;
            String data2 = t2.getText() ;

            int output = Integer.parseInt(data1) - Integer.parseInt(data2) ;
            t3.setText(Integer.toString(output));
        }
    }

    public static void main(String[] args) {
        new Q4a();
    }


}