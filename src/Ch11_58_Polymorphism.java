
public class Ch11_58_Polymorphism {
    
    interface CellPhone{
        String [] availableContacts();
        default void call(String contactName){
            System.out.println("\tCalling: " + contactName);
        }
    }
    
    interface Camera{
        void takePhoto();
        void recordvideo();
    }
    
    interface MusicPlayer{
        String [] availableMusic();
        default void playMusic(String musicName){
            System.out.println("\tPlaying : " + musicName);
        }
    }
    
    
    static class newSmartPhone implements CellPhone , Camera , MusicPlayer {
        
        public String [] availableContacts(){
            System.out.println("Available Contacts are: ");
            String [] cont_list = {"Mom" , "Dad" , "Friend"};
            return cont_list;
        }
        
        public void takePhoto(){
            System.out.println("Kchikk... Photo clicked");
        }
        
        public void recordvideo(){
            System.out.println("Video Recording Started : 00:00:01");
        }
        
        public String [] availableMusic(){
            System.out.println("Available Music are: ");
            String [] musiclist = {"Levels" , "One Thousand Miles" , "Players"};
            return musiclist;
        }
    }
    
    
    public static void main(String[] args) {
        
     /* Polymorphism means - One thing in many forms. Ex a smartphone is 1. CellPhone
                                                                         2. Music Player
                                                                         3. Camera etc.
        
        Now if you want to access camera in smartphone , you'll access it and not Music Player 
        That is in order to access a single thing we can use Referencing.
        
        Referencing syntax- (dynamic dispatch method)
        Camera cam = new Phone(){  // Taken reference of a camera in an object - Phone (here).
        }  // Can only use Camera here.
        
        Referencing creates a restriction to a single method.
        */
        
        Camera cam = new newSmartPhone();
        cam.takePhoto(); System.out.println();
        cam.recordvideo(); System.out.println();
        
        // cam.playMusic("Players"); // Cannot do it bcz cam is restricted to Camera only.
        // To access others just create a method.
        
        MusicPlayer msc = new newSmartPhone();
        String [] arr = msc.availableMusic();
        for (String i : arr){
            System.out.println("* " + i);
        }
        msc.playMusic("Levels"); System.out.println();
        
        CellPhone call = new newSmartPhone();
        String [] arr2 = call.availableContacts();
        for (String j : arr2){
            System.out.println("* " + j);
        } 
        call.call("Mom");
        
        /* In a nutshell : 
         * Referencing helps to bound our object to a particular class or interface.
         * It helps in preventing manly error while accessing different methods.
         */
    }
}