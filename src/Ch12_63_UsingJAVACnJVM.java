public class Ch12_63_UsingJAVACnJVM {
    
    public static void main(String[] args) {
        System.out.println("Hello World , I am compiling my code manually TODAY using \'JAVAC\'\nAnd Running it using JVM!");
        
        // Now using javac to compile this file 
        
        /* Steps - 
        1. open a terminal (powershell) in your file at the designated directory of code
        2. Syntax -
           javac Filename.java or more precisely javac -d . Filename.java (-d creates file to corresponding directory as in Pkg)
        3. it will automatically compile and create a class file in bytecode , at the same directory. */
        
        /* Now as we have studied earlier that using Java (JVM) we can run this class file:
         * Steps:
         1. In terminal , Syntax - 
            java Filename (note .class will give error only filename without extention is required)
            or more precisely java Folder/Filename
         2. See your code directly at the Terminal... */
        
        // Note: Even after deleting .java file u can run .class file using JVM
        
        // Note : If files are involved in a package then the execution differs , discussed later.
    }
}

/* In a nutshell - Syntax (precise)
 * javac -d . filename.java
 * java Folder/filename
  
 * if filename and path are not put then execution takes place  at the same or root directory
 */