import java.awt.*;  
import java.awt.event.*;  

public class MouseDemo extends Frame implements MouseListener
{  
    Label l;  
    MouseDemo(){  
        addMouseListener(this);  
          
        l=new Label("Effects will be shown here.");  
        add(l);  
        setSize(300,300);  
        setLayout(new FlowLayout());  
        setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) {  
        l.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  
public static void main(String[] args) {  
    new MouseDemo();  
}  
}  