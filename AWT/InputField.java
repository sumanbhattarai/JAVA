import java.awt.*;
import java.applet.*;

public class InputField extends Applet {
    
    public void init()
    {
        Label userName = new Label ( "Username : " , Label.CENTER) ;
        Label password = new Label ( "Password : " , Label.CENTER) ;
        TextField userNameValue =  new TextField(20) ;
        TextField passwordValue =  new TextField(20) ;
        Button Login = new Button ("Login") ;
        Button Cancel = new Button ("Cancel") ;
        passwordValue.setEchoChar('*');
        add(userName) ;
        add(userNameValue);
        add(password);
        add(passwordValue);
        add(Login);
        add(Cancel);

        

        
    }
}
