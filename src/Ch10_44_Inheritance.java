class Base{ // Called Type
    int a;

    public int getA() {
        System.out.print("Printing A: ");
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public void printText(){
        System.out.println("I am learning Constructor!!");
    }
}

// Now since we have already prepared a class for a , we will inherit properties from it to make a class for b.
// We will not copy paste because then we will have to change each property manually taking a lot of time

class InheritingBase extends Base{ // Called SubType
    int b;

    public int getB() {
        System.out.print("Printing B: ");
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
public class Ch10_44_Inheritance {
    public static void main(String[] args) {
        System.out.println();

        // Inheritance - borrowing properties and methods from an existing class
        /* Syntax -
           class Inherited_Class_Name extends Old_Class_Name{
                New Properties
           }  */
        // Superclass -> Subclass

        // Just by setting the properties , it will inherit all the printing material etc from the base.

        InheritingBase pBase = new InheritingBase();
        pBase.setA(5);
        System.out.println(pBase.getA());
        System.out.println();

        // Even on making object of inherited class we can use commands of Base
        // Because the basics are made from the Base class

        // Important note: Even though you can access A from Inherited class , B cannot be accessed on Original class
        // Because inherited class will contain support for A but original won't for B

        pBase.setB(13);
        System.out.println(pBase.getB());
    }
}
