import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MulticastDemo implements ActionListener
{
    JFrame frame;
    JPanel p ;
    static int count=0;
    JButton newWindow;
    JButton closeAll;
    public static void main(String[] args)
    {
        new MulticastDemo();
    }
    MulticastDemo()
    {
        frame=new JFrame("Main Window");
        p = new JPanel();
        newWindow=new JButton("New Window");
        closeAll=new JButton("Close All Windows");

        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setLayout(new FlowLayout());
        
        p.add(newWindow);
        p.add(closeAll);
        frame.add(p);

        newWindow.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        CloseFrame f=new CloseFrame();
        count++;
        f.setTitle("Window "+count);
        f.setVisible(true);
        f.setSize(250,150);
        f.setLocation(40*count,40*count);
        closeAll.addActionListener(f);        
    }
    
}
class CloseFrame extends JFrame implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        setVisible(false);
    }
}