/*
WAP to Create file , show files and folders and count files and folders of given destination.
Be sure that to take two arguments through command line . First argument should be location and
second one should be -c for creating , -s to show and -co to count.

*/


import java.io.* ;



class CodeChallenge
{
    public static void main(String[] args) 
    {

       // String location ="\"" + "/Users/macbookpro/" + args[0] + "\"" ;
       String location ="/Users/macbookpro/" + args[0]  ;
      // System.out.println(location); //To check if location is correct or not.
    
       if(args[1].equals("-c"))
       {
            try
                {
                     File f = new File(location) ;
                     if(f.createNewFile())
                        {
                            System.out.println("File Created.");
                        }
                     else
                        {
                            System.out.println("File not Created");
                        }
                }
            catch(IOException e)
                {
                     System.out.println("Error Occured");
                }
       }

       else if (args[1].equals("-s"))
       {
        File file = new File(location) ;
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }
       }

       else if(args[1].equals("-co"))
       {
        int count = 0;
        File file = new File(location) ;
        File[] files = file.listFiles();
      
        for(File f: files)
        {
            count++;
        }
        System.out.println("Total numbers of files and folders are : " + count);
       }

       else 
       {
           System.out.println("Invalid Command.");
       }
         

    }
}
