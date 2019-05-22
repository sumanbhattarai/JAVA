
import java.awt.* ;
import java.awt.event.* ;

public class Q4a extends Frame
{
    Q4a()
    {
        setSize(600,600);
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("My Frame ");
        addWindowListener( new WindowAdapter()
        {
            public void windowClosing( WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Q4a();
    }
}