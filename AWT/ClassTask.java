
import javax.swing.*;
import java.awt.*; 

public class ClassTask extends JFrame
{
    ClassTask()
    {
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(300 ,400 );
    JLabel num1 = new JLabel ( "First Number " ) ; 
    JLabel num2 = new JLabel ( "Second Number ") ; 
    JLabel sum = new JLabel ( "SUM :  ") ;
    JButton sumButton = new JButton ("Calculate Sum") ;
    add(num1) ;
    add(num2) ;
    add(sum) ;
    add(sumButton);
    }

    public static void main(String[] args) {
        new ClassTask();
    }
    

}