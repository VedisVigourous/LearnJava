
public class Ch11_53_AbstractClass {
    
    abstract static class Basic{
        abstract public void Greet();
        // Note : This abstract class just act as a heading for inherited class that lets all of them use it's abstract method 
        //        to override however they want.
    }
    
    static class English extends Basic{
        @Override
        public void Greet(){
            System.out.println("Hello!");
        }
    }
    
    static class Hindi extends Basic{
        @Override
        public void Greet(){
            System.out.println("नमस्ते!");
        }
    }
    
    // Also to be noted : If a class inherits an abstract clas it must do one of the follows
    //                    1. Either label it as an abstract class 
    //                    2. Or Override it's method to avoid error.
    // Ex.
    
    abstract class Wish extends Basic{ // Making it abstract to avoid error and above classes are overridden so they will also avoid giving an error
        public void NewGreet(){
            System.out.println("How are You?"); // It will give an error because neither the class is abstract nor it override Basic's method
        }                                       
    }    
    public static void main(String[] args) {
        
        /* Abstract means - something in existence without concrete/physical existence (Ex. Dreams) 
           Based on the same fact - 
           
           Abstract method - a method which exist in a class but does not have a proper implementation
           ** And a class that includes only abstract methods is known as an ABSTRACT CLASS ! 
           
           Ex. Dream as a whole is an abstract class and all the things you do in it is an abstract method */
        
        // Note a class if it contains an abstract method must be declared abstract or else it will cause error
        // whereas An abstract class must contain at least one abstract method and can also have concrete methods.
        
        // Basic obj3 = new Basic(); (Commented out to prevent errors)
        // It will throw an error bcz , for making objects we need a concrete class that is abstract class cannot have their objects
        
        English greetEng = new English();
        greetEng.Greet();
        
        System.out.println();
        
        Hindi greetHin = new Hindi();
        greetHin.Greet();
        
    }
}

/* In a nutshell -
   1. Abstract class is a standard set for other classes to inherit it or override it's method
   2. Abstract class must have an abstract method and can optionally have properties and Concrete methods. 
   3. Abstract class cannot have objects made directly you need a concrete class for making objects
   4. Rules for inheriting abstract class-
      a. Either the inherited class must be an abstract class or,
      b. It must have an @Overridden abstract method from the abstract class.
 */
