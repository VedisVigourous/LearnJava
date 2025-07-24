
public class Ch11_57_InheritanceInInterfaces {
    
    interface Speaker{
        void FM(double channel);
        void Aux();
    }
    
    // Now if we want to make another interface that has Methods of Speaker we can extend it rather than creating new methods
    
    interface Speaker2 extends Speaker{ // Note interface can be extended on other and not implemented.
        void USB();
        void Bluetooth(String Pairer);
    }
    
    // Now to implement both of these we need to create a class bcz objects can't be made from an Interface
    
    static class Sony implements Speaker2{
        public void DolbyAtmos(){
            System.out.println("Experiencing Dolby surround...");
        }
        public void FM(double channel){
            System.out.println("Tuned to: " + channel);
        }
        
        public void Aux(){
            System.out.println("AUX mode connected");
        }
        
        public void USB(){
            System.out.println("USB connnected");
    }
        public void Bluetooth(String pairer){
            System.out.println("BT paired to: " + pairer);
        }
    }
        
    public static void main(String[] args) {
        
        // Since OOPs is based on DRY principle , Inheritance is introduced in Interfaces. 
        
        Sony homeTheatre = new Sony();
        homeTheatre.FM(93.5);
        homeTheatre.Aux();
        homeTheatre.USB();
        homeTheatre.Bluetooth("Nokia Lumia");
        homeTheatre.DolbyAtmos();
    }
    
}