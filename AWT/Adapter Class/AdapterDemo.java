
import java.awt.*; 
import java.awt.Event.* ;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

import com.sun.glass.events.MouseEvent;

import java.applet.* ;

/* 

<applet code ="AdapterDemo" width = "1000" height = "1000" >
</applet>

*/

public class AdapterDemo extends Applet 
{
    public void init()
    {
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));

    }

}

class MyMouseAdapter extends MouseAdapter 
{

    AdapterDemo adapterDemo ;
    public MyMouseAdapter ( AdapterDemo adapterDemo) 
    {
        this.adapterDemo = adapterDemo ;
    }

    // Handle Mouse Clicked
    public void mouseClicked( MouseEvent me )
    {
        adapterDemo.showStatus("Mouse Clicked");
    }
}

class MyMouseMotionAdapter extends MouseMotionAdapter
{
    AdapterDemo adapterDemo ;
    public MyMouseMotionAdapter(AdapterDemo adapterDemo)
    {
        this.adapterDemo = adapterDemo ;
    }

    // Handle mouse Dragged
    public void mouseDragged(MouseEvent me)
    {
        adapterDemo.showStatus("Mouse Dragged");
    }
}