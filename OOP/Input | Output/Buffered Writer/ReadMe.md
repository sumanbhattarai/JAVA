
# Constructors 

1. BufferedWriter bw = new BufferedWriter("abc.txt") ; // Wrong ! Cannot communicate directly with file.
        BufferedWriter bw = new BufferedWriter(Writer w) ;

2. BufferedWriter bw = new BufferedWriter(Writer w, int buffersize) ;

Examples :

BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt")) ;
BufferedWriter bw = new BufferedWriter(new BufferedWriter(new FileWriter("abc.txt"))) ;


# Methods
     
     - write(int ch)
     - write(char[] ch)
     - write(String S)
     - flush()
     - close()
     - newLine() // to insert line separator.


> Note : BufferedWirter is similar to FileWriter but it uses internal buffer to write data into File. So if the number of write operations are more , the actual IO operations are less and performance is better.

> You shoulld use BW when number of write operations are more.



