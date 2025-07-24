class NewClass{
    int a;
    NewClass(int a){
        this.a = a; // This here helps code to understand that we are working particularly on Class's property (here a)
        System.out.println("Value of a is: " + a);
    }

    public int getA() {
        return a;
    }

    public int returnOne(){
        return 1;
    }
}
class NewExtClass extends NewClass{
    int b;

    NewExtClass(int b){
        super(23);
        this.b = b;
        System.out.println("Value of b is: " + b);
    }

    public int getB() {
        return b;
    }
}
public class Ch10_46_This_and_Super {
    public static void main(String[] args) {
        NewExtClass myClass = new NewExtClass(212);

        // Using This - it acts as a reference , it gives a particular identity to 'a' (check line 6 for clarity)
        // Super is already discussed in Earlier program.
    }
}
