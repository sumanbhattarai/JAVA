
# Applet programming

- An Applet in a java Program that runs in a web browser.

- An applet in a java class that extends the java.applet.Applet class

- No main() method.

- Applet are designed to be embedded within an HTML page.

- JVM is required to view an applet.

- Applet have strict security rules that are enforced by the web browser.

# Two types of Applet

- Based on Applet class:
        
– These Applets use the Abstract Window ToolKit(AWT) to provide the
graphical user interface.
– This style of Applet has been available since java was first created.
R
- Based on JApplet class : 

– Are based on the Swing class JApplet, which inherits Applet.
– Swing applets use the Swing classes to provide the G.U.I.



# Applet Initialization and Termination

- When an applet begins , the following methods are called in this sequence .
 i) init()
 ii) start()
 iii) paint()

 - When an applet is terminated , the following sequence of method calls take place.
 i) stop()
 ii) destroy()

 > init()

 - The init() is the first method to be called . This is where you should initialize variable. This methhod is called only once during the runtime of you applet.

 > start()
 
 - The start() is called after init(). It is also called to re-start an applet after it has been stopped. The start() is called each time an applets HTML document is displayed on screen . So , if a user leaves a webpage and comes back, the applet resumes and execution start at start() .

 > paint()

 - The paint() is called each time an AWT based applets output must be redrawn . This situtaion can occur for several reason. Whenever the applet must redraw its output , paint() is called . The paint() has one parameter of type Graphics .   

 > stop()

 - The stop() is called when a web browser leaves the HTML document containing the applet when it goes to another page. You should use stop() to suspend threads don't need to run when the applet is not visible.

 > destroy()

 - The destroy() is called when the environment determines your applet needs to be removed completely from memory. At this point you should free up any resources the applet may be using. The destroy() is called only after the stop().


 # The HTML APPLET TAG
         
         Syntax :
                    < APPLET 
                    [ CODEBASE = codebaseURL ]
                     CODE = appletFile
                    [ ALT = alternateText ]
                    [ NAME = appletInstanceName ]
                      WIDTH = pixels 
                      HEIGHT = pixels 
                    [ ALIGN = alignment ]
                    [ VSPACE = pixels ]
                    [ HSPACE = pixels ]
                    >

                    [ <PARAM NAME = attritubeName VALUE = AttritubeValue >]
                    [ HTML Displayed in JAVA ]
                    </APPLET>

>                    Note: [] is optional

# CODEBASE attribute

It is an optional attribute that specifies the base URL of the applet code , which is the directory that will be searched for the applets executable class file.  The HTML documents URL directory is used as the code based if this attribute is not specified . Code is a required attribute that gives the name of the file continuing your applets compiled .class file . This file is related to the code based URL of the applet.


# ALT tag

The Alt tag is an optional attribute used to specify a short text message that should be displayed if the browser recognizes the applet tag but can't curretly runs JAVA applets.


# NAME attribute 

NAME is an optional attribute used to specify a name for the applet instance . NAME attribute is used in order to communicate between applets on the same page.


# WIDTH and HEIGHT

Width and height are the required attribute that gives the size of the applet display area.


# Align

Align is an optional attribute that specifies the alignment of the applet. The possible values are left , right , top , bottom , middle , base-line , text-top , abs-middle , abs-bottom.


# VSPACE and HSPACE

This attributes are optional. VSPACE specifies the space in pixels above and below the applet. HSPACE speciffies the space in pixels on each side of the applet.


# PARAM tag

Param tag allows you to specify applet specific arguments. Applets access their attribute with the getParameter() .
