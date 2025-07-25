public class Ch01_02_JavaLiterals {
    public static void main(String[] args) {
    boolean ans = true; //Only true/false accepted not True/False
    char Ans = 'Y'; //Character always in Single Quotes
    double d1 = 5.6; //Each Decimal is considered to be a double by default
    float f1 = 5.6f; //For double to be converted to float put f
    long l1 = 56666L; // for long put L no need to put in short but number should be short
    System.out.println("Is your answer correct");
    System.out.println(ans);
    System.out.println(Ans);
    System.out.println("Your Age?");
    System.out.println(d1);
    System.out.println(f1);
    System.out.println(l1);
    String name = "Vedant"; //Strings in "" quotes
    System.out.print(name);
    }
}

//Byte and Int does not require any char to be placed while
//For double - d or D
//For Float - f or F
//For long - l
//Note Println adds a line for next output and print lets the next output in same line
