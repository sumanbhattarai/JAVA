
import java.awt.* ;
import java.awt.event.* ;

public class Q4a extends Frame implements ActionListener
{
 
    Button b1;
    Button b2 ;

    Q4a()
    {
  
        b1 = new Button("Black");
        b2 = new Button("Blue") ;
        add(b1);
        add(b2);
        setLayout(new FlowLayout());
        setSize(900,900);
        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);


    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            setBackground(Color.BLACK);
        }
        else if(ae.getSource()==b2)
        {
            setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new Q4a();
    }
}