
import java.awt.* ;
import javax.swing.*;
import java.awt.event.* ;

public class Q3b extends JFrame  implements ActionListener
{

	JMenuItem addMI , subtractMI,closeMI;
	JTextField tf1,tf2,tf3;
	Q3b()
	{
		setVisible(true);
		setSize(500,500);
		setTitle("demo");
		setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Arg1");
        add(l1);
		tf1 = new JTextField(20);
		add(tf1);
		JLabel l2 = new JLabel("Arg2");
        add(l2);
		tf2 = new JTextField(20);
		add(tf2);
		JLabel l3 = new JLabel("Result");
        add(l3);
		tf3 = new JTextField(20);
		add(tf3);

		JMenuBar menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("file");

		 addMI = new JMenuItem("add");
		 subtractMI = new JMenuItem("subtract"); 
		 closeMI = new JMenuItem("close"); 

		fileMenu.add(addMI);
		fileMenu.add(subtractMI);
		fileMenu.add(closeMI);

		menuBar.add(fileMenu);

		this.setJMenuBar(menuBar);

		addMI.addActionListener(this);
		subtractMI.addActionListener(this);
		closeMI.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==addMI)
		{
			int num1 = Integer.parseInt(tf1.getText());
			int num2 = Integer.parseInt(tf2.getText());
			int result = num1+num2;
			tf3.setText(Integer.toString(result));
		}
		if(e.getSource() == subtractMI)
		{
			int num1 = Integer.parseInt(tf1.getText());
			int num2 = Integer.parseInt(tf2.getText());
			int result = num1-num2;
			tf3.setText(Integer.toString(result));
		}
		if(e.getSource()==closeMI)
		{
			this.setVisible(false);
			
		}
	}
      
        
    public static void main(String[] args) {
        new Q3b();
    }
}