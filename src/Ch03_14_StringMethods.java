public class Ch3_14_StringMethods {
    public static void main(String[] args) {
        String name = "Vedant";
        // Index:      012345
        System.out.println("Programmer's name is " + name);

        //Commonly used String Methods are (methods name is written in camelCaseConvention)
        //Note to search the method in camelCase u can write its initial, E.g. toLowerCase; tlc , toUpperCase; tuc

        // 0. name.contains(): Tells whether a string has a given word
        String statement = "I am doing great!";
        System.out.println("Does your msg contain great: " + statement.contains("great"));
        // 1. name.length():
        System.out.println("The length of the string is: " + name.length()); //Starts from 0 but counts each index

        // 2. name.toLowerCase():
        System.out.println("String in lower case is: " + name.toLowerCase());

        // 3. name.toUpperCase():
        System.out.println("String in Upper case is: " + name.toUpperCase());

        // 4. name.trim() : Reduce trailing Spaces
        String newstr = "           Vedant      "; //Doesn't delete Spaces in between consecutive strings
        String constr = "    My name is      Vedant    ";
        System.out.println("String without trailing spaces are: " + newstr.trim());
        System.out.println("Consecutive String: " + constr.trim());

        // 5. name.substring(Start,End): Tells where to start printing string from
        System.out.println("Custom starting index:" + name.substring(3));
        // Starts from 0 so , on 3rd index lies 'a' so , Ans: ant
        System.out.println("Nickname:" + name.substring(0,3)); //To type only Ved
        // 3rd index is where print ends (not included)

        // 6. name.relace('old char' , 'new char') //Replaces character in a string
        String N1 = "Yog";
        String N2 = "Vadant";
        System.out.println("Original String: " + N1);
        System.out.println("Replaces String is: " + N1.replace('o' , 'u'));
        //We can also replace Consecutive characters in a string
        System.out.println(name.replace("ad","ed"));

        // 7. name.startsWith() and name.endsWith(): Returns boolean
        System.out.println("Does your name starts with Ved: " + name.startsWith("Ved"));
        System.out.println("Does your name end with ant: " + name.endsWith("ant"));

        // 8. name.charAt(): Prints character at specified Index
        System.out.println("Character at 3rd index is:" + name.charAt(2)); //Starts from 0

        // 9. name.indexOf() : Tells the index where given string occurs
        // Example: in Vedant , "ed" occur at 1 index
        System.out.println("Index of 'ed' in Vedant: " + name.indexOf("ed")); //Tells the first index where the Str occurs
        //We can specify the starting point to find the Str from
        System.out.println("Index of 'a' in Vadant after 'd': " + N2.indexOf("a",2));
        //If a given char occurs multiple times we can get the index of last str by name.lastIndexOF('str' ,before index)
        System.out.println("The last 'a' occurs on index: " + N2.lastIndexOf('a',2)); //after d it's 1 index
        //lastIndexOf() goes from r to l (remember)

        // 10. name.equals('str'): Tells whether the string specified to an already existing string
        System.out.println("Does Vedant equals Vadant: " + name.equals("Vadant")); //Vedant does not equal to Vedant
        String namelowercase = "vedant";
        System.out.println("Ignoring lowerCase: " + namelowercase.equalsIgnoreCase("Vedant"));

        System.out.println("************");

        // Escape Sequence Characters
        // \n - new line , \t - tab , \' - single quote , \\ - backslash etc. like \" will give double quote
        System.out.println("I am Vedant \t I am learning Java");  //Enters the ESC at same index where written


    }
}
