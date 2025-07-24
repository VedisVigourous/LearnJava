public class Ch13_71_MultiThreading {
    public static void main(String[] args) {
        System.out.println();

        /*  Multithreading and MultiProcessing bot are used to achieve multitasking.
            Some definitions -
            1. Multiuser - many users woking on a same system. Ex. Windows support for many user at lock screen.
            2. Multitasking - multiple people working on different system but on same server. (Ex. School group project , students work at their homes but for a single project)
            3. Multiprocessing - many processes taking place at once on a system. Ex. Different app at one device
            and lastly,
            4. Multithreading - multiple tasks taking place at a single process. Ex. Viewing and editing a pdf at a single browser tab.

            Note: Threads are lightweight than a Process. Obviously because, process contains multiple threads.
            Visual Representation -
                                                    Process
                                                     | | |
                                                    |  |  |
                                                   |   |   |
                                                  |    |    |
                                                 |     |     |
                                       Thread 1 |   Thread 2  | Thread 3

            Note: Threads are really fast and interact among them in a blink.

            Points to be noted -
            1. Threads use shared memory area.
            2. Threads allow you to execute a piece of code faster hence increasing productivity
            Ex. Word processor , it used more than one threads which contain different  tasks such as auto saving , word compilation etc. */


        /*  Flow of Control in Threads -
            Usually a class runs in a manner -
            Main method -> function 1 -> function 2 -> output

            Whereas using threads -
            We can simultaneously run all the three as -
            Main method + function 1 + function 2 -> output  */

        /* Ways to create a thread - (discussed in separate classes)
           1. Extending a thread class
           2. Implementing a runnable interface */

        /* In a nutshell -
           Process - Is like running a restaurant
           Threads - Is like the employees working in it for making a smoother experience and increasing productivity.
         */
    }
}
