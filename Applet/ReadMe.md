
# Applet Initialization and Termination

- When an applet begins , the following methods are called in this sequence .
 i) init()
 ii) start()
 iii) paint()

 - When an applet is terminated , the following sequence of method calls take place.
 i) stop()
 ii) destroy()

 > init()

 - The init method is the first method to be called . This is where you should initialize variable. This methhod is called only once during the runtime of you applet.

 > start()
 
 - Start method is called after init(). It is also called to re-start an applet after it has been stopped. Start method is called each time an applets HTML document is displayed on screen . So , if a user leaves a webpage and comes back, the applet resumes and execution start at start() .

 > paint()

 - The paint() is called each time an AWT based applets output must be redrawn . This situtaion can occur for several reason. Whenever the applet must redraw its output , paint() is called . The paint() has one parameter of type Graphics .   

 > stop()

 - Stop method is called when a web browser leaves the HTML document containing the applet when it goes to another page. You should use stop() to suspend threads don't need to run when the applet is not visible.