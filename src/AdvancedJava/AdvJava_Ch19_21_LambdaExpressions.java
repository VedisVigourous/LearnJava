package AdvancedJava;

@FunctionalInterface
interface announcements1{
    public void winner();
}

@FunctionalInterface
interface announcements2{
    public void loser();
}

@FunctionalInterface
interface announcements3{
    public void loser(int noOfTeams);
}

public class AdvJava_Ch19_21_LambdaExpressions {
    public static void main(String[] args) {
        System.out.println();

        /* Anonymous Classes: These are classes which can be made by not actually manually creating a class before but, anonymous classes
                              creation inside the main function using the implementation of an Interface first.
               Syntax:
               <interface_name> object = new <Class_to_be_created>{ * all the method inside the interface *};

               Benefits: IntelliJ Idea automatically create an anonymous class , so we just have to write a single line of code. */

        // Implementation : [ Note: These anonymous classes are made within the main() function ]

        announcements1 object = new announcements1() {
            @Override
            public void winner() {
                System.out.println("Congratulations Winners!!");
            }
        };

        // Now implementing the methods using the object created:
        object.winner(); System.out.println();

        // ************************************** //

        /* Lambda Expression: To use methods of an interface we conventionally used to create a class then an object.
                              This increases our code size and lines:
                              What if we can use the methods directly in main() method:

                  * To do so use: Lambda Expressions:
                    Syntax:
                    <interface_name> object = ()->{
                        // Block of Code //
                    };
                    object.<method_name>;

           ******

           It enhances the readability  of our code and reduce the size of our code.

           Note:: Can only be used with functional interface */

        announcements2 obj = ()->{
            System.out.println("Better Luck next time");
        };
           obj.loser();

        System.out.println();

        // Note if a : interface method has a parameter - define it within the parenthesis-() and then call the desired method.

        announcements3 obj2 = (noOfTeams)->{
            System.out.printf("No. of Teams losing are %d" , noOfTeams);
        };
        obj2.loser(3);
    }
}
