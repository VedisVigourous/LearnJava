package AdvancedJava;

public class AdvJava_Ch18_19_MethodTags {

    /**
     *
     * @param args - Denotes Parameter and Argument
     */

    public static void main(String[] args) {
        /* Types:

        # description - (optional)

        1. @param - used to demonstrate the parameters used in the code's method
            Syntax: @param <parameter_name> - statement

        2. @return - used to display returning statements of a method in javadoc
            Syntax: @return - <message to be displayed>

        3. @throws - denotes the possible exception which could occur while compiling the code
            Syntax: @throws <Exception Type> - <Message to be displayed>

        4. @deprecated - used to denote that methods used may be deprecated
            Syntax: @deprecated <Message>
         */
    }
        // param - parameters that you want to show on the javadoc
        // args or any other statement is shown inside parameters heading.

        /* Output:
           Parameters:
           args - <statement>

           Result:
           <Statement>  */

        // Note: For usual code '/*' denotes comment
        // whereas /** refers comment for Javadoc

        // Example:

    /**
     * This is the blueprint of the Method
     * @param i - this is the first number to be added
     * @param j - this is the second number to be added
     * @return - Sum of two numbers
     * @throws Exception - if 'i' of 'j' is smaller than 0
     * @deprecated Use '+' instead!
     */

    // Just type /** and enter for (IntelliJ Idea)
    public int add(int i , int j) throws Exception{
        if (i < 0 || j <0 ){
            throw new Exception();
        }
        int sum = i + j;
        return sum;
    }
}
