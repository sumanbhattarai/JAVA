
import java.applet.Applet ;
import java.awt.* ;
import java.io.* ;

public class TextAreaDemo extends Applet implements TextListener {
    TextArea echoOne , echoTwo ;
    public  void init()
    {
        TextArea echoOne = new TextArea( 2 , 40) ;
        TextArea echoTwo = new TextArea( 2 , 40) ;

        LayoutManager layout = new FlowLayout() ;
        setLayout(layout) ;
        echoOne.addTextListener(this); // register
        echoTwo.setEditable(false);
        add(echoOne) ;
        add(echoTwo) ;
        echoOne.setText("Enter text in this textArea .");
    }

    public void textValueChanged( TextEvent e )
    {
        String entry = echoOne.getText() ;
        echoTwo.setText(entry);
    }
    

}