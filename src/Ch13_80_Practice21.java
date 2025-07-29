class CountingTask implements Runnable{
    private String taskName;
    private int countLimit;

    public CountingTask(String taskName , int countLimit){
        this.taskName = taskName;
        this.countLimit = countLimit;
    }

    @Override
    public void run() {
        System.out.printf("%s has Started...\n" , this.taskName);
        for (int i = 1; i <= this.countLimit; i++){
            System.out.printf("%s: %d\n" , this.taskName , i);
            try{
                Thread.sleep(200);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            if (Thread.currentThread().isInterrupted()){
                System.out.println(this.taskName + ": Is interrupted! Exiting Thread...");
                return;
            }
        }
        System.out.printf("%s has finished !\n" , this.taskName);
    }
}

class PrimeNumberFinderThread extends Thread {
    private int startRange;
    private int endRange;
    int count;

    public PrimeNumberFinderThread(int startRange, int endRange) {
        this.startRange = startRange;
        this.endRange = endRange;
    }

    @Override
    public void run() {
        System.out.println("Prime finder has started... from " + this.startRange + " to " + this.endRange);
        for (int number = this.startRange; number <= this.endRange; number++ ){
            int divisorCount = 0;
            for (int divisor = 1; divisor <= number; divisor++){
                if (number % divisor == 0){
                    divisorCount++;
                }
                try {
                    Thread.sleep(1);
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
            if (divisorCount == 2){
                System.out.println("*" + number);
            }
        }
        System.out.println("Prime finder has stopped !");
    }
}

    public class Ch13_80_Practice21 {
        public static void main(String[] args) {
            System.out.println();

            // Q1. Thread Creation & Basic Lifecycle (Two Instances/Objects)
            CountingTask obj1 = new CountingTask("Spooling", 5);
            CountingTask obj2 = new CountingTask("Printing", 5);
            Thread ThObj1 = new Thread(obj1);
            Thread ThObj2 = new Thread(obj2);
                //Q1.1 Giving each thread a name and Starting each
                ThObj1.setName("Spooling Task");
                ThObj2.setName("Printing Task");
                System.out.println("States of Different Threads: ");
                System.out.println("State of Thread 1: " + ThObj1.getState());
                System.out.println("State of Thread 2: " + ThObj2.getState());

                System.out.println();

                ThObj1.setPriority(Thread.MIN_PRIORITY);
                ThObj2.setPriority(4);

                ThObj1.start();
                try {
                    ThObj1.join();
                }
                catch (InterruptedException e) {
                 throw new RuntimeException(e);
                }

                System.out.println();

                ThObj2.start();
                try {
                    ThObj2.join();
                }
                catch (InterruptedException e){
                    throw new RuntimeException(e);
                }

            System.out.println();

            // Q2. Extending a Thread (Creating 2 instances)
            PrimeNumberFinderThread primeNos1 = new PrimeNumberFinderThread(1,20);
            PrimeNumberFinderThread primeNos2 = new PrimeNumberFinderThread(20,45);

            System.out.println("States of Prime No. Threads: ");
            System.out.println("State of Prime Number Thread 1: " + primeNos1.getState());
            System.out.println("State of Prime Number Thread 2: " + primeNos2.getState());

            System.out.println();

            primeNos1.setPriority(7);
            primeNos2.setPriority(Thread.MAX_PRIORITY);

            primeNos1.start();
            System.out.println("Checking Prime NO.1 Thread - is executing?: " + primeNos1.isAlive());

            try {
                primeNos1.join();
            }
            catch (Exception error){
                throw new RuntimeException(error);
            }

            System.out.println();

            primeNos2.start();
            try {
                primeNos2.join();
            }
            catch (Exception error){
                throw new RuntimeException(error);
            }

            System.out.println();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println();

            // Q3.1 Printing States of each thread before starting
            // Ans - Done above - Note: Before executing threads all the threads must be in NEW state.

            // Q3.2 Adding a sleep method , in main method
            // Ans - Done Line - 87

            // Q3.3 Printing name and state of all the threads after execution
            System.out.println("Names of Thread - ");
            System.out.println("OBJECT 1 Thread Name - " + ThObj1.getName());
            System.out.println("OBJECT 2 Thread Name - " + ThObj2.getName());
            System.out.println("Prime NO.1 Thread Name - " + primeNos1.getName());
            System.out.println("Prime NO.2 Thread Name - " + primeNos2.getName());

            System.out.println();

            System.out.println("States of Thread after execution - ");
            System.out.println("State of Thread 1(executed): " + ThObj1.getState());
            System.out.println("State of Thread 2(executed): " + ThObj2.getState());
            System.out.println("State of Prime Number Thread 1(executed): " + primeNos1.getState());
            System.out.println("State of Prime Number Thread 2(executed): " + primeNos2.getState());

            System.out.println();

            // Q4. Setting Priorities of Threads created
            // Ans - Done , Line - 75 , 76 , 87 & 88

            // Q5. Addition of methods like .join , .interrupt etc.
            // Ans. 1. Adding join to make all the threads run one by one
            //      2. Use of .interrupt method - syntax in Line - 21
            //      3. isAlive() method to check whether a thread is terminated or currently executing. Line 119
            CountingTask myInterrupter = new CountingTask("Interrupted" , 10);
            Thread interruptibleCounter = new Thread(myInterrupter);
            interruptibleCounter.start();

            System.out.println("Thread interrupted!!");
            interruptibleCounter.interrupt();
            System.out.println(interruptibleCounter.getState());

            try {
                interruptibleCounter.join();
            }
            catch (Exception error){
                throw new RuntimeException(error);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            /* Note: Interrupt is better than .stop bcz , stop immeidately puts the thread to a halt which causes everything to remain as they were whereas
                    interrupt cleans up everything before terminating a thread i.e. no possible data leaks are observed. */

            System.out.println();
        }
    }

    // Extra - A daemon thread - it is a low priority thread in Java.

