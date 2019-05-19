import javax.swing.*;  
import java.awt.*;

class OptionPaneExample extends JFrame
{  
        JFrame f;  
        OptionPaneExample()
        {  
            f=new JFrame();  
            JOptionPane.showMessageDialog( f,"Hello World");  
        }  
        public static void main(String[] args) 
        {  
             new OptionPaneExample();  
        }  
} 