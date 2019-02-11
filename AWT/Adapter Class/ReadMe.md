
# Adapter Class :

- Java Provides a special feature , called an adapter class , that can simplify the creation of event handles in certain situations.
- An adapter class provides an empty implementation of all methods in an event listen interface .
- It is useful when you want to recieve and process only some of the events that are handled by a particular event listener interface .

- Commonly used Listener Interfaces implemented by Adapter Care :

Adapter Class                       Listener Interface
---------------------------------------------------------------
ComponentAdapter                   ComponentListener
ContainerAdapter                   ContainerListener
FocusAdapter                        FocusListener
KeyAdapter                          KeyListener
MouseMotionAdapter                  MouseMotionListener , MouseListener & MouseWheelListener
WindowAdapter                       WindowListener , WindowFoundListener & WindowStateListener