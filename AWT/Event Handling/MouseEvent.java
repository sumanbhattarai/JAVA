

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*

	< applet code = " MouseEvent " height = "1000" width = "1000 " > </applet>

*/

public class MouseEvent extends Applet implements ActionListener , MouseListener
{
	String s = "Mouse Action";
	Button b;
	TextField t;

	public void init()
	{
		t = new TextField(20);
		add(t);
		t.setBounds(30,40,150,20);

		b = new Button("ClickHere");
		b.setBounds(80,150,60,50);
		add(b);

        addMouseListener(this);
		b.addActionListener(this);

		setLayout(null);

	}

	public void actionPerformed(ActionEvent ae)
	{
		t.setText("Welcome");
	}

	public void mousePressed(MouseEvent me)
	{
		s = "Mouse Preesed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		s = "Mouse Released";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		s = "Mouse Entered";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		s = "Exited Frame";
		repaint();
	}
	public void mouseClicked(MouseEvent me)
	{
		s = "Mouse Clicked";
		repaint();
	}
	public void paint(Graphics g)
    {
        g.drawString(s, 75, 150); 
    }

}