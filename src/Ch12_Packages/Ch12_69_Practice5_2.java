import Ch12_Packages.Ch12_69_Practice5;

// Ans of Q3
class Accessing extends Ch12_69_Practice5 { //Subclass
    Accessing(){
        System.out.println(publicName);
        // System.out.println(defDob); // Will give error because dob is default
    }
}
public class Ch12_69_Practice5_2 {
    
    public static void main(String[] args) {
        Accessing object = new Accessing();
    }
    
}