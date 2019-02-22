package com.Assignment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.* ;

public class Form extends JFrame implements ActionListener
{
	JButton b ;
	JTextField t ;
	JPasswordField p ;
	JFrame jf ;
	JPanel jp ;
	JLabel jl1 ;
	JLabel jl2 ;
	
	
	Form()
	{
		gui() ;
	}
	
	void gui()
	{
		// Creating new JFrame and JPanel .
		jf = new JFrame() ;
		jp = new JPanel() ;
		
		// Creating a text field.
		jl1 = new JLabel("Username : ") ;
		jp.add(jl1);
		t = new JTextField(15) ;
		jp.add(t) ;
		
		// Creating a new Password Field .
		jl2  = new JLabel("Password : ") ;
		jp.add(jl2);
		p = new JPasswordField(15) ; 
		jp.add(p) ;
		p.setEchoChar('*'); // Displays '*' when the password is typed .
		
		// Creating new Button
		b = new JButton("Submit data") ;
		jp.add(b); 
		
		jf.add(jp) ;
		
		jf.setSize(700,700);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		
		
		// Event Handling
		
		b.addActionListener(this);
		
		
		
		
	}
	
	public static void main(String[] args) 
	{
		Form obj = new Form() ;
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String usernameValue = t.getText() ;
		String passwordValue = p.getText() ;

		// if any of the field is empty .
		if(usernameValue.equals("") || passwordValue.equals("") )
		{
			JOptionPane.showMessageDialog(null , "Please fill out the field properly");
			
		}
		else
		{
			try {
			Connection conn = null ;
			PreparedStatement p = null ;
			ResultSet r = null ;
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/Form","suman","admin045");
			
			String sql = "INSERT INTO formtable (Username , Password)"+" VALUES (? ,?)" ;
			
			p = conn.prepareStatement(sql);
			p.setString(1, usernameValue );
			p.setString(2, passwordValue );
			
			p.execute();
			
			
			
			
			
			
		} catch ( Exception ee )
			
			{
				System.out.println("Error is : " + ee.getMessage());
			}
		
		
	}
		
	}
	

}
