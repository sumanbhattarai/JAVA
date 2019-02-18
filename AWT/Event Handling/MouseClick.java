
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
	<applet code ="MouseClick" width = "1000" height = "1000" > </applet>
*/

public class MouseClick extends Applet implements ActionListener
{
	Button b;
	TextField t;

	public void init()
	{
		t = new TextField(20);
		add(t);
		t.setBounds(30,40,150,20);
		t.setEditable(false);
		b = new Button("ClickHere");
		b.setBounds(80,150,60,50);
		add(b);
		b.addActionListener(this);
		setLayout(null);
	}

	public void actionPerformed(ActionEvent ae)
	{
		t.setText("Welcome");
	}
}