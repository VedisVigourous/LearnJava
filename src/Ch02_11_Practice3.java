import java.util.Scanner;
public class Ch02_11_Practice3 {
    public static void main(String[] args) {

        //Tricky Question:
        float a1 = 7/4 * 9/2; //Precedence (*,/) is same so Associativity is from left to right :
        // 7/4 = 1.75 * 4.5 = 7.878 (Predicted Answer)
        // but the answer above will be in integer as integral values are takes i.e.
        //7/4 = 1.75 = 1 * 9 = 9/2 = 4.5 but answer will be integer so = 4.0
        //float answer will be obtained if
        float b = 7/4f * 9/2f;
        System.out.println("Integral answer: " + a1);
        System.out.println("Float Answer: " + b);

        System.out.println("************");

        //Grade encrypt by adding 8
        char grdobt = 'A';
        grdobt = (char) (grdobt + 8);//but char + int = int to obtain grade we typecast by adding (char)
        System.out.println("Encrypted grade: " + grdobt);
        //Decrypting again
        grdobt = (char)(grdobt-8);
        System.out.println("Original Grade: " + grdobt);

        System.out.println("************");

        //Comparing Numbers:
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Your Integer: ");
        int num1 = num.nextInt();
        boolean compr = num1 > 13;
        System.out.println("Entered number is greater than 13: " + compr);

        System.out.println("************");

        //Writing Expression v² - u²/2as
        int v = 5;
        int u = 8;
        int a = 4;
        int s = 6;
        float exp = (float) (v*v - u*u)/(2*a*s);
        System.out.println("Expression Answer: " + exp);

        System.out.println("************");
        
        //Value of Expression:
        int x = 7;
        int a2 = 7*49/7+35/7; //Precedence (*,/)>(+,-) so 49+5 now from left to right = 54 (ass +,- is l to r)
        System.out.println("Value is:" + a2);
    }
}
