
public class Ch11_56_DefaultMethods {
    
    interface Camera{
        void takePhoto();
        void recordvideo();
        
        private void modeSwitch(){
            System.out.println("Switching mode to Macro...");
        }
        default void Macrolens(){
            modeSwitch();
            System.out.println("Switcing to MacroLens 5mp");
        }
        
        default void TelePhoto(){
            System.out.println("Switching to Telephoto 24mp");
        }
    }
    
    interface Connections{
        String [] getnetworks(); // Instead of void we can use any other datatype just remember to return it while creating method.
        void Wifi(String wifiName);
        void MobileData(String Sim);
    }
    
    
    static class basicCellPhone {
        public void Calls(int phnNo){
            System.out.println("Ringing: " + phnNo);
        }
        
        public void Incoming(int phnNo2){
            System.out.println("Incoming Call: " + phnNo2);
        }
        public void playMP3 (String msc){
            System.out.println("Playing: " + msc);
        }
    }
        
        
     static class enhancedSmartPhone extends basicCellPhone implements Camera , Connections {
         public void OpenApp(String appName){
             System.out.println("Opening apps : " + appName);
         }
         
         public void takePhoto(){
             System.out.println("kchikk... Photo clicked");
         }
         
         public void recordvideo(){
             System.out.println("Ting... Video Started");
         }
         
         public void Wifi(String wifiName){
             System.out.println("\nConnecting to : " + wifiName);
         }
             
         public String [] getnetworks(){
             System.out.println("Getting list of Networks: ");
             String [] networklist = {"HomeWifi 5Ghz" , "HomeWifi 2.4Ghz" , "Vedant_5/2.4Ghz"};
             return networklist;
         }    
             
         public void MobileData(String Sim){
             System.out.println("Mobile Data on via sim: " + Sim);
         }    
         
         public void TelePhoto(){
             System.out.println("Switching to Telephoto 48mp");
         }
     }
        
    public static void main(String[] args) {
        
        // Deep diving into Interface using Phone's example
        enhancedSmartPhone phone = new enhancedSmartPhone();
        
        // Getting list of networks
        String [] array = phone.getnetworks();  // Creating it an array because the method runs an array.
        int no = 1;
        for (String element : array){
            System.out.println(no + ". " + element);
            no++;
        }
        phone.Wifi("Vedant_5/2.4Ghz"); System.out.println();
        
        phone.Macrolens(); System.out.println();
        
        phone.TelePhoto();
        
        // phone.modeSwitch(); throws error because modeSwitch is private.
        
        /* Default Methods:- 
           As we know, we have to overwrite all the methods of a interface in classes where interface is implemented.
           But if later , we add a new method to interface rather than overwriting the method in all the classes we can ,
           set it to default. That is it will be a standard for interface which can later be manipulated in class as we want 
           but would work without it too.
           
           Ex. Line 11 and implementation in Line 88 (without overwriting)
           Ex. With Overwriting - Line 16 , overwriting in Line 69 implementing in Line 90 (overwritten method will be printed)
        
           Note: Interfaces can have private methods too:
           Use - In Interfaces if a method's code is very big we can add the code in a private method and 
                 can be used within the interface in different methods. Private methods cannot be accesed in other classes or objects. (Line 92)
           Ex - created in Line 8 and used in 12 
         */
        
        /* In a nutshell : 
         * Default methods are methods that is bound to an interface which will contain information that can optionally be overwritten.
         * Interface can have private methods which can be implemented within the interface and not anywhere else.
         * These are made to shorten methods of an interface , avoiding manly errors.
         */
        
    }
    
}