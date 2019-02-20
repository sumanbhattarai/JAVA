

# Constructors

    1. FileWriter fw = new FileWriter (String name) ;

    2. FileWriter fw = new FileWriter (File f) ;

    3. FileWriter fw = new FileWriter (String fname , boolean append) ;

    4. FileWriter fw = new FileWriter (File f , boolean append) ;

> Note : If no file available , this will create that file.


# Methods 

    1. write (int ch)
        - to write a single character to the file.
                    fw.write(100) ;
                    dw.write('d') ; //both write d .

    2. write(char[] ch) ;

    3. write(String S) ;

    4. flush()
         - to gurantee our data including last char also is written property.

    5. close()