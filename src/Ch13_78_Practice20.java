class Greetings1 extends Thread{
    public Greetings1(String name){
        super(name);
    }
    public void run(){
        int a = 0;
        while (a<5) {
            System.out.println("1. Good Morning, " + Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            a++;
        }
    }
}

class Greetings2 extends Thread{
    public void run(){
        int b = 0;
        while (b<5) {
            System.out.println("1. Welcome...");
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            b++;
        }
    }
}

class Priority extends Thread{
    public void run(){
        System.out.println("2. This is a thread with High Priority...");
    }
}

public class Ch13_78_Practice20 {
    public static void main(String[] args) {

        // Q1. Program to print "Good Morning" and "Welcome" continuously via Threads (bounding to 5)
        Greetings1 obj1 = new Greetings1("Vedant");
        Greetings2 obj2 = new Greetings2();
        obj1.start();
        obj2.start();

        // Q2. Usage of sleep() in Q1. to delay the execution by 200ms
        // ** Done

        // Q3. Demonstration of setPriority and getPriority
        Priority obj3 = new Priority();
        obj3.setPriority(Thread.MAX_PRIORITY);
        obj3.start();
        System.out.println("3. Priority of thread is: " + obj3.getPriority());

        // Q4. Getting state of a thread in java in Q3
        System.out.println("4. State of the thread is: " + obj3.getState());

        // Q5. How to get the reference of a current thread in java.
        // Ans. Already used in class - Greetings1 i.e. by using Thread.currentThread() - gives reference of the thread we are working on.
    }
}
