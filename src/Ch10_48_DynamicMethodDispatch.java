class car{
    public void typeCar(){
        System.out.println("ICE Cars");
    }
    public void engineOn(){
        System.out.println("Turning Engine On...");
    }
}

class electricCar extends car{
    public void typeCar(){
        System.out.println("Electric Cars");
    }
    public void motorOn(){
        System.out.println("Turning Motor On...");
    }
}
public class Ch10_48_DynamicMethodDispatch {

    /* Dynamic Method Dispatch refers to Runtime Polymorphism that is
       which method will run is decided in the runtime. */

    public static void main(String[] args) {
        System.out.println();

         car obj1 = new car();
         obj1.typeCar();
         // Allowed

        System.out.println("***");

         electricCar obj2 = new electricCar();
         obj2.typeCar();
         // Allowed

        System.out.println("***");
        System.out.println();

        // obj1.model1();

        // What about this?
        System.out.println("Now understanding Runtime Polymorphism");
        car newObj = new electricCar();
        // This means here , reference is of Superclass and object is from Subclass
        // electricCar newObj2 = new car(); // vice-versa is not possible , and gives an error

        /* For ease learn like, If an electric car is going on road we can refer it to car
           but if , simple car is going we cannot call it an Electric Car. */

        /* That is a reference can be taken from Superclass for making an object of Subclass,
           but vice-versa is not possible. */

        // What about running an overridden method?
        newObj.typeCar();
        // Ans - The class whose object is made is responsible for running it's overridden method.
        // This is called Runtime Polymorphism.

        System.out.println("***\n");
        System.out.println("Understanding reference and Object");
        /* Now since here we have referred out electric car to a simple car , we cannot say turn a car's motor on
           instead we say turn an electric car's motor on. */

        // On the same logic , the following syntax gives an error
        // newObj.motorOn(); // Gives an error , because we referred it to as car whereas
        newObj.engineOn(); // This would work
    }
}

/* In a nutshell:
   1. We can create an reference from Superclass and object of subclass but not vice-versa
   2. If overridden method is present , the class whose object is made is dominating
   3. But sole methods is run on reference basis , that is only Superclass's method is allowed to run. */
