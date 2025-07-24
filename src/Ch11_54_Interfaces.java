
public class Ch11_54_Interfaces {
    
    static interface Bike{ // Two methods are being used in this interface that is you need to use each of them
        int A = 1308; // Can hold properies too.
        void speedUp(int Acc); 
        void speedDown(int Dec);
    }
    
    static interface Lights{
        public void brakeLight();
    }
    
    // Note - interface's methods must be public whike using in a class to avoid error
    
    static class Honda implements Bike , Lights{
        int speed = 60;
        
        Honda(){
            System.out.println("Initial speed is: " + this.speed);
        } 
        
        public void speedUp(int Acc){ //Using 1st method 
            speed = speed + Acc;
            System.out.println("\nSpeed after accelerating is: " + speed);
        }
        
        public void speedDown(int Dec){ // Using 2nd method
            speed = speed - Dec;
            System.out.println("\nSpeed after decelerating is: " + speed);
        }
        
        public void brakeLight(){
            System.out.println("Break light is on...");
        }
    }
    
    public static void main(String[] args) {
        
     /* Interface - Point which allows to system to meet and interact with each other
        In Java , Interface stands for related methods with empty bodies.
        That is , interface in Java contains basic methods without their direct implementation anywhere.
        
        Note: Interface can hold properties too.
        
        **** To be noted if implementing methods of interface in another class they must be set to public
        
        Note: If deriving a class from an Interface you need to use all of it's methods or set it abstract to prevent error. */
        
        Honda bike1 = new Honda();
        System.out.println("\nBike registration no. " + bike1.A); // Printing property of an Interface
        bike1.speedUp(10);
        bike1.speedDown(3);
        bike1.brakeLight();
        
        // Note - Properties of a Interfaces are non - manipulative that is cannot be changed after/
        
        
        
     /* Abstract class vs Interfaces 
      * A class can be inherited from an single Abstract class multiple inheritance is not allowed
      * Whereas interfaces allow you to create classed from multiple interfaces // Shown in Line 14
      * Moreover , a class can both extend and implement. Ex. class A extends B implements C{} */
      
        
     /* In a nutshell:
        1. Interfaces are almost similar to abstract class that is it sets standards that a class need to implement if using it.
        2. All methods of an Interface needs to be used to avoid error.
        3. Interface's method are public by default and they can hold properties too. 
        4. After implementing an interface , while using it's method in a class , they must be set public. */
    }
}