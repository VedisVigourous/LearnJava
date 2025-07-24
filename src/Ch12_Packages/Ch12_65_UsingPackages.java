// import java.util.Scanner; // (Imports only Scanner)
// import java.util.*; // (Imports the whole util folder)
//import LearnPkg.Ch12_65_Packages;

public class Ch12_65_UsingPackages {
    public static void main(String[] args) {
        
        /* Using Java Packages - 
        
        1. Can be used by - importing packages such as Scanner or Random etc. (Using example of scanner in this case)
           1.1 Now to use Scanner we have three ways -
           1.1.1 - Importing just Scanner pkg by - import.util.Scanner; (line 1)
           1.1.2 - Importing all pkg of Util by - import.util.*; (line 2)
           1.1.3 - or directly writing java.util.Scanner while creating object that is - 
                   Syntax - 
                   java.util.Scanner obj = new java.util.Scanner(); ] (line 19)  */
            
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        
        /* Using our own Packages - 
        
        2. First we will have to create one - 
           It is done by writing (package pkgName;)
           Once done we will need to import it to the file (here importing LearnPkg) and create an object of it
           Then we can run the file using JVM you will notice no errors. 
        
           Syntax - 
           import packageName.class; (Line 4)
           className obj = new className(); 
           * And then Access using JVM */
        
        //Ch12_65_Packages object = new Ch12_65_Packages();
        
        // On running this file using javac and Jvm no errors are being found that is 
        // We are succesfully able to import the class from LearnPkg.Samples
        
    }
    
}