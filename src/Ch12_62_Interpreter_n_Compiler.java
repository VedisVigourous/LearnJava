
public class Ch12_62_Interpreter_n_Compiler {
    
    public static void main(String[] args) {
        
        /* Notes: 
           * Both Compiler and Interpreter acts as a translator which translates our given code to Machine Code.
           * Each machine has its own machine code , For ex. Windows will have different machine code as of Mac.
           * No Direct running of Windows machine code will be allowed on Mac and vice versa.
           * For Ex. Python Interpreter for mac and windows are different.
           
           * Interpreter - Translates code line by line to machine code.
           * Compiler - Scans the whole code at once and translates to machine code.
        
           * Interpreter vs Compiler - 
           1. For an Interpreted language you need an interpreter everytime to run the code
           1. Whereas for compiled language , once file is created exe. can be made and run without compiler.
           2. Interpreter runs the code until found error.
           2. Compiler as it scans whole file , doesn't run at all if an error is found.
           3. Interpreted Languages are generally considered easier than Compiled ones.
           4. Compiled languages are faster than Interpreted ones.
         */
        
        /* Talking Particularly about Java -
         * It is a Hybrid language i.e. both Interpreted and Compiled.
         * Developers wanted Java to be platform independent-
         * so they made it hybrid that is-
        
         * Java code are processed in two steps - [ code.java --> code.class --> run on Interpreter)
         1. Java file (ourCode.java) is first compiled using JAVAC (Java Compiler) to a Class File (ourCode.class)
         2. This class file is in the format of a bytecode.
         3. This bytecode can now be used on any Java Interpreter (JVM {here JAVA}) that is , it can be run on any machine now.
        
         * Java Slogan - WRITE ONCE RUN EVERYWHERE
        
        // Apps like IntelliJ idea , VS Code was doing both of these by itself.
        // To do these both steps on your own , use javac.exe and java.exe both on powershell , separately.
         */
        
        System.out.println("Steps of java file execution:\n\n* Using JAVAC - file is processed to Class file or bytecode.");
        System.out.println("* This Bytecode or class file is now platform independent , and can be run on any Machine.");
        System.out.println("* Vedant.java --> Vedant.class --> On interpreter!");
    }
}

/* In a nutshell : 
1. Both Interpreter and Compiler are translator which convert our codes to machine code
2. Interpreter converts each line step by step to machine code.
3. Compiler converts the whole code at once to machine code.
4. Java is a hybrid language using both compiler and interpreter. (1st Step - compiler and 2nd step - Interpreter)
5. Hence , Java is platform independent Language and can be used without source code anywhere. */