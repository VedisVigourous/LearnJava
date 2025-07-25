public class Ch02_07_Operators {
    public static void main(String[] args) {

        // Different Type of operators:
        //1. Arithmetic: +,-,*,/ (Modulo Operator) % ,++,--  (Doesn't work with booleans)
        //2. Assignment: = , (+= , *= etc.) (Performs arithmetic oper. and assigns new value to variable)
        //3. Comparison: == , > , < , >= , <= , != (not equal)    (Compares values)
        //4.Logical: && (and) , ||(or) , !      (Can be used to add different conditions in a single code)
        //Example:
        System.out.println(1<3 && 2<4);
        System.out.println(1<3 && 4>5); // Returns false if any of the condition is not true
        System.out.println(1<3 || 4>5); // Returns true if any of the one is true

        //5. Bitwise: & , | (Converts to binary digit and then carry on operations)
        //Example:
        // 11 (Stands for 3)
        //+10 (stands for 2)
        //=10 (1+1 = 1 and 0+1=0) (returns 2)
        System.out.println(2&3); //Will return 2

        //Modulo Operator - Prints remainder after Dividing two numbers

    }
}
