
# File Reader ( Low Level Reader )
    - To read character data or text data .
    - Here , we can read character by character but not by line by line.


# Constructors 

        1. FileReader fr = new FileReader ( String fname ) ;
        2. FileReader fr = new FileReader ( File f) ;

# Methods

        1. int read() //unicode value of character

        2. int read(char[] ch) // no. of character copied from file into array .

        3. void close() ;






        File f = new File("abc.txt") ;
        char[] ch = new char [ (int) f.length()] ;
        FileReader fr = new FileReader (f) ;
        fr.read(ch) ;
        for(char ch1 : ch)
        {
            S.o.p(ch1) ;
        }
        fr.close();
