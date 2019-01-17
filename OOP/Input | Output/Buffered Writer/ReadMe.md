
# Constructors 

1. BufferedWriter bw = new BufferedWriter("abc.txt") ; // Wrong ! Cannot communicate directly with file.
        BufferedWriter bw = new BufferedWriter(Writer w) ;

2. BufferedWriter bw = new BufferedWriter(Writer w, int buffersize) ;

