class Student1 extends Thread{
    public Student1(String name){
        super(name);   // *** This is important as Thread has its own name to overwrite it you will need to access its constructor
    }

    public void run(){
        System.out.println("Name of the School is: Somerville");
    }
}

class LearningThread implements Runnable{
    public void run(){
        System.out.println("Thread's name is: " + Thread.currentThread().getName()); // Note (Thread.currentThread) works similar to 'this' keyword
        System.out.println("Thread is running...");
    }
}

public class Ch13_75_ThreadConstructors {
    public static void main(String[] args) {
        System.out.println();

        /* Constructors in thread gives unique identification to thread. Ex. name , id etc.
           Some common constructors are:
           1. (no parameters)
           2. (String name)
           3. (Runnable r)
           4. (runnable r , String name)
           ** Check more at: https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html  */

        /* Now to access the identities of a thread :
           There are methods allotted :
           1. .getId() - tells the unique ID of a thread
           2. .getName() - tells the name of thread
           3. .getPriority() - if multiple threads are present then it tells the priority of a thread etc. */

        /* Syntax -
           Just like a normal constructor, and must be public.  */

        Student1 object1 = new Student1("Vedant");
        System.out.println("Name of the Student is: " + object1.getName()); // tells the name of thread that we have overwritten
        object1.start();
        System.out.println("Student ID is: 2025/" + object1.getId()); // Get id prints the Thread ID

        //Similarly making other object to make the class look dynamic

        Student1 object2 = new Student1("Arnav");
        Student1 object3 = new Student1("Siddharth");

        System.out.println();

        System.out.println("Name of the Student is: " + object2.getName());
        object2.start();
        System.out.println("Student ID is: 2025/" + object2.getId());

        System.out.println();

        System.out.println("Name of the Student is: " + object3.getName());
        object3.start();
        System.out.println("Student ID is: 2025/" + object3.getId());

        System.out.println();
        System.out.println("******");
        System.out.println();

        // In the execution of program you will also notice concurrency due to threads implementation

        /* In addition, there is a (ThreadGroup group , String name) - it is used when there are similar threads all of them are then grouped together.
         * Benefit - all the threads can be called at once and can be stopped at once. */

        /* ** In lecture Practice - Usage of (runnable r , String name)
         * It is used when implementing a runnable interface , while creating object of interface the object of class is written
         * As , it invokes the run() method in class and in addition String name overrides the name of thread.

         * Syntax-
         * ClassName classObject = new ClassName();
           Thread threadObject = new Thread(classObject , name);
                * Here runnable r = classObject  */

        LearningThread learn = new LearningThread();
        Thread obj = new Thread(learn , "Vedant's Thread"); // It takes control of both run() and name
        obj.start();
    }
}

/* In a nutshell -
1. There are many types of constructors in threads which helps in giving unique identity to thread
2. Some allocated methods are used to access these identities Ex. .getName() , .getId() etc.
3. Imp - methods like (runnable r , String name ) are used to access to things together in a Thread
   3.1 Here these are run() method and giving a name to thread
   3.2 Execution syntax is important take a look at Line 79 - 80. */
