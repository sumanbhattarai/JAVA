

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
	<applet code ="Sum" width = "1000" height = "1000" >
</applet>
*/

public class Sum extends Applet implements ActionListener
{
	
	public void init()
	{
        Label num1= new Label ( "First Number : "  , Label.CENTER) ;
        Label num2 = new Label ( " Second Number : " , Label.CENTER ) ;
        TextField Output =  new TextField(20) ;
        Button calculateSum = new Button ("SUM") ;
        add(num1) ;
        add(num2);
        add(Output);
        add(calculateSum);
       Output.setEditable(false);

	}

	public void actionPerformed(ActionEvent ae)
	{
		
	}
}