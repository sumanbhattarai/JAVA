
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