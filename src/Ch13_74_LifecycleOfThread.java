public class Ch13_74_LifecycleOfThread {
    public static void main(String[] args) {
        System.out.println();
        /* Just like humans - thread also has its own life cycle -
           It include stages:
           1. NEW (Get)
           2. RUNNABLE (Set)
           3. RUNNING (Go)
           4. NON-RUNNABLE
           5. TERMINATED (Finish) */

        /* In brief -
        New - It refers to the stage of creating objects but not executing it. (i.e. Start() method is not called)
        ** as soon as start() is called it chooses thread, which are created in the new stage.

        Runnable - It gives the thread a position such that the thread scheduler chooses the thread to execute.

        Running - After a thread is selected it comes in stage of running.

        Non-Runnable - These Thread are runnable but wait for the correct instance ( For ex. While accessing a site a pdf viewer only works when we click on it)

        Termination - When the run() method exit it is called terminated.   */

        /* ** To Understand better compare it how an athletics race is done that is
              NEW = GET || RUNNABLE = SET || RUNNING = GO || NOT-ELIGIBLE = NON-RUNNABLE || FINISH = TERMINATED */
    }
}
