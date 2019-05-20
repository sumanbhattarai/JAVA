import java.awt.*;  
import java.awt.event.*;  


public class KeyListenerExample extends Frame implements KeyListener
{  
    TextField t ;
    Label l ;

    KeyListenerExample()
    {
        t = new TextField(20);
        l  = new Label("Effect will be seen here : ") ;
        add(t) ;
        add(l);

        t.addKeyListener(this);

        setVisible(true);
        setLayout(new FlowLayout());
        setSize(200,200);

    }

    public void keyPressed(KeyEvent e)
    {
        l.setText("Key is pressed");
    }

    public void keyTyped(KeyEvent e)
    {
        l.setText("Key is typed.");
        

    }

    public void keyReleased(KeyEvent e)
    {
        l.setText("Key is Released.");

    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }


}