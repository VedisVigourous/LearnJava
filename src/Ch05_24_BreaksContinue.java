public class Ch05_24_BreaksContinue {
    public static void main(String[] args) {
        // Breaks and continue in loops
        // Using in an infinite loop
        int i = 1;
        while (i > 0) {
            System.out.println("This is an infinite loop");
            i++; //Till here it is a code for infinite loop , adding if to use break
            if (i == 50) {
                System.out.println("Reached 50 hence breaking the loop! , " + " count = " + i);
                break;
            } // Hence break is used to break the loop even if the condition is true
            // And can be used with any type of loop
        }
        System.out.println("  ");

        //Continue is just opposite to break (Stepwise explanation in practice 10)
        // Rather than breaking the loop and going on to outer code , it skips outer code
        // Example:
        for (int i1 = 1; i1 <= 30; i1++) {
            if (i1 == 5) { // For 5 it will skip the further code and bounce back to loop
                System.out.println("Reached 5");
                continue;
            }
            System.out.println(i1);
            System.out.println("Printing numbers");
        }

        System.out.println("   ");

        // Same in while loop
        int f = 0;
        while (f <= 15) {
            f++; // If using continue make sure to write f before continue , else it will not be accounted
            if (f == 5) {
                System.out.println("Reached 5");
                continue;
            }
            System.out.println(f);
            System.out.println("Printing numbers");
        }
        System.out.println("   ");

        // Same for do while
        int y = 0;
        do {
            y++;
            if (y == 3) {
                System.out.println("Reached 3");
                continue;
            }
            System.out.println(y);
            System.out.println("Printing....");
        } while (y<=5);
    }// In short break , skips the loop and goes to outer code
    // And continue , skips the outer code and rebounds to loop
}

// Note 1 extra number is being printed in a while and do while because incrementation is done as soon as the number
// enters the loop , process the code step by step to understand better
