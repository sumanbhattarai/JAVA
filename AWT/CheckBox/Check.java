
import java.awt.* ;
import java.awt.event.* ;


public class Check extends Frame implements ItemListener
{
    TextField t ;
    Checkbox c1 ;
    Checkbox c2 ;
    Checkbox c3 ;

    Check()
    {
        t = new TextField(20) ;
        c1 = new Checkbox("Bold");
        c2 = new Checkbox("Italic");
        c3 = new Checkbox("Plain");

        add(t);
        add(c1);
        add(c2);
        add(c3);

        t.setFont(new Font("arial" , Font.PLAIN , 20));   



        c1.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) { 
                            
                t.setFont(new Font("arial" , Font.BOLD , 20));   
            }  
         });  
         c2.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) { 
  
                t.setFont(new Font("arial" , Font.ITALIC , 20)); 
            }  
         });  
         c3.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) { 
                t.setFont(new Font("arial" , Font.PLAIN, 20));  
            }  
         });  

        setVisible(true);
        setLayout(new FlowLayout());
        setSize(300,300);

        
    }

    public void itemStateChanged(ItemEvent e)
    {
        
    }

    public static void main(String[] args) 
    {
        new Check();
        
    }
}