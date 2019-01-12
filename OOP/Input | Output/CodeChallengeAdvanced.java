
// Question is same as CodeChallenge with advanced solution .


import java.io.*;




class CodeChallengeAdvanced
{
    public static void main(String[] args) 
    {
        if(args.length == 2)
        {
            if(args[0].contains("/") || args[0].contains("\\") || args[0].equals("Desktop") || args[0].equals("desktop") )
            {
                String location ="/Users/macbookpro/" + args[0]  ;
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
                                     System.out.println("File already exists.");
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
                 System.out.println("Total numbers of files and folders in " + location + "are : "  + count);
                }
         
                else 
                {
                    System.out.println("Invalid Second Argument.");
                }

            }

            else
            {
                String location ="./" + args[0]  ;

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
                 System.out.println("Total numbers of files and folders in current location is : " + count);
                }
         
                else 
                {
                    System.out.println("Invalid Second Argument.");
                }

            }
        }

        else if(args.length == 1)
        {
            String location = "."  ;
            if(args[0].contains("-"))
            {
                if (args[0].equals("-s"))
                {
                 File file = new File(location) ;
                 File[] files = file.listFiles();
                 for(File f: files){
                     System.out.println(f.getName());
                 }
                }

                else if(args[0].equals("-co"))
                {
                 int count = 0;
                 File file = new File(location) ;
                 File[] files = file.listFiles();
               
                 for(File f: files)
                 {
                     count++;
                 }
                 System.out.println("Total numbers of files and folders in current location is : " + count);
                }

                else if(args[0].equals("-c"))
                {
                    System.out.println("You cannot create file without giving its name.");
                 
                }

                

            }
        }

        else 
        {
            System.out.println("Invalid Number of Arguments.");
        }
        
    }
}