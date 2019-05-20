
import java.awt.*;
import java.awt.event.* ;


public class Q5a extends Frame implements ActionListener 
{
    TextField tf ;
    Button b ;

    Q5a()
    {


        tf = new TextField(20) ;
        b = new Button("Click");
        add(tf);
        add(b);

        setVisible(true);
        setSize(900,900);
        setLayout(new FlowLayout());
      

        b.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
        String data = tf.getText();
        String output = data.toUpperCase();
        tf.setText(output);
       
    }

    public static void main(String[] args) {
        new Q5a();
    }


}

