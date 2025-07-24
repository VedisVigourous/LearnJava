// If there are multiple objects of a class and we want to access all of them at once we can use it using Arrays let's see it how :

public class Ch11_60_AccessingObjectsbyArrays {
    
    // Step1 - Creating a class
    static class BaseClass { 
        String userName;
        BaseClass(String name){
            this.userName = name;
        }
        void greetings(){
            System.out.println("Hello! " + this.userName);
        }
    }
    
    public static void main(String[] args) {
        // Step2 - creating objects
        BaseClass object10 = new BaseClass("Vedant");
        BaseClass object20 = new BaseClass("Mogambo");
        BaseClass object30 = new BaseClass("Sharry");
        
        // Step3 - creating an Array of type "Class"
        BaseClass [] array = {object10,object20,object30};
        
        //Step4 - accessing elements of array 
        for (BaseClass element : array){
            element.greetings();
        }
    }
}