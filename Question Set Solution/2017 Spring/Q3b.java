
import java.awt.* ;
import java.awt.event.* ;

public class Q3b extends Frame implements ActionListener
{
 
    TextField t1 ;
    TextField t2 ;
    TextField t3 ;
    Button b ;

    Q3b()
    {
  
        t1 = new TextField(20) ;
        t2 = new TextField(20) ;
        t3 = new TextField(20) ;
        b = new Button("Sum") ;
        add(t1);
        add(t2);
        add(t3);
        add(b);

        t3.setEditable(false);
        setLayout(new FlowLayout());
        setSize(900,900);
        setVisible(true);

        b.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
        String data1 = t1.getText() ;
        String data2 = t2.getText() ;
        int out = Integer.parseInt(data1)+ Integer.parseInt(data2) ;
        t3.setText(Integer.toString(out));
    }

    public static void main(String[] args) {
        new Q3b();
    }
}