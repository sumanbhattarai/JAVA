
import java.awt.* ;
import java.awt.event.ActionListener;
import java.applet.* ;

/*

    <applet code = "AudioDemo" height = "1000" width = "1000" > </applet

*/

public class AudioDemo extends Applet implements ActionListener
{
    public AudioClip clip ;
    
    public void init()
    {
        Button b = new Button("Play");
        add(b);
        b.addActionListener(this);
        clip = getAudioClip(getDocumentBase() , "Sound.wav") ;

        
        

    }

    public void actionPerformed(ActionEvent ae)
	{
        clip.play();
	}



}