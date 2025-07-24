class antiVirus_scan extends Thread{
    public void run(){
        int scan =0;
        while (scan < 5) {
            System.out.println("Scanning the pc...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e); // usage of try-catch is using intelliJ idea
            }
            scan++;
        }
    }
}

// .sleep() method - it can be used to make a Thread sleep in between of executing in a specified time.
// It makes a code to be executed in long buffers and not in one go.

class antiVirus_result extends Thread{
    public void run(){
        System.out.println();
        System.out.println("!!! No threats found !!!");
    }
}

public class Ch13_77_ThreadMethods {
    public static void main(String[] args) {
        System.out.println();

        /* We know from the principles of thread - that all the created threads start together on the basis of cpu load.
           Now sometimes we want the thread to execute in an order i.e. T1 -> T2

           * To do so we use join() method
           Problem - While using join() it might give exception as the object we are calling might have been killed earlier due to cpu load.
           Solution - use try-catch method.
           * Now you should have basic knowledge of errors in Java in order to proceed with try - catch ... hence we will discuss it in next chapter.

           How try - catch works -
           1. try - it executes a code even if we know an error may be produced
           2. catch - it allows the JVM to ignore the specified error when executing the code.
           Hence, to use try-catch you need to know the error that can be produced and write it in catch statement.

           syntax -
           try {
           // Block of code
           }

           catch (typeError variable) {
           }   */

        antiVirus_scan sc = new antiVirus_scan();
        antiVirus_result res = new antiVirus_result();

         //Now if we run, sc and res .start() both will run together, and you will notice res.start() in middle on sc.start()
         //To make them run in order - using join()
         /*  sc.start();
             sc.join(); // but this show error as discussed earlier so to overcome this we use try-catch (commented out)
             Note: First the method should be started and then join is introduced. then new method is started.
             res.start();    */

        sc.start();
        try {
            sc.join();
        }
        catch (Exception error) { //- If any exception occurs while sc.join() is executing it's caught here. The error variable holds details of that issue.
            System.out.println(error); // Shows the error that is being caught
        }
        res.start();

        // In brief , instead of showing error while compiling, the catch() statement ignores the error and makes the code run until the error is found.
    }
}

// Bonus Fact - these methods are not developed by java and exists inside the OS itself.
// There are much more of methods - search on web for more.

/* Methods studied -
* .start() - executes a runnable
* .sleep() - includes buffer during execution
* .join()  - helps in adding order to run different threads
* .setPriority(int) - helps to add priority of execution of multiple threads ... and much more

* When on compilation you get an error that may be produced while running a piece of code, but it is not compulsory that it'll come -
  We use try-catch statement where - try: executed the piece of code which may give error
                                     catch: only on production of error displays it otherwise the code keeps running.  */
