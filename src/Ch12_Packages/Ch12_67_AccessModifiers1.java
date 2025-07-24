package LearnPkg;

public class Ch12_67_AccessModifiers1 {
    // Assuming this class is a briefcase-
    
    // Different access modifiers - 
    public int cash = 2000;
    protected int cards = 3;
    int Stamps = 6; // Default or NO modifier.
    private int documents = 5;
        
    // Accessing all of them within class-
    public void getBrief(){
        System.out.println("* Within Class - ");
        System.out.println("| [Public]    | Cash in Briefcase - " + cash);
        System.out.println("| [Protected] | Total Cards in Briefcase - " + cards);
        System.out.println("| [Default]   | Stamps avaialble in Briefcase - " + Stamps);
        System.out.println("| [Private]   | Documents in Briefcase - " + documents);
    }
    
    public static void main(String[] args) {
        
        /* Access modifiers as the name suggest - sets the accessiblity of different elements of a java code.
         * That is whether these elements either it is class , methods etc. be accessible on different codes.
         
         * Through a table showing where all these access modifiers are relevant - 
          
            |  Modifiers   | CLASS | PACKAGE | SUB-CLASS | WORLD |     * Nemonics - 'P'roudly 'P'racticing for 'D'ance 'P'erformance
            |* public      |   Y   |    Y    |     Y     |   Y   |     *          - 'C'ompetition 'P'ostponed 'S'uddenly for a 'W'hile.
            |* protected   |   Y   |    Y    |     Y     |   N   |      
            |* default(no) |   Y   |    Y    |     N     |   N   |     
            |* private     |   Y   |    N    |     N     |   N   |
        
         * Ex. Elaborates to - a protected element can be accessed within Class, Package and only sub-package and not anywhere else. */
        
         LearnPkg.Ch12_67_AccessModifiers1 obj = new LearnPkg.Ch12_67_AccessModifiers1();
         obj.getBrief();
        
        System.out.println();
        
        // Accessing within Package - 
        System.out.println("* Within Package - ");
        System.out.println("| [Public]    | Cash = " + obj.cash);
        System.out.println("| [Protected] | Cards = " + obj.cards );
        System.out.println("| [Default]   | Stamps = " + obj.Stamps);
//      System.out.println("| [Private]   | Documents = " + obj.documents);  //** Cannot be executed as pvt elements are in accessible within pkg.
        
         // **** Continued more in AccessModifiers2
    }
}