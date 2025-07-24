class InfiniteLoop1 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Name is: Vedant");
        }
    }
}

class InfiniteLoop2 extends Thread{
    public void run(){
        while (true){
            System.out.println("Birth Year: 2007");
        }
    }
}

public class Ch13_72_CreatingThreadExtension {
    public static void main(String[] args) {
        System.out.println();

        /* Concurrency vs Parallelism -
           1. Concurrency is handling many task at a same time but keeping focus at only one of the task.
           Ex. Making food and using phone at once but can only focus at one thing at a time.

           2. Parallelism is handling many task at a same time with each task running side by side.
           Ex. Two chefs making different dishes, here two dishes are made without removing focus from one.
         */

        /* 1. Creating a thread using extension or inheritance -
            Syntax -
            class Class_Name extends Thread {
            // Piece of code you want to write
            // * And to create method use name run() - should be public
            }

            To initiate the code -
            * rather than writing object.methodName(); we here use -
            object.start(); // It executes the run() method.
         */

        // Note - Now the code will run in concurrency - (creating an infinite loop to show that, the system give allotted time to two loops one by one i.e. concurrency)

        // Executing -
        InfiniteLoop1 obj1 = new InfiniteLoop1();
        InfiniteLoop2 obj2 = new InfiniteLoop2();
        obj1.start();
        obj2.start();

        // Notice that sometimes obj1 method is given time then obj2 is used. And if threading would have not been used first obj1 would have been executed then obj2.
        // Not only .start() there are many other - methods related to Threads. https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html (Check method summary)
    }
}

/* In a nutshell -
1. There are two ways to use threads , here the discussion is on Extension based threads
2. These follow concurrency method that is time is given separately to different threads
3. There are fixed syntax to access these threads refer Line 29 - 38
 */
