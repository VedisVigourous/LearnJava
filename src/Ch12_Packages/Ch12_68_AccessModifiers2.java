class Briefcase extends LearnPkg.Ch12_67_AccessModifiers1 {
    // This acts as subclass 
    // That is by pre-requisite only public and protected will work on it
    void getQTY(){
        System.out.println("[Public] Cash = " + cash);
        System.out.println("[Protected] Cards = " + cards);
//      System.out.println("[Default] Stamps = " + Stamps); ** Gives error as it is not allowed in sub class , same with private
    }
}
public class Ch12_68_AccessModifiers2 {
    public static void main(String[] args) {
        Briefcase obj = new Briefcase();
            
         System.out.println("* Within Subclass - ");   
         obj.getQTY();
        
        System.out.println();
            
        // This class acts as world to other class     
        // Depicting that - only Public can be used within world 
        System.out.println("* Within World - ");
        System.out.println("[Public] - Cash = " + obj.cash);    
//      System.out.println("[Protected] - Cards = " + obj.cards); ** Will Give errors and similar case with Default and Private
    }
}

/* In a nutshell :
 * Access Modifiers tells the accessiblity of elements of a code
 * 4 Types - Public , Protected , Default and Private
 
 * Public - accessed even outside of code (using proper methods)
 * Protected  - cannot be shared with outside world
 * Default - remains within family that is class and package
 * Private - confidential codes that remains between class
 */