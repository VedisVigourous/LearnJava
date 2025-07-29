
public class Ch11_59_Practice18 {
    
    abstract static class Pen{
        abstract void write(); // All methods of an abstract class are also abstract
        abstract void refill();
    } 
    static class FountainPen extends Pen{ // All methods must be overridden of an Abstract class
        void changeNib(){
            System.out.println("Time to change Nib");
        }
        @Override
        void write(){
            System.out.println("Writing now...");
        }    
        @Override
        void refill(){
            System.out.println("Time to refill ink...");
        }
    }
    
    abstract static class Monkey{
        abstract void jump();
        abstract void bite();
    }
    interface basicAnimal{
        void eat();
        void sleep();
    }
    static class Human extends Monkey implements basicAnimal{
        @Override
        void jump(){
            System.out.println("Jumping");
        }
        @Override
        void bite(){
            System.out.println("Biting");
        }
        public void eat(){                      // Interface methods are always public 
            System.out.println("Eating");
        }
        public void sleep(){
            System.out.println("Sleeping");
        }
    }
    
    abstract static class Telephone{
        abstract void ring(String contact);
        abstract void lift(String incoming);
        abstract void disconnect();
    }
    
    static class Smartphone80 extends Telephone{
        void openApp(String appName){
            System.out.println("Opening: " + appName);
        }
        void ring(String contact){
            System.out.println("Ringing " + contact);
        }
        void lift(String incoming){
            System.out.println("Bzzz... Incoming call: " + incoming);
        }
        void disconnect(){
            System.out.println("Diconnecting the call...");
        }
    }
    
    interface TvRemote{
        void powerOn();
        void channelUp();
        void channelDown();
    }
    
    interface SmartTvRemote extends TvRemote{
        void Netflix();
        void Youtube();
        void voiceSearch();
    }
    
    static class Tv implements TvRemote{
        public void powerOn(){
            System.out.println("TV is powering on...");
        }
        public void channelUp(){
            System.out.println("Channel +");
        }
        public void channelDown(){
            System.out.println("Channel -");
        }
    }
        
    
    public static void main(String[] args) {
        // Q1. Creating abstract class pen with methods write and refill.
        // Q2. Using class Pen to create a concrete class Fountain
        System.out.println("Q1 & Q2");
        FountainPen pen = new FountainPen();
        pen.changeNib();
        pen.write();
        
        System.out.println();
        
        // Q3. Create an abstract class monkey inherited my Human having methods of Interface BasicAnimal
        System.out.println("Q3");
        Human action = new Human();
        System.out.print("Human is now ");
        action.sleep();
        
        System.out.println();
        
        // Q4. Create an abstract class Telephone and create a class Smartphone then show Polymorphism
        System.out.println("Q4");
        Telephone phn = new Smartphone80(); // Polymorphism
        phn.ring("Bigg Boss");
        
        System.out.println();
        
        // Q5. Demonstrate polymorphism in Q3
        System.out.println("Q5");
        Monkey mon = new Human();
        System.out.print("Look! at the tree... There's a Monkey which is "); mon.jump();
        
        System.out.println();
        
        // Q6. Inheriting two interfaces (TvRemote and SmartTvRemote)
        // Q7. create Class which implement TvRemote
        System.out.println("Q6 & Q7");
        Tv tv = new Tv();
        tv.powerOn();
    }
    
}