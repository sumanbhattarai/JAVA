import javax.swing.*;  
import java.awt.*;

class Sum extends JFrame
{  
        JFrame f;  
        Sum()
        {  
            f = new JFrame();  
            String firstno =  JOptionPane.showInputDialog("Enter first number") ;
            String secondno = JOptionPane.showInputDialog("Enter Second number") ;
            int ans = Integer.parseInt(firstno) + Integer.parseInt(secondno) ;
            JOptionPane.showMessageDialog( f, ans+ "");  



        }  
        public static void main(String[] args) 
        {  
             new Sum();  
        }  
} 