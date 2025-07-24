public class Ch2_12_Practice4 {
    public static void main(String[] args) {
        //Precedence Challenge:
        int x = 5;
        int result = x++ + --x * 2 - x--; // precedence (++,--)>(*,/)>(+,-)
        //now x++ = 5(+1) , --x =-1+6  and x-- =5(-1)
        // x++ + (4*2) - x-- = 6 + 8 - 4 , by associativity l to r = predicted value = 10
        System.out.println("ChallengeP Result: " + result);

        //Associativity Challenge:
        int a = 10;
        int b = 3;
        int c = 2;
        int res = a/b*c+a%b-c++; //Associativity: (++)>(*,/,%)>(+) , c++ = 2(+1)
        //a/b*c+a%b-2 :- 3*2+1-2 :- 6+1-2 = 7-2 = 5
        System.out.println("Answer Assoc:" + res);
        System.out.println("Value of c: " + c);

        //IncrementDecrement Problem
        int p = 8;
        int q = p++;  //8(+1)
        int r = ++p + q--;  //1+8 + 8(-1)
        System.out.println("p:" + p); //Ultimately incremented twice:10
        System.out.println("q:" + q); //8(+1) q holds = 8 then in r - value becomes 8-1 = 7 after execution so q=7
        System.out.println("r:" + r); //after q , p holds 9 so in r , first p = +1+9 = 10 and q was holding 8
        //after execution q also holds 8-1 = 7
        System.out.println("Ultimate value of q:" + q); // expected 7

        //Mixed Operators
        int num1 = 15;
        int num2 = 4;
        boolean flag = (num1 % num2 == 0) || (num1 / num2 > 3) && (num1 - num2 < 10);
        // (3==0) || (3>3) && (11<10) now precedence : &&>|| so (3==0) || false :- false (predicted answer)
        System.out.println("Answer is: " + flag);

        //Tricky increment
        int k = 2;
        int u = 2;
        k = k++ + k++ + k++; //++,-- has associativity r to l :- 2(+1) + 3(+1) + 4(+1) = k = 5 now adding , 2+3+4 = 9
        u = u++ + u++ + ++u; //++,-- has associativity r to l :- 2(+1) + 3(+1) + 1+4 = k = 5 now adding , 2+3+5 = 10
        System.out.println("k:" + k);
        System.out.println("u:" + u);

        //Mixed Operations;
        int az = 7;
        int ay = 2;
        double r1 = (double) az/ay+az*ay--; //az/ay+az*2(-1) = az/ay+az*2 = 3.5+14 = 17.5
        System.out.println(r1); //exp: 17.5
        System.out.println("ay:" + ay); //exp: 1

        //Precedence with Parenthesis:
        int m = 3;
        int n = 4;
        int res1 = m*n+n/m; //12+1 = 13
        int res2 = m*(n+n)/m; //3*(8)/3 = 8
        System.out.println("Res1:" + res1);
        System.out.println("Res2:" + res2);

        System.out.println("***************");
    }
}
