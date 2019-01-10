Classes :
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
                                                  