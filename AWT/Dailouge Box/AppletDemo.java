
import java.awt.*;
import java.awt.event.*;
import java.applet.* ;
import javax.swing.*;

/* <applet code="AppletDemo" height =900 width= 900 > </applet> */

public class AppletDemo extends Applet implements ActionListener
{
    Button b ;
    TextField t ;
    public void init()
    {
        b = new Button("click");
        t  = new TextField(20);

        add(t);
        add(b);

        b.addActionListener(this);
        

    }

    public void actionPerformed(ActionEvent ae)
    {
        int data = Integer.parseInt(t.getText());
        int fact = 1 ;
        for(int i = 1 ; i <= data ; i++)
        {
            fact = fact * i ;
        }
        JOptionPane.showMessageDialog(null,fact+"");
    }
}
