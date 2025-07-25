public class Ch01_01_Main {  //Class consists of different functions to be executed
    public static void main(String[] args) { //static void file() is the function to be executed
        System.out.println("Hello World");
        byte cod3; //variable - starts with data type followed by name

        //Program to add three numbers
        System.out.print("The sum of three numbers are:");
        int num1 = 13;
        int num2 = 3;
        int num3 = 12;
        int sum = num1 + num3 + num2;
        System.out.print(sum);
    }
}
//static - enables code to run without creating object (creates an independent function)
//Naming Conventions 1. Class- PascalConvention 2. function - camelCaseConvention

//Anatomy of a Java Code
// 1. Documentation Section - Suggested comments
// 2. Package Statement - Tells a class belongs to which package (Optional)
// 3. Import Statements - To take Input from users (optional)
// 4. Class Definitions - Naming of different classes (optional)
// 5. Main Method Class /n { /n Main Method Definition /n } (Essential - starting point of a Java Code)

//Data Types in Java 1. Primitive 2. Non-Primitive
//Primitive - int(4 bytes) , byte (-128 to 127) , char (2 bytes and no negative values) , float(4 bytes) , short (2bytes) , bool etc.
// 1byte = 8bits
// all value ranges from 2^bits-1 to (2^bits - 1) - 1.
