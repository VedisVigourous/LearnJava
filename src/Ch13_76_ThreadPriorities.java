class Intercom extends Thread{
    public Intercom(String name){
        super(name);
    }
    public void run(){
        System.out.println("Person On the Door - " + this.getName());
    }
}

public class Ch13_76_ThreadPriorities {
    public static void main(String[] args) {
        System.out.println();
        /* In JVM, upon making multiple threads a queue is made on which of the threads will be executed in which order
           Ex. T1 > T2 > T3 so on...

           Now on our end , we can set the priorities of these thread-
           Note: Min_Priority    = 01
                 Normal_Priority = 05
                 Max_Priority    = 10

           Syntax -
           After making object -
           object.setPriority(int Value)
           1. For max priority    - Thread.MAX_PRIORITY
           2. For min priority    - Thread.MIN_PRIORITY
           3. For normal priority - Thread.NORM_PRIORITY */

        Intercom person1 = new Intercom("Brother 1");
        Intercom person2 = new Intercom("Brother 2");
        Intercom person3 = new Intercom("Brother 3");
        person1.start();
        person2.start();
        person3.start();

        // You will notice different threads getting executed at random order due to difference in their priority
        System.out.println("*******");

        // Now setting priorities
        System.out.println("Priorities set in Intercom-");

        Intercom person4 = new Intercom("Father - Max Priority");
        Intercom person5 = new Intercom("Mother - Max Priority");
        Intercom person6 = new Intercom("Delivery Boy");
        Intercom person7 = new Intercom("Sister - Min Priority");
        person4.setPriority(Thread.MAX_PRIORITY);
        person7.setPriority(Thread.MIN_PRIORITY);
        person5.setPriority(Thread.MAX_PRIORITY);
        person5.setPriority(6);
        person4.start();
        person5.start();
        person6.start();
        person7.start();

        // You will notice max - priority threads will be executed above than others at most of the time
        // And Min Priority will be almost at the end.

        /* ** Note depending on different situations of CPU these priority threads are executed.
              Ex. If CPU load is high you will notice min priorities being executed.  */
    }
}
