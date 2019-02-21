
import java.awt.* ;
import java.awt.event.* ;

public class FrameCloseDemo
{
    public static void main(String[] args) 
    {
        Frame frame = new Frame ("Close Operation Frame");
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.addWindowListener( new WindowAdapter()
        {
            public void windowClosing( WindowEvent we)
            {
                System.exit(0);
            }
        });
        
    }
}