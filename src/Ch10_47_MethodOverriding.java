class firstClass{
    int intA;
    public int firstMethod(){
        return 45;
    }
    public void secondMethod(){
        System.out.println("This is Second method of First Class !");
    }
}

class secondClass extends firstClass{
    @Override  // Fun Fact: This is known as Annotation used to locate, changes done in code and it doesn't prod error.
    // Note only works, if method is actually over ridden or else produces an error.
    public void secondMethod(){ // Over ridden method
        System.out.println("This is Second method of Second Class !");
    }
    public void thirdMethod(){
        System.out.println("This is third method of Second Class !");
    }
}
public class Ch10_47_MethodOverriding {
    public static void main(String[] args) {
        System.out.println();
        firstClass object1 = new firstClass();
        System.out.println("First Class starts here: ");
        object1.secondMethod();

        System.out.println(); // and

        secondClass object2 = new secondClass();
        System.out.println("Second class starts here: ");
        object2.secondMethod();

        /* Note: If here secondMethod() for secondClass was not created it would have used it from first because of
                 Inheritance. But here , due to method overriding it's implementation (msg printed) have changed. */

        object2.thirdMethod();

        /* What is Method Overriding?
           Imagine we want to create a method with same name but with different implementation of work
           in inherited class it can be done , and this is known as Method Overriding.
           Ex. Here , creating another secondMethod() but it prints Second method of second class  */

        /* Difference between Method Overloading and Method Overriding?
        Ans: In Method Overloading same method has different arguments in Same Class.
             Whereas in , Method Overriding , method with same name and same arguments serves for different classes. */

        // Note: If there are two overridden methods in inherited class the latest method will be executed upon calling.

        /* Very Important note: For overriding to occur these must satisfy:
           1. Works with inherited classes that is Types and SubTypes.
           2. Arguments of methods must be same and obviously name.
           3. Access Modifiers must be same.
           4. Datatype must be same.
         */

    }
}
