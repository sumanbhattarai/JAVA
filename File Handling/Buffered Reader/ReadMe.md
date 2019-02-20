
# Buffered Reader ( Read line by line or char by char )

# Constructors 

1. BufferedReader br = new BufferedReader ( Reader r ) ;

2. BufferedReader br = new BufferedReader ( Reader r , int Buffersize ) ;


# Methods 

    - int read ()
    - int read ( char[] ch )
    - void close ()
    - String readLine() // returns NULL if no line available.