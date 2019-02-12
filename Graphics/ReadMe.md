
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


- public void repaint()

i) If the programmed needs to call paint , a call is made to the Component class repaint() method .

ii) The repaint method request a call to the Component's update method .


- Public void update( Graphics g )

i) In AWT GUI Components , the update() clears the background of GUI components .


- public void paintComponent ( Graphics g )

i) Swing Components the inherit from the class JComponent contain method paintComponent() that helps them to draw properly in the context of a Swing GUI .



# Color Control

- Color Constants and thier  RGB values .

| Color Constant | RGB values |
|----------------|------------|
| ```public static final Color RED``` | 255 , 0 , 0 |
| ```public static final Color GREEN``` | 0 , 255 , 9|
| ```public static final Color BLUE``` | 0 , 0 , 255|
| ```public static final Color ORANGE``` | 255 , 200 , 0|
| ```public static final Color PINK``` | 255 , 175 , 175 |
| ```public static final Color CYAN``` | 0 , 255 , 255|
| ```public static final Color MAGENTA``` | 255 , 0 , 255|
| ```public static final Color YELLOW``` | 255 , 255 , 0|
| ```public static final Color BLACK``` | 0 , 0 , 0 |
| ```public static final Color WHITE``` | 255 , 255 , 255 |

- Constructors 

i) public Color ( int r , int g , int b )  // based on 0-255 .
ii) public Color ( float r , float g , float b) // based on 0.0 - 1.0

- Methods 

i) public int getRed() ;
ii) public int getGreen() ;
iii) public int getBlue() ;


- Graphics methods for manipulating Colors 

i) public Color getColor() 
            It returns object representing current file for the graphicsContext .

ii) public void setColor( Color c )
            Sets Current color for drawing with the graphics context.