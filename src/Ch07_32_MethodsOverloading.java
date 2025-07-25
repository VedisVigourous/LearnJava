public class Ch7_32_MethodsOverloading {
    static void whatismysisname(){ //1st method
        System.out.println("My sister's name is Pihu!");
    }

    int add(int a , int b){ //2nd method
        return a+b;
    }

    static void change(int d){ //3rd method
        d = 100;
    }

    static void change2(int [] array){ //4th method
        array[2] = 89;
    }

    static void myself(){ // 5th method
        System.out.println("Good Morning , My name is Pihu");
        System.out.println("I am a girl");
    }

    static void myself(int age){ //6th method
        System.out.printf("My age is %d years old\n" , age);
    }
    public static void main(String[] args) {
        System.out.println(" ");

        // Note:
        /* Void return type:
    It means when a method does not return any data type, that is when we do not include any datatype in method syntax
    We use void to protect code from going into error.
    That is when we only want to perform a specific task rather than returning set of actions. Eg. Downloading,printing  */

        whatismysisname();

        // static : this is used to associate a method to a class , and not solely a single object
        // that is it is shared by all the objects.

        System.out.println(" ");

        // Object making
        Ch7_32_MethodsOverloading obj = new Ch7_32_MethodsOverloading();
        int c;
        c = obj.add(1,2);
        System.out.println("The sum of a and b is: " + c);

        System.out.println(" ");

        int [] sismarks = {99 , 100 , 64}; // Array to be used

        // Demonstrating that values of variables can't be changed using methods
        int e = 76;
        change(e);
        System.out.println("Value of e after running change method: " + e);
        // Value remains e : that is only a copy is sent to method and original value remains same.

        System.out.println(" ");

        // In case of arrays
        change2(sismarks);
        System.out.println("My sister's marks are: " + sismarks[0] + " " + sismarks[1] + " " + sismarks[2]);
        /* Explanation: since here sismarks is only a reference of array that is it's address , on pushing it
            into change2 , it only change it's reference from arrays to sismarks hence the code that goes into method is
            sismarks[2] = 89 , hence original values gets changed. */

        // In short - values of a variable does not change because copies are sent
        // Whereas in arrays its reference name is sent and the original value is altered.
        // Same goes for objects going to methods

        System.out.println(" ");
        
        // Method Overloading
        // It means different methods can have a same name but can equip different parameters.
        // Ex. meth() , meth(int a) , meth (int b) , meth(int c , int d)
        // example: 5th and 6th method
        myself();
        myself(8); // Argument are actual! 
        
        // Note changing datatype will cause error , only parameters work in method overloading.

    }
}
