
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*

        < applet code = "Sum" height = "1000" width = "1000" >
        </applet>

*/

public class Sum extends Applet implements ActionListener
{
    public void init()
    {
        Label num1 = new Label ( "First Number " ) ; 
        Label num2 = new Label ( "Second Number ") ; 
        Label sum = new Label ( "SUM :  ") ;
        Button sumButton = new Button ("Calculate Sum") ;
        add(num1) ;
        add(num2) ;
        add(sum) ;
        add(sumButton);
        setLayout(false);

    }
}
