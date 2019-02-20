# Classes :
- File
- File Writen
- File Reader
- BufferedWritten
- BufferedReader
- PrintWriten

# File :

                File f = new File("abc.txt") ; // it won't create physical file but this is java file object.

                  to check, 
                            System.out.println(f.exists()) ; //it returns false

                  to create physical filec
                            
                            f.createNewFiile() ;
                            System.out.println(f.exists()) ; // Now it returns true.

 > Note : JAVA IO is based on UNIX system. It can be used to represent directory also.
                     
                  To create new directory :

                          File f = new File("GCES") ;
                          f.mkdir(); 

     
     Constructors :

        - File f = new File ( String name ) ;
                // To represent resources in current working directory.

        - File f = new File ( "directory-name" , "fileName") ;

        - Fle f = new File ( File Sub directory , String name) ;

      Methods :

        - boolean exists() ;
        - boolean createNewFile() ;
        - boolean mkdir() ;
        - boolean isFile() ;
        - boolean isDirectory() ;
        - String[] list();
        - Long length();
        - boolean delete();
      

                                                  