
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code="Quens3b" height=900 width=900 > </applet> */


public class Quens3b extends Applet implements ActionListener
{
    AudioClip ac ;
    Button p , s , r ;
    public void init()
    {
        ac = getAudioClip(getDocumentBase() , "Sound.wav") ;
        p = new Button("Play") ;
        s = new Button("Stop") ;
        r = new Button("Repeat") ;
        add(p);
        add(s);
        add(r);

        p.addActionListener(this);
        s.addActionListener(this);
        r.addActionListener(this);


    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==p)
        {
        ac.play();
        }
        else if(e.getSource()==s)
        {
            ac.stop();
        }
        else if(e.getSource()==r)
        {
            ac.loop();
        }

    }
}