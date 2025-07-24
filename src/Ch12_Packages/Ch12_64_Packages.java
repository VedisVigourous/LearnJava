package Ch12_Packages;
public class Ch12_64_Packages {
    
    public static void main(String[] args) {
        /* Packages - It is similar to folder that holds our file together in out systems.
         * Packages similarly hold different classes together.
         
         * Benefits-
           . Avoid name conflicts (that is two classes cannot have same name)
         
         * Types of Packages -
           1. Built in Java API - Those packages that we import Ex. Scanner , Random , String etc. (Found in lib folder in java jdk)
           2. User Defined (Custom Packages) - these can be written by ourselves. Ex. package pkgName;
         */
        
        
        /* Now to Create a package each file must contain - syntax 
         ~ package yourpackage; - this line at the very beginning of code
         ~ Creating two files namely - Ch12_67_1_SamplePkg1 and Ch12_67_2_SamplePkg2 to learn package in deep.
         ~ Package named - LearnPkg; 
        
         ~ And to create sub-package
         ~ Syntax: 
         ~ package PkgName.SubPkg
         * That is name followed by '.' is called sub - package
           // Note - Multiple sub-packages are allowed */
        
        
        /* Important - If we want to compile a file.java which is linked to a package using JAVAC
         * We can command it to create class file in a pkg folder , to do so - 
         
         * Syntax-
           javac -d directory file.java (this is followed) (-d automatically creates folder of corresponding pkg)
        
         * To be noted
         * For using same directory to compile we use 1- '. (period)' and to compile all files within directory we use 2- '*'
           i.e.
           1. javac -d . file.java ('.' represents same directory)
           2. javac -d . *.java ('*' represent all the files) */
        
        System.out.println("Hello Packages!");
    }
}

/* In a nutshell
1. Packages acts as folder which can even include sub-packages i.e. sub folders
2. Packages are of two types - java built in and custom made
3. Using javac we can automatically compile class files into designated packages
4. some notations - '.' - within dir and '*' all files in a directory
*/