
// Java will allow the applet to load the data from the directory holding the html file that started the applet ( the document base) and the directory from which the applet class file was loaded (code base). Both  the getDocumentBase() and getcodeBase() returns the directory as URL objects respectively.

import java.awt.* ;
import java.applet.* ;

/*
<applet code = "DisplayImage" height = "900" width = "900"></applet>
*/ 

public class DisplayImage extends Applet {

    Image picture  ;
    public void init ()
    {
        picture = getImage(getDocumentBase() , "im.jpg") ;

    }

    public void paint( Graphics g)
    {
        g.drawImage(picture , 10 , 10 , this) ;
    }

}