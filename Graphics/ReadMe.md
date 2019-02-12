
# Graphics Context and Graphics Object

- Graphic Context enables drawing on the screen .
- A graphics object manages a graphoics context and draws pixels on the screen that represents the text and other graphical object ( lines , ellipses , rectangle , polygons ) .
- Graphics objects contain method for drawing , font manipulation , color manipulation.


# Methods that takes Graphics object as an argument 

- public void paint ( Graphics g )

// Here g receives a reference to an object of the Graphics Class .

i) the paint() method of the component class takes a Graphics object as an argument .
ii) This object is passed to the paint method by the system when a paint operation required for a Component.
iii) The paint method defined in a class Component does nothing by default, It must be overridden by the programmes.
iv) When an applet executes , the paint method is automatically called. Similarly when any Component is displayed , that Component's paint method is called automatically . 
