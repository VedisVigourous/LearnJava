public class Ch02_10_IncrementDecrement {
    public static void main(String[] args) {
        int i = 50;     //++ is used to increment the value
        System.out.println(i++);  //(command prints 'i' then increment) i.e. prints:50 + 1
        System.out.println(i);  // print : 51
        System.out.println(++i); // incrementation on 51 , prints : 52
        System.out.println(i);  // prints : 52

        //Moreover
        System.out.println("*********");
        int y = 50;
        int y1 = y++; //incrementation takes place afterward (Predicted value: 50) and after incremation y = 51
        System.out.println("y1: " + y1);
        int y2 = ++y;//Incrementation takes before printing y (Predicted values: 52) here incremation takes place on y = 51
        System.out.println("y2: " + y2);

        //Similarly for decrement
        System.out.println("*********");
        int z = 50;
        System.out.println(z--); //(Predicted value : 50) // Decremented Value = 1
        System.out.println(z);   //(Predicted value : 49)
        System.out.println(--z); //(Predicted value : 48) // Decremented value = 2 from original (49-1)

        //Quiz
        int a = 7;
        int b = ++a * 8; // 7+1 * 8 = 64 (Predicted answer) //Follow precedence : ++,-- falls in logical category
        System.out.println("The Answer is: " + b);          //Precedence (++,--) > (*,/)

        //Incrementation on Character:
        char C = 'Y'; //Char in ''
        System.out.println("Incremented Character: " + ++C); //Predicted answer: Z
    }
}
