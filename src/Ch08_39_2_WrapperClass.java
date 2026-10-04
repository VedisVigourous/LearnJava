public class Ch08_39_2_WrapperClass {
    public static void main(String[] args) {

        /* Wrapper class is used to convert primitive data types into objects.
           - Since classes are made up of methods and properties, it allows the data type to be manipulated with the class's methods   */

        // Example of using wrapper class
        int num1 = 10;
        Integer num2 = Integer.valueOf(num1); // Convert int to Integer object
        System.out.println("Integer object: " + num2);

        /* num2 now allows multiple methods to be used on it, such as:
           - intValue() - returns the value of the Integer object as an int
           - compareTo() - compares two Integer objects
           - toString() - returns a string representation of the Integer object
        */
    }
}
