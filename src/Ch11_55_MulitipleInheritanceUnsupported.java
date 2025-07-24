
public class Ch11_55_MulitipleInheritanceUnsupported {
    
    interface Phone{ // 1
        int model = 124;  // 2
        void Switchon();  // 2
        void Switchoff(); // 2
    }
    
    static class SmartPhone implements Phone{
        int model = 9011;   // Optional                         // 3
        public void Switchon(){                                 // 3
            System.out.println("Switching on the Phone...");
        }
        public void Switchoff(){                                // 3
            System.out.println("Switching off the Phone...");
        }
    }
    
    public static void main(String[] args) {
        
        /* Java doesn't allow - multiple inheritance DIRECTLY
         * But, INDIRECTLY it can be achieved using Interfaces. 
         
         * To understand , Inheritance gives a pre defined base to a class
         *             and Interface gives different method to class which can be implemented in it.
         * Ex. Smartphone being derived from a Cell Phone and has properties of GPS , Camera , Msc Player etc.
         * That is we can say Smartphone is a Cell Phone (Inheritance) with features of GPS , Camera etc. (Interfaces)
         * In short , Java defines both as Inheriting from one and having fuctions of many.
        
         Note :
         1. Interface is like a class with some sort of differences. (Line 4)
         2. Interfaces can only have method signature , properties and default method. (Line 5 , 6 & 7)
         3. Class implementing the interface need to define all of the method and fields are optional. (Line 11 , 12 & 15)
         4. Imp** We cannot create objects of Interface but reference can be made. (Discussed Later)
         5. And , methods of a Interface are public by default. 
        
         All of the above point are mentioned above in Code. */
        
        SmartPhone phn = new SmartPhone(); // 4
        phn.Switchon();
        phn.Switchoff();
        System.out.println("Model of the phone is: " + phn.model );
    }
    
}