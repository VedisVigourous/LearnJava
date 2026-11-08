public class Ch08_39_3_StaticTheory {
    int age = 19;

    static void name(String name){
        System.out.print(name);
        greeting();
    }

    static void greeting(){ // Making it static to avoid error and making the code work!
        System.out.println("! Hello!!");
        // System.out.println(this.age);  // Gives error!
    }
    public static void main(String[] args) {
        Ch08_39_3_StaticTheory.name("Vedant");
    }
}


/* NOTE:
   1. Here, name being a static method allows only a static method greeting to be called in it
   2. If it had been, non - static member
   3. An instance must have been made first then the accessing could be done!

   =============================================================================================================================
   Static automatically assigns the method to the class and hence it could be accessed without explicitly creating an Instance!
   =============================================================================================================================

   ================================
    this keyword in static method
    ===============================
    -> This represents an object and static actually removing the need of an object doesn't allow 'this' keywords to operate in the method.

 */