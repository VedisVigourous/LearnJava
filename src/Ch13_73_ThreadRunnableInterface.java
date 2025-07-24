class ShoeNike implements Runnable{
    public void run(){
        int i=0;
        while (i<=100) {
            System.out.println("Nike Shoes added...");
            i++;
        }
    }
}

class ShoeAdidas implements Runnable{
    public void run(){
        int i=0;
        while (i<=100) {
            System.out.println("Adidas Shoes added...");
            i++;
        }
    }
}

public class Ch13_73_ThreadRunnableInterface {
    public static void main(String[] args) {
        System.out.println();

        // Note - Runnable Interface also follows Concurrency

        /* Using Thread by Runnable Interface -
           syntax -
           class ClassName implements Runnable{
           method run(){} and other piece of code
           }

           // Note - When using Runnable Interface, run() method needs to be implemented as Runnable is abstract class
           //        and run() is abstract method. i.e. either the class must be abstract or all the abstract methods be implemented. */

        /* Now assume Runnable Interface to be a shoebox - That is to create a proper package you will need both shoes and box
           Here :
           Class = Shoe || Runnable Interface = Box

           That is you will need both of them to execute the program -
           Syntax-
           1. ClassName Class_Object = new ClassName();
           2. Thread Thread_Object = new Thread( Class_Object );
           ** ShoeBox Created
           3. Thread_Object.start();
           ** Both 1,2 and 3 required to run the program.

           // Since the Runnable here which is originally an Interface is running here it is called Runnable Interface Method.  */

        // ** Execution - (both class and Thread object required
        ShoeNike Nike = new ShoeNike(); // ShoeCreated
        Thread object1 = new Thread(Nike); // Placed in a box.

        ShoeAdidas Adidas = new ShoeAdidas();
        Thread object2 = new Thread(Adidas);

        object1.start();
        object2.start();

        // Notice some of the time is given to Class 1 and then 2 .
    }
}

/* In a nutshell -
1. This method includes running of a thread (here Runnable) along with classes
2. Since it is an interface all the methods need to be implemented.
   Ex. For runnable interface run() method needs to be implemented or else the class has to be declared abstract
3. It is also concurrent
4. We have to make a proper package refer to ShoeBox to understand better
5. Syntax from Line 27 to 31 and Execution (important) from Line 40 to 46. */
