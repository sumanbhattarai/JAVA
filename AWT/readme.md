

# Components :

Component is an abstract class that incapsulates all the attributes of a visual component. Excepts for menu ,all user interface elements that are displayed on the screen and that interact with the user are sub classes of Component. A Component object is responsible for remembering foreground and background colors and the currently selected text font.


# Container : 

The Container class is the sub class of Component. It has additional method that allows other Component objects to be nested within it. Other Container objects can be stored inside of a Container ( Since, they are themselves instance of Component ).  This makes for a multilevel containment system. A Container is responsible for laying out i.e. positioning any components that it contains. It does this through the use of various layout manager. 


# Panel :

The panel is the container that doesn't contain title bar and menu bar. It can have other components like button , text field etc. Penel is the super class for Applet. This is why you don't see title bar , menu bar or border when an Applet is run inside a browser. When you run an Applet using an appletviewer , the appletviewer provides the title and border. Other components can be added to an Panel object by its add method. Once, this component has been added you can position and resize them manually using the setLocation(), setSize() , setBounce() etc.


# Window :

The Window is the container that have no borders and menu bar. The Window class creates a top level window. A top level window is not contained within any other object. Generally , you won't create window object directly. Instead you will use a subclass of Window call frame. 


# Frame :

Frame has a title bar , menu bar , borders and resizing corners. The precise look of a frame will differ from environment. Frame is a container that contain several different components like button , title bar , text fiel , level etc. In Java , most of the AWT applications are created using frame window.
