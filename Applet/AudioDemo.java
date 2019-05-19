
import java.awt.*;
import java.awt.event.* ;
import java.applet.*;


/* <applet code="AudioDemo" height=900 width=900 > </applet> */

public class AudioDemo extends Applet implements ActionListener
{
    AudioClip ac ;
    Button b , bw ;

    public void init()
    {
        b = new Button("Play the music");
        add(b);
        bw = new Button ("Stop the Music");
        add(bw);

        b.addActionListener(this);
        bw.addActionListener(this);
        ac = getAudioClip( getDocumentBase() , "Sound.wav") ;
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
        ac.play();
        }
        else if (e.getSource()==bw)
        {
            ac.stop();
        }
    }
}