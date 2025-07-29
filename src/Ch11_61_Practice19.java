public class Ch11_61_Practice19 {
    
    interface Connectable {
        void connectToWifi(String wifiName);
        void disconnectToWifi();
        
        default void checkConnectionStatus(){
            System.out.println("Checking network status...");
        }
    }
    
    interface Chargeable{
        void startCharging();
        void stopCharging();
        
        default int getBatteryLevel(){
            return 100;
        }
    }
    
    interface SmartDevice extends Connectable {
        void runDiagnostic();
    }
    
    abstract static class Device{
        private String brand;
        private String model;
        
        Device(String brand , String model){
            this.brand = brand;
            this.model = model;
        }
        
        abstract void powerOn();
        abstract void performFunction(String func);
        
        public void displayInfo(){
            System.out.println("Device com: " + this.brand);
            System.out.println("Device model: " + this.model);
        }
    }
    
    static class Smartphone079 extends Device implements SmartDevice , Chargeable  {
        int storageGB;
        
        Smartphone079(String brand , String model , int storage){
            super(brand , model);
            this.storageGB = storage;
        }
        
        public void runDiagnostic(){
            System.out.println("Running Diagnostics...");
        }
        
        public void displayInfo(){
            super.displayInfo();
            System.out.println("Storage in GB: " + this.storageGB);
        }
        
        @Override
        public void powerOn(){
            System.out.println("Device powering on...");
        }    
        @Override        
        public void performFunction(String func){
            System.out.println("Performing: " + func);
        }
        public void connectToWifi(String wifiName){
            System.out.println("Connecting to " + wifiName);
        }
            
        public void disconnectToWifi(){
            System.out.println("Dis-connecting to WIFI...");
        }
        
        public void startCharging(){
            System.out.println("Charging started...");
        }        
        
        public void stopCharging(){
            System.out.println("Charging stopped...");
        }
        @Override
        public int getBatteryLevel(){
            return 85;
        }
    }
    
    static class Laptop extends Device implements Connectable , Chargeable {
        double screenSizeInches;
        
        Laptop(String brand , String model , double size){
            super(brand , model);
            this.screenSizeInches = size;
        }
        
        public void displayInfo(){
            super.displayInfo();
            System.out.println("Screen size: " + this.screenSizeInches);
        }
        @Override 
        public void powerOn(){
            System.out.println("Laptop powering on...");
        }
        @Override
        public void performFunction(String func){
            System.out.println("Performing: " + func);
        }
        
        public void connectToWifi(String wifiName){
            System.out.println("Connecting to " + wifiName);
        }
            
        public void disconnectToWifi(){
            System.out.println("Dis-connecting to WIFI...");
        }
        
        public void startCharging(){
            System.out.println("Charging started...");
        }        
        
        public void stopCharging(){
            System.out.println("Charging stopped...");
        }
        @Override
        public void checkConnectionStatus(){
            System.out.println("Connection status: GOOD");
        }
    }
    
    public static void main(String[] args) {
        
        // In this practice code - 
        // Part1 - Abstract class and Basic Inheritance 
        // Part2 - Interfaces and Multiple Inheritance 
        // Part3 - Polymorphism with Interface and Abstract classes
        
        Smartphone079 onePlus = new Smartphone079("OnePlus" , "7T" , 512);
        Smartphone079 motorola = new Smartphone079("Motorola" , "Edge 60 Stylus" , 256);
        Laptop asus = new Laptop("Asus" , "X541UJ" , 14.0);
        Laptop lenovo = new Laptop("Lenovo" , "LOQ 15IRX9" , 15.6);
        
        // Accessing Device class (Polymorphism)
        System.out.println("** Class - Device:");
        Device [] devs = {onePlus , motorola , asus , lenovo};
        for (Device element1 : devs){
            element1.powerOn(); 
            element1.displayInfo();
            element1.performFunction("Flight Mode"); System.out.println();
        }
        
        System.out.println();
        
        // Accessing Connectabale interface (Polymorphism)
        System.out.println("** Interface - Connectables:");
        Connectable [] wifiDevices = {onePlus , lenovo};
        for (Connectable element2 : wifiDevices){
            element2.connectToWifi("MyHome_5Ghz");
            element2.checkConnectionStatus();
            element2.disconnectToWifi(); System.out.println();
        }
        
        System.out.println();
        
        // Calling specific method in Smartphone
        Chargeable battery = new Smartphone079("Asus" , "ROG Phone 5" , 1024);// Bound to Chargeable Interface no other methods allowed.
        System.out.println("Battery Level: " + battery.getBatteryLevel()); System.out.println(); System.out.println();
        
        // Inheritance in Interfaces
        motorola.runDiagnostic(); System.out.println();
        
        System.out.println("*** End ***");
    }
    
}