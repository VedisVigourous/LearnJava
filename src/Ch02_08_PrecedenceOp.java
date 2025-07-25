//BODMAS isn't followed
public class Ch02_08_PrecedenceOp {
    public static void main(String[] args) {
        //Precedence refers to the order of Operations to be carries out
        //Precedence of (+,-) < (*,/)

        //Associativity is the order of Calculations to be carried out:
        //Associativity of (*,/) is from left to right
        //        Example: 60/5 - 25*5
        //                 12 - 125
        //                 = -113
        int a = 60/5-25*5;  //Left to right
        int b = 60*5-25/5;  //Left to right
        System.out.println(a);
        System.out.println(b);

        //In short , if operators are of same precedence then associativity is taken into account
        //Order of Precedence : Logical > (*,/,%) > (+,-) > Comparison > Assignment
        //And Associativity is from left to right except - Logical , Assignment and Conditional

        //Quick Set of Questions
        //x-y/2
        int A = 5;
        int B = 2;
        int C = 15;
        int P1 = A - B / 2; // 1.(B/2) 2. A - (B/2) ... Predicted Answer = 4
        int P2 = B*B - (4*A*C) / (2*A); // 1.B² 2.(4AC) 3.(4AC/2A) 4. B² - (4AC/2A) ... Predicted Answer = 4-30 = -26
        System.out.println("P1: " + P1);
        System.out.println("P2: " + P2);

    }
}
