
import java.applet.Applet ;
import java.awt.* ;
import java.io.* ;

/* <applet code = "TextAreaDemo" width = "1000" height = "1000"></applet> */

public class TextAreaDemo extends Applet  {
    TextArea echoOne , echoTwo ;
    public  void init()
    {
        TextArea echoOne = new TextArea( 2 , 40) ;
        TextArea echoTwo = new TextArea( 2 , 40) ;
        echoTwo.setEditable(false);
        add(echoOne) ;
        add(echoTwo) ;
        echoOne.setText("Enter text in this textArea .");
    }

    
    

}