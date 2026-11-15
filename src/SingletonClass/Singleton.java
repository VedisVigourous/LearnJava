package SingletonClass;

    /* A "singleton class" is one that restricts making of instance of a class to only one and not more than that

     * Singleton classes can be achieved by
       1. Making the constructor of the class as 'private'
       2. Making a single instance within the class
       3. Making a public static "getInstance()" method that can be used to access the instance!


       Why static ?
       - As the method is made within the class, and we need to access it and no external objects can be made we use static method!

       Note: Even if different objects are made they refer to a single instance that is being created withing the class */

public class Singleton {
    private Singleton(){
        // A private constructor creation
    }

    private static Singleton instance; // Creation of an in-class instance [single instance]

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();

            // Checking whether the instance is present or not so that multiple instance is not made!
        }

        return instance;
    }
}
